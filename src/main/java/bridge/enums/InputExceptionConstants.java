package bridge.enums;

public enum InputExceptionConstants {
    ERROR("[ERROR]"),
    NONE_NUMERIC("입력이 숫자가 아닙니다."),
    BRIDGE_RANGE("다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    ;
    private final String message;

    private InputExceptionConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
