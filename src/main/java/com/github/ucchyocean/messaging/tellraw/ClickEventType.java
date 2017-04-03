/*
 * @author     ucchy
 * @license    LGPLv3
 * @copyright  Copyright ucchy 2015
 */
package com.github.ucchyocean.messaging.tellraw;

/**
 * クリックイベント
 * @author ucchy
 */
public enum ClickEventType {

    /** コマンドの実行 */
    RUN_COMMAND("run_command"),

    /** コマンドの提示 */
    SUGGEST_COMMAND("suggest_command"),

    /** リンク先へ飛ぶ */
    OPEN_URL("open_url"),

    /** 指定されたファイルを開く */
    OPEN_FILE("open_file"),

    /** twitchユーザーの情報を開く */
    TWITCH_USER_INFO("twitch_user_info");

    private String text;

    /**
     * コンストラクタ
     * @param text
     */
    private ClickEventType(String text) {
        this.text = text;
    }

    /**
     * 文字列表現を返す
     * @see java.lang.Enum#toString()
     */
    public String toString() {
        return text;
    }
}
