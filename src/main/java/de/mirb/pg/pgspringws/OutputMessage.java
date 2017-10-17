package de.mirb.pg.pgspringws;

public class OutputMessage {
  final String from;
  final String text;
  final String time;

  public OutputMessage(String from, String text, String time) {
    this.from = from;
    this.text = text;
    this.time = time;
  }

  public String getFrom() {
    return from;
  }

  public String getText() {
    return text;
  }

  public String getTime() {
    return time;
  }
}
