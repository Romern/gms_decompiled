package p000;

/* renamed from: aud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aud extends atk {

    /* renamed from: a */
    public static final String[] f2255a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: b */
    public float f2256b;

    /* renamed from: c */
    public int f2257c;

    public aud() {
    }

    /* renamed from: a */
    public static int m2128a(atq atq, int i) {
        int[] iArr;
        if (atq == null || (iArr = (int[]) atq.f2215a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public aud(byte[] bArr) {
        this.f2256b = 3.0f;
        this.f2257c = 80;
    }
}
