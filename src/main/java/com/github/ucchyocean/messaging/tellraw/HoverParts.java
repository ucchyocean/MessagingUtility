package com.github.ucchyocean.messaging.tellraw;

import org.bukkit.ChatColor;

/**
 * ホバーパーツ
 * @author ucchy
 */
public class HoverParts {

    private String text;
    private ChatColor color;
    private HoverActionType type;

    /**
     * コンストラクタ
     * @param text テキスト
     */
    public HoverParts(String text) {
        this(text, HoverActionType.SHOW_TEXT, null);
    }

    /**
     * コンストラクタ
     * @param text テキスト
     * @param type ホバーの種類
     */
    public HoverParts(String text, HoverActionType type) {
        this(text, type, null);
    }

    /**
     * コンストラクタ
     * @param text テキスト
     * @param color 色
     */
    public HoverParts(String text, ChatColor color) {
        this(text, HoverActionType.SHOW_TEXT, color);
    }

    /**
     * コンストラクタ
     * @param text テキスト
     * @param type ホバーの種類
     * @param color 色
     */
    public HoverParts(String text, HoverActionType type, ChatColor color) {
        this.text = text;
        this.type = type;
        this.color = color;
    }

    /**
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return color
     */
    public ChatColor getColor() {
        return color;
    }

    /**
     * @param color color
     */
    public void setColor(ChatColor color) {
        this.color = color;
    }

    /**
     * @return type
     */
    public HoverActionType getType() {
        return type;
    }

    /**
     * @param type type
     */
    public void setType(HoverActionType type) {
        this.type = type;
    }
}
