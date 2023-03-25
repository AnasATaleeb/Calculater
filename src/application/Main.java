package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
	TextArea Result = new TextArea();

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.getIcons().add(new Image("calculator.png"));
			primaryStage.setTitle("CALCULATOR");
			BorderPane pane = new BorderPane();

			TextArea Expression = new TextArea();
			Expression.setPrefHeight(60);
//			Expression.setEditable(false);
			TextArea Postfix = new TextArea();
			Postfix.setEditable(false);
			Postfix.setPrefHeight(60);
			Result.setPrefHeight(30);
			Result.setEditable(false);

			VBox mix = new VBox(Expression, Postfix);
			mix.setAlignment(Pos.CENTER);
			Label l = new Label();
			l.setPrefWidth(300);

			GridPane g = new GridPane();
			g.add(l, 0, 0);
			g.add(mix, 0, 1);
			g.add(Result, 0, 2);
			g.setGridLinesVisible(true);
			g.setAlignment(Pos.CENTER);

			VBox v = new VBox(g);
			v.setAlignment(Pos.CENTER);
			v.setPadding(new Insets(10));

			/* Buttons */

			Button sin = new Button("sin");
			styleBlue(sin);
			sin.setPrefHeight(20);
			sin.setPrefWidth(40);
			sin.setEffect(new DropShadow());
			sin.setOnAction(e -> {
				Expression.setText(Expression.getText() + "sin");
			});

			Button cos = new Button("cos");
			styleBlue(cos);
			cos.setPrefHeight(20);
			cos.setPrefWidth(40);
			cos.setEffect(new DropShadow());
			cos.setOnAction(e -> {
				Expression.setText(Expression.getText() + "cos");
			});

			Button tan = new Button("tan");
			styleBlue(tan);
			tan.setPrefHeight(20);
			tan.setPrefWidth(40);
			tan.setEffect(new DropShadow());
			tan.setOnAction(e -> {
				Expression.setText(Expression.getText() + "tan");
			});

			Button openBraket = new Button("(");
			styleWhite(openBraket);
			openBraket.setPrefHeight(20);
			openBraket.setPrefWidth(40);
			openBraket.setEffect(new DropShadow());
			openBraket.setOnAction(e -> {
				Expression.setText(Expression.getText() + " ( ");
			});

			Button closeBraket = new Button(")");
			styleWhite(closeBraket);
			closeBraket.setPrefHeight(20);
			closeBraket.setPrefWidth(40);
			closeBraket.setEffect(new DropShadow());
			closeBraket.setOnAction(e -> {
				Expression.setText(Expression.getText() + " ) ");
			});

			Button fact = new Button("!");
			styleBlue(fact);
			fact.setPrefHeight(20);
			fact.setPrefWidth(40);
			fact.setEffect(new DropShadow());
			fact.setOnAction(e -> {
				Expression.setText(Expression.getText() + "!");
			});

			Button off = new Button("OFF");
			off.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;"
					+ "-fx-border-color: black;" + "-fx-font-weight: Bold;\n" + "-fx-background-color: #6495ED;"
					+ "-fx-font-size: 12;\n" + "-fx-font-family: Times New Roman;\n");

			off.setPrefHeight(20);
			off.setPrefWidth(40);
			off.setEffect(new DropShadow());

			off.setOnAction(e -> {

				Expression.setText("Close");

				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Expression.setText("");

			});

			HBox h = new HBox(5, sin, cos, tan, openBraket, closeBraket, fact, off);
			h.setAlignment(Pos.CENTER);

			Button pi = new Button("π");
			styleBlue(pi);
			pi.setPrefHeight(40);
			pi.setPrefWidth(40);
			pi.setEffect(new DropShadow());
			pi.setOnAction(e -> {
				Expression.setText(Expression.getText() + " π ");
			});

			Button exponents = new Button("yˣ");
			styleBlue(exponents);
			exponents.setPrefHeight(40);
			exponents.setPrefWidth(40);
			exponents.setEffect(new DropShadow());
			exponents.setOnAction(e -> {
				Expression.setText(Expression.getText() + " ^ ");
			});

			Button seven = new Button("7");
			styleBlack(seven);
			seven.setPrefHeight(40);
			seven.setPrefWidth(40);
			seven.setEffect(new DropShadow());
			seven.setOnAction(e -> {
				Expression.setText(Expression.getText() + "7");
			});

			Button eight = new Button("8");
			styleBlack(eight);
			eight.setPrefHeight(40);
			eight.setPrefWidth(40);
			eight.setEffect(new DropShadow());
			eight.setOnAction(e -> {
				Expression.setText(Expression.getText() + "8");
			});

			Button nine = new Button("9");
			styleBlack(nine);
			nine.setPrefHeight(40);
			nine.setPrefWidth(40);
			nine.setEffect(new DropShadow());
			nine.setOnAction(e -> {
				Expression.setText(Expression.getText() + "9");
			});

			Button Dividing = new Button("÷");

			Dividing.setPrefHeight(40);
			Dividing.setPrefWidth(40);
			Dividing.setEffect(new DropShadow());
			styleSilver(Dividing);
			Dividing.setOnAction(e -> {
				Expression.setText(Expression.getText() + " ÷ ");
			});

			Button Subtract = new Button("( - )");
			styleWhite(Subtract);
			Subtract.setPrefHeight(40);
			Subtract.setPrefWidth(40);
			Subtract.setEffect(new DropShadow());
			Subtract.setOnAction(e -> {
				Expression.setText(Expression.getText() + "-");
			});

			HBox h1 = new HBox(5, pi, exponents, seven, eight, nine, Dividing, Subtract);
			h1.setAlignment(Pos.CENTER);

			Button square = new Button("x²");
			styleBlue(square);
			square.setPrefHeight(40);
			square.setPrefWidth(40);
			square.setEffect(new DropShadow());
			square.setOnAction(e -> {
				Expression.setText(Expression.getText() + "²");
			});

			Button squareRoot = new Button("√x");
			styleBlue(squareRoot);
			squareRoot.setPrefHeight(40);
			squareRoot.setPrefWidth(40);
			squareRoot.setEffect(new DropShadow());
			squareRoot.setOnAction(e -> {
				Expression.setText(Expression.getText() + "√");
			});

			Button four = new Button("4");
			styleBlack(four);
			four.setPrefHeight(40);
			four.setPrefWidth(40);
			four.setEffect(new DropShadow());
			four.setOnAction(e -> {
				Expression.setText(Expression.getText() + "4");
			});

			Button five = new Button("5");
			styleBlack(five);
			five.setPrefHeight(40);
			five.setPrefWidth(40);
			five.setEffect(new DropShadow());
			five.setOnAction(e -> {
				Expression.setText(Expression.getText() + "5");
			});

			Button six = new Button("6");
			styleBlack(six);
			six.setPrefHeight(40);
			six.setPrefWidth(40);
			six.setEffect(new DropShadow());
			six.setOnAction(e -> {
				Expression.setText(Expression.getText() + "6");
			});

			Button multiple = new Button("×");
			styleSilver(multiple);
			multiple.setEffect(new DropShadow());
			multiple.setPrefHeight(40);
			multiple.setPrefWidth(40);
			multiple.setOnAction(e -> {
				Expression.setText(Expression.getText() + " × ");
			});

			Button CA = new Button("CA");
			styleRed(CA);
			CA.setPrefHeight(40);
			CA.setPrefWidth(40);
			CA.setEffect(new DropShadow());

			CA.setOnAction(e -> {
				Expression.setText("");
				Postfix.setText("");
				Result.setText("");
			});

			HBox h2 = new HBox(5, square, squareRoot, four, five, six, multiple, CA);
			h2.setAlignment(Pos.CENTER);

			Button exponential = new Button("eˣ");
			styleBlue(exponential);
			exponential.setPrefHeight(40);
			exponential.setPrefWidth(40);
			exponential.setEffect(new DropShadow());
			exponential.setOnAction(e -> {
				Expression.setText(Expression.getText() + "e ^ ");
			});

			Button naturalLogarithmic = new Button("LN");
			styleBlue(naturalLogarithmic);
			naturalLogarithmic.setPrefHeight(40);
			naturalLogarithmic.setPrefWidth(40);
			naturalLogarithmic.setEffect(new DropShadow());
			naturalLogarithmic.setOnAction(e -> {
				Expression.setText(Expression.getText() + "Ln");
			});

			Button one = new Button("1");
			styleBlack(one);
			one.setPrefHeight(40);
			one.setPrefWidth(40);
			one.setEffect(new DropShadow());
			one.setOnAction(e -> {
				Expression.setText(Expression.getText() + "1");
			});

			Button two = new Button("2");
			styleBlack(two);
			two.setPrefHeight(40);
			two.setPrefWidth(40);
			two.setEffect(new DropShadow());
			two.setOnAction(e -> {
				Expression.setText(Expression.getText() + "2");
			});

			Button three = new Button("3");
			styleBlack(three);
			three.setPrefHeight(40);
			three.setPrefWidth(40);
			three.setEffect(new DropShadow());
			three.setOnAction(e -> {
				Expression.setText(Expression.getText() + "3");
			});

			Button minus = new Button("-");
			minus.setPrefHeight(40);
			minus.setPrefWidth(40);
			minus.setEffect(new DropShadow());
			styleSilver(minus);
			minus.setOnAction(e -> {
//				if (!Expression.getText().isEmpty())
//					if (Expression.getText().charAt(Expression.getText().length() - 1) == ' '
//							|| Expression.getText().charAt(Expression.getText().length() - 1) == '+'
//							|| Expression.getText().charAt(Expression.getText().length() - 1) == '-') {
//						Expression.setText(Expression.getText().substring(0, Expression.getText().length() - 1));
//						Expression.setText(Expression.getText() + "-");
//					} else
//						Expression.setText(Expression.getText() + " - ");
//				else
				Expression.setText(Expression.getText() + " - ");
			});

			Button C = new Button("C");
			styleRed(C);
			C.setPrefHeight(40);
			C.setPrefWidth(40);
			C.setEffect(new DropShadow());
			C.setOnAction(e -> {
				int n = Expression.getText().lastIndexOf(" ");
				if (n != -1)
					Expression.setText(Expression.getText().substring(0, n));
				else
					Expression.setText("");
			});

			HBox h3 = new HBox(5, exponential, naturalLogarithmic, one, two, three, minus, C);
			h3.setAlignment(Pos.CENTER);

			Button logarithms = new Button("LOG");
			styleBlue(logarithms);
			logarithms.setPrefHeight(40);
			logarithms.setPrefWidth(40);
			logarithms.setEffect(new DropShadow());
			logarithms.setOnAction(e -> {
				Expression.setText(Expression.getText() + "Log");
			});

			Button oneDivX = new Button("1/x");
			styleBlue(oneDivX);
			oneDivX.setPrefHeight(40);
			oneDivX.setPrefWidth(40);
			oneDivX.setEffect(new DropShadow());
			oneDivX.setOnAction(e -> {
				Expression.setText(Expression.getText() + "( 1 / ");
			});

			Button zero = new Button("0");
			styleBlack(zero);
			zero.setPrefHeight(40);
			zero.setPrefWidth(40);
			zero.setEffect(new DropShadow());
			zero.setOnAction(e -> {
				Expression.setText(Expression.getText() + "0");
			});

			Button point = new Button(".");
			styleWhite(point);
			point.setPrefHeight(40);
			point.setPrefWidth(40);
			point.setEffect(new DropShadow());
			point.setOnAction(e -> {
				Expression.setText(Expression.getText() + ".");
			});

			Button mod = new Button("%");
			mod.setPrefHeight(40);
			mod.setPrefWidth(40);
			mod.setEffect(new DropShadow());
			styleSilver(mod);
			mod.setOnAction(e -> {
				Expression.setText(Expression.getText() + " % ");
			});

			Button plus = new Button("+");
			plus.setPrefHeight(40);
			plus.setPrefWidth(40);
			plus.setEffect(new DropShadow());
			styleSilver(plus);
			plus.setOnAction(e -> {
//				if (!Expression.getText().isEmpty()) {
//					if (Expression.getText().charAt(Expression.getText().length() - 1) == ' '
//							|| Expression.getText().charAt(Expression.getText().length() - 1) == '+'
//							|| Expression.getText().charAt(Expression.getText().length() - 1) == '-') {
//						Expression.setText(Expression.getText().substring(0, Expression.getText().length() - 1));
//						Expression.setText(Expression.getText() + "+");
//					} else
//						Expression.setText(Expression.getText() + " + ");
//				} else
				Expression.setText(Expression.getText() + " + ");
			});

			Button back = new Button("←");
			styleRed(back);
			back.setPrefHeight(40);
			back.setPrefWidth(40);
			back.setEffect(new DropShadow());
			back.setOnAction(e -> {
				String exxx = Expression.getText();
				exxx = exxx.substring(0, exxx.length() - 1);
				Expression.setText(exxx);
			});

			HBox h4 = new HBox(5, logarithms, oneDivX, zero, point, mod, plus, back);
			h4.setAlignment(Pos.CENTER);

			Button equal = new Button("=");
			equal.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;"
					+ "-fx-border-color: black;" + "-fx-font-weight: Bold;\n" + "-fx-background-color: #6495ED;"
					+ "-fx-font-size: 30;\n" + "-fx-font-family: Times New Roman;\n");

			equal.setPrefHeight(60);
			equal.setPrefWidth(310);
			equal.setEffect(new DropShadow());
			equal.setOnAction(e -> {
				try {
					String s = Expression.getText();
					if (!isBalanced(s)) {
						Postfix.setText("Error: Missing parentheses !");
						Result.setText("Error: Missing parentheses !");
					} else {
						if (s.contains("÷ 0")) {
							Postfix.setText("Error: Can not divide by zero!!.");
							Result.setText("Error: Can not divide by zero!!.");
							return;
						}
						if (s.contains("÷ %") || s.contains("sin %") || s.contains("cos %") || s.contains("tan %")
								|| s.contains("sin (  %") || s.contains("cos (  %") || s.contains("tan (  %")
								|| s.contains("×  %") || s.contains("÷  %") || s.contains("! %") || s.contains("% !")
								|| s.contains("Log %") || s.contains("Ln %") || s.contains("sin!") || s.contains("cos!")
								|| s.contains("tan!") || s.contains("sin (!") || s.contains("cos (!")
								|| s.contains("tan (!")) {
							Postfix.setText("Error: Wrong in operator!!.");
							Result.setText("Error: Wrong in operator!!.");
							return;
						}
						s = s.replaceAll("Log", "L");
						s = s.replaceAll("Ln", "l");
						s = s.replaceAll("×", " * ");
						s = s.replaceAll("sin", "s");
						s = s.replaceAll("cos", "c");
						s = s.replaceAll("tan", "t");
						s = s.replaceAll("÷", "/");
						s = s.replaceAll("²", " ^ 2");
						s = s.replaceAll("--", " +");
						s = s.replaceAll("-√", "-1 * √");
						s = s.replaceAll("-Log", "-1 * Log");
						s = s.replaceAll("-Ln", "-1 * Ln");
						s = s.replaceAll("-e", "-1 * e");
						s = s.replaceAll("-sin", "-1 * sin");
						s = s.replaceAll("-cos", "-1 * cos");
						s = s.replaceAll("-tan", "-1 * tan");
//						s = s.replaceAll("-+","-");
//						s = s.replaceAll("+-","-");
//						System.out.println("S: " + s);
						String po = toPostFix(s);
						String res = po;
						System.out.println("PO: " + po);
						po = po.replaceAll("L", "Log");
						po = po.replaceAll("l", "Ln");
						po = po.replaceAll(" s", " sin");
						po = po.replaceAll(" c", " cos");
						po = po.replaceAll(" t", " tan");
						po = po.replaceAll("/", "÷");
						Postfix.setText(po);
						res = res.replaceAll("π", "3.1415926535897932384626433832795 ");
						res = res.replaceAll("e", "2.7182818284590452353602874713527 ");
						Result.setText(evaluate(res) + "");
					}
				} catch (Exception exsp) {
					Result.setText("Error In Equation!");
				}
			});

			VBox v1 = new VBox(10, h, h1, h2, h3, h4, equal);
			v1.setAlignment(Pos.CENTER);

			VBox v2 = new VBox(20, v, v1);
			v2.setAlignment(Pos.CENTER);
			v2.setStyle("-fx-border-color: black;" + "-fx-border-width: 2;");
			v2.setPadding(new Insets(15));

			pane.setCenter(v2);
			pane.setStyle("-fx-background-color: #A9A9A9");
			Scene scene = new Scene(pane, 350, 550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double evaluate(String s) {
		CursorStack<String> stack = new CursorStack<>();
		String[] tokens = s.split(" ");

		double result;
		for (int i = 0; i < tokens.length; i++)
			if (!tokens[i].equals("") && tokens[i] != null)
				switch (tokens[i]) {
				case "+":
					result = Double.parseDouble((String) stack.pop()) + Double.parseDouble((String) stack.pop());
					stack.push(Double.toString(result));
					break;
				case "-":
					result = -Double.parseDouble((String) stack.pop()) + Double.parseDouble((String) stack.pop());
					stack.push(Double.toString(result));
					break;
				case "/":
					double a1 = Double.parseDouble((String) stack.pop());
					double a2 = Double.parseDouble((String) stack.pop());
					if (a1 != 0) {
						result = (a2 / a1);
						stack.push(Double.toString(result));
					} else {
						Result.setText("Error: Can not divide by 0 !!");
					}
					break;
				case "*":
					result = Double.parseDouble((String) stack.pop()) * Double.parseDouble((String) stack.pop());
					stack.push(Double.toString(result));
					break;
				case "^":
					double a4 = Double.parseDouble((String) stack.pop());
					double a5 = Double.parseDouble((String) stack.pop());
					result = Math.pow(a5, a4);
					stack.push(Double.toString(result));
					break;
				case "L":
					result = Math.log10(Double.parseDouble((String) stack.pop()));
					stack.push(Double.toString(result));
					break;
				case "l":
					result = Math.log(Double.parseDouble((String) stack.pop()));
					stack.push(Double.toString(result));
					break;
				case "s":
					result = Math.sin(Math.toRadians(Double.parseDouble((String) stack.pop())));
					stack.push(Double.toString(result));
					break;
				case "c":
					result = Math.cos(Math.toRadians(Double.parseDouble((String) stack.pop())));
					stack.push(Double.toString(result));
					break;
				case "t":
					result = Math.tan(Math.toRadians(Double.parseDouble((String) stack.pop())));
					stack.push(Double.toString(result));
					break;
				case "!":
					try {
						result = factorial(Integer.parseInt((String) stack.pop()));
						stack.push(Double.toString(result));
						break;
					} catch (Exception e) {
						Result.setText("Error: Can not get factorial to double number.");
					}
				case "√":
					result = Math.sqrt(Double.parseDouble((String) stack.pop()));
					stack.push(Double.toString(result));
					break;
				case "%":
					double a6 = Double.parseDouble((String) stack.pop());
					double a7 = Double.parseDouble((String) stack.pop());
					result = (a7 % a6);
					stack.push(Double.toString(result));
					break;
				default:
					stack.push(tokens[i]);
				}
		return result = Double.parseDouble((String) stack.pop());

	}

	private long factorial(int n) {
		long[] result = new long[1000];
		if (n >= 0) {
			result[0] = 1;
			for (int i = 1; i <= n; ++i) {
				result[i] = i * result[i - 1];
			}
			return result[n];
		} else
			return 0;
	}

	private static boolean isBalanced(String expression) {
		char[] chars = expression.toCharArray();
		CursorStack<Character> stack = new CursorStack<>();
		for (char c : chars) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (c == ')' && top != '(') {
					return false;
				} else if (c == '}' && top != '{') {
					return false;
				} else if (c == ']' && top != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private String toPostFix(String infix) {
		CursorStack<Character> operatorStack = new CursorStack<Character>();
		String postfix = "";
		for (int j = 0; j < infix.length(); j++) {
			char ch = infix.charAt(j);
			switch (ch) {
			case '.':
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'π':
			case 'e':
				if (j < infix.length() - 1 && infix.charAt(j + 1) == ' ')
					postfix += ch + " ";
				else
					postfix += ch;
				break;
			case '+':
			case '-':
				if (infix.charAt(j + 1) != ' ') {
					if (j < infix.length() - 1 && infix.charAt(j + 1) == ' ')
						postfix += ch + " ";
					else
						postfix += ch;
				} else {
					while (!operatorStack.isEmpty() && (predence(ch) <= predence(operatorStack.peek()))) {
						postfix += " " + operatorStack.pop();
					}
					postfix += " ";
					operatorStack.push(ch);
				}
				break;

			case '^':
			case 'L':
			case 'l':
			case '!':
			case '√':
				operatorStack.push(ch);
				break;
			case 'c':
			case 't':
			case 's':
			case '%':
			case '*':
			case '/':
				while (!operatorStack.isEmpty() && (predence(ch) <= predence(operatorStack.peek()))) {
					postfix += " " + operatorStack.pop();
				}
				postfix += " ";
				operatorStack.push(ch);
				break;
			case '(':
				operatorStack.push(ch);
				break;
			case ')':
				char topOperator = operatorStack.pop();
				while (topOperator != '(') {
					postfix += " " + topOperator;
					topOperator = operatorStack.pop();
				}
				break;
			default:
				break;
			}
		}
		while (!operatorStack.isEmpty()) {
			char topOperator = operatorStack.pop();
			postfix += " " + topOperator;
		}
		return postfix;
	}

	private int predence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '%':
		case '/':
			return 2;
		case 'π':
		case 'e':
		case '^':
		case 'L': // Log
		case 'l': // Ln
		case '!':
		case '√':
			return 3;
		case 't': // tan
		case 'c': // cos
		case 's': // sin
			return 4;
		}
		return 0;
	}

	private void styleSilver(Node n) {
		n.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;" + "-fx-border-color: black;"
				+ "-fx-background-color: #A9A9A9;" + "-fx-font-size: 15;\n" + "-fx-font-weight: Bold;\n"
				+ "-fx-font-family: Times New Roman;\n");
	}

	private void styleBlue(Node n) {
		n.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;" + "-fx-border-color: black;"
				+ "-fx-font-weight: Bold;\n" + "-fx-background-color: #94d3f5;" + "-fx-font-size: 11;\n"
				+ "-fx-font-family: Times New Roman;\n");
	}

	private void styleBlack(Node n) {
		n.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;" + "-fx-border-color: black;"
				+ "-fx-font-weight: Bold;\n" + "-fx-background-color: #545454;" + "-fx-font-size: 18;\n"
				+ "-fx-font-family: Times New Roman;\n" + "-fx-text-fill: white;");
	}

	private void styleWhite(Node n) {
		n.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;" + "-fx-border-color: black;"
				+ "-fx-background-color: white;" + "-fx-font-size: 12;\n" + "-fx-font-weight: Bold;\n"
				+ "-fx-font-family: Times New Roman;\n");
	}

	private void styleRed(Node n) {
		n.setStyle("-fx-background-radius: 7 7 7 7;\n" + "-fx-border-radius: 7 7 7 7;" + "-fx-border-color: black;"
				+ "-fx-font-weight: Bold;\n" + "-fx-background-color: #c67575;" + "-fx-font-size: 14;\n"
				+ "-fx-font-family: Times New Roman;\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
