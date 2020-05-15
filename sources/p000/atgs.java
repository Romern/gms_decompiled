package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atgs {
    ID(9, C0126R.string.tp_transaction_id),
    QUICPAY(10, C0126R.string.tp_transaction_quicpay);
    

    /* renamed from: c */
    private final int f90313c;

    /* renamed from: d */
    private final int f90314d;

    private atgs(int i, int i2) {
        this.f90313c = i;
        this.f90314d = i2;
    }

    /* renamed from: a */
    public static atgs m75865a(int i) {
        atgs[] values = values();
        for (atgs atgs : values) {
            if (atgs.f90313c == i) {
                return atgs;
            }
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unknown PostpaidNetwork for ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final String mo49970a(Context context) {
        return context.getString(this.f90314d);
    }
}
