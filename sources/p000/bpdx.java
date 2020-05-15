package p000;

/* renamed from: bpdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdx implements bxvp {
    UNKNOWN_EXTRA(0),
    CALENDAR_ITEM_SOURCE_GSA_ACCOUNT_CAL_SYNC(1),
    CALENDAR_ITEM_SOURCE_NON_GSA_ACCOUNT_CAL_SYNC(2),
    CALENDAR_ITEM_SOURCE_CLOUD(3);
    

    /* renamed from: e */
    public final int f136421e;

    private bpdx(int i) {
        this.f136421e = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136421e;
    }

    public final String toString() {
        return Integer.toString(this.f136421e);
    }
}
