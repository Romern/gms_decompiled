package p000;

/* renamed from: bmld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmld implements bxvp {
    UI_NO_CAMERA_INPUT(0),
    UI_SMALL_CAMERA_ICON(1),
    UI_SMALL_CAMERA_ICON_WITH_KEYBOARD_HINT(2),
    UI_LARGE_CAMERA_ICON(3),
    UI_LAUNCH_WITH_CAMERA(4),
    UI_KEYBOARD_HINT_ONLY(5),
    UI_CARD_NUMBER_DROP_DOWN(6),
    UI_CARD_NUMBER_DROP_DOWN_V2(11),
    UI_BUTTON_BELOW_CARD_NUMBER(7),
    UI_BUTTON_ON_CARD_LAYOUT(8),
    UI_BANNER_BEHIND_CARD_LAYOUT(9),
    UI_EMBEDDED_CAMERA(10),
    UI_LAUNCH_WITH_CAMERA_TOLERANT_CARD_DETECTOR(12),
    UI_ASSISTIVE_CHIP_BUTTON(13);
    

    /* renamed from: o */
    public final int f129927o;

    private bmld(int i) {
        this.f129927o = i;
    }

    /* renamed from: a */
    public static bmld m108138a(int i) {
        switch (i) {
            case 0:
                return UI_NO_CAMERA_INPUT;
            case 1:
                return UI_SMALL_CAMERA_ICON;
            case 2:
                return UI_SMALL_CAMERA_ICON_WITH_KEYBOARD_HINT;
            case 3:
                return UI_LARGE_CAMERA_ICON;
            case 4:
                return UI_LAUNCH_WITH_CAMERA;
            case 5:
                return UI_KEYBOARD_HINT_ONLY;
            case 6:
                return UI_CARD_NUMBER_DROP_DOWN;
            case 7:
                return UI_BUTTON_BELOW_CARD_NUMBER;
            case 8:
                return UI_BUTTON_ON_CARD_LAYOUT;
            case 9:
                return UI_BANNER_BEHIND_CARD_LAYOUT;
            case 10:
                return UI_EMBEDDED_CAMERA;
            case 11:
                return UI_CARD_NUMBER_DROP_DOWN_V2;
            case 12:
                return UI_LAUNCH_WITH_CAMERA_TOLERANT_CARD_DETECTOR;
            case 13:
                return UI_ASSISTIVE_CHIP_BUTTON;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m108139b() {
        return bmlc.f129911a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129927o;
    }

    public final String toString() {
        return Integer.toString(this.f129927o);
    }
}
