package p000;

/* renamed from: bmnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmnz implements bxvp {
    UI_NO_NFC_INPUT(0),
    UI_SMALL_NFC_ICON(1),
    UI_NFC_DROP_DOWN_BUTTON(2),
    UI_NFC_DROP_DOWN_BUTTON_V2(3),
    UI_NFC_ASSISTIVE_CHIP_BUTTON(4);
    

    /* renamed from: f */
    public final int f130199f;

    private bmnz(int i) {
        this.f130199f = i;
    }

    /* renamed from: a */
    public static bmnz m108217a(int i) {
        if (i == 0) {
            return UI_NO_NFC_INPUT;
        }
        if (i == 1) {
            return UI_SMALL_NFC_ICON;
        }
        if (i == 2) {
            return UI_NFC_DROP_DOWN_BUTTON;
        }
        if (i == 3) {
            return UI_NFC_DROP_DOWN_BUTTON_V2;
        }
        if (i != 4) {
            return null;
        }
        return UI_NFC_ASSISTIVE_CHIP_BUTTON;
    }

    /* renamed from: b */
    public static bxvr m108218b() {
        return bmny.f130192a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f130199f;
    }

    public final String toString() {
        return Integer.toString(this.f130199f);
    }
}
