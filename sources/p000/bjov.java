package p000;

import android.text.TextUtils;

/* renamed from: bjov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjov implements bjpb {

    /* renamed from: a */
    private final char f123056a;

    /* renamed from: b */
    private String f123057b;

    /* renamed from: c */
    private CharSequence f123058c;

    /* renamed from: d */
    private final int f123059d;

    public bjov(bwuk bwuk) {
        this.f123056a = bwuk.f161038b.charAt(0);
        int a = bwuj.m122316a(bwuk.f161037a);
        this.f123059d = a == 0 ? 1 : a;
    }

    /* renamed from: a */
    private final CharSequence m104180a(int i) {
        StringBuilder sb = new StringBuilder(this.f123057b);
        int length = sb.length() - i;
        int max = Math.max(length, 0);
        for (int i2 = 0; i2 < max; i2++) {
            sb.setCharAt(i2, this.f123056a);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo65420a() {
        return -1;
    }

    /* renamed from: a */
    public final void mo65421a(bjpc bjpc) {
        bjpc.f123070a = this.f123057b;
    }

    /* renamed from: a */
    public final void mo65422a(bjpc bjpc, boolean z) {
        CharSequence charSequence;
        if (!TextUtils.equals(this.f123057b, bjpc.f123070a)) {
            String charSequence2 = bjpc.f123070a.toString();
            this.f123057b = charSequence2;
            if (!TextUtils.isEmpty(charSequence2)) {
                int i = this.f123059d - 1;
                if (i == 1) {
                    charSequence = m104180a(Math.max(1, Math.min(4, this.f123057b.length() / 4)));
                } else if (i != 2) {
                    this.f123058c = m104180a(0);
                } else {
                    this.f123058c = m104180a(4);
                }
            } else {
                charSequence = "";
            }
            this.f123058c = charSequence;
        }
        bjpc.f123070a = this.f123058c;
    }
}
