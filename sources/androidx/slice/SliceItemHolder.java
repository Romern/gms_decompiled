package androidx.slice;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SliceItemHolder implements avg {

    /* renamed from: a */
    public static final Object f1662a = new Object();

    /* renamed from: b */
    public static apj f1663b;

    /* renamed from: c */
    public avg f1664c = null;

    /* renamed from: d */
    public Parcelable f1665d = null;

    /* renamed from: e */
    String f1666e = null;

    /* renamed from: f */
    int f1667f = 0;

    /* renamed from: g */
    long f1668g = 0;

    /* renamed from: h */
    public apk f1669h;

    public SliceItemHolder(apk apk) {
        this.f1669h = apk;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public SliceItemHolder(String str, Object obj, boolean z) {
        char c;
        String str2;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals("action")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 104431:
                if (str.equals("int")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3327612:
                if (str.equals("long")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 100358090:
                if (str.equals("input")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                C1240of ofVar = (C1240of) obj;
                Object obj2 = ofVar.f26798a;
                if (obj2 instanceof PendingIntent) {
                    this.f1665d = (Parcelable) obj2;
                } else if (!z) {
                    throw new IllegalArgumentException("Cannot write callback to parcel");
                }
                this.f1664c = (avg) ofVar.f26799b;
                break;
            case 1:
            case 2:
                this.f1664c = (avg) obj;
                break;
            case 3:
                this.f1665d = (Parcelable) obj;
                break;
            case 4:
                if (obj instanceof Spanned) {
                    int i = Build.VERSION.SDK_INT;
                    str2 = Html.toHtml((Spanned) obj, 0);
                } else {
                    str2 = (String) obj;
                }
                this.f1666e = str2;
                break;
            case 5:
                this.f1667f = ((Integer) obj).intValue();
                break;
            case 6:
                this.f1668g = ((Long) obj).longValue();
                break;
        }
        apj apj = f1663b;
        if (apj != null) {
            apj.mo2270a(this, str);
        }
    }
}
