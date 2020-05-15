package p000;

import android.hardware.location.ContextHubMessage;
import java.util.Locale;

/* renamed from: buhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhl extends buhf implements bugu {

    /* renamed from: b */
    private final int f153862b;

    /* renamed from: c */
    private final int f153863c;

    /* renamed from: d */
    private final int f153864d;

    /* renamed from: e */
    private final int f153865e;

    /* renamed from: f */
    private final byte[] f153866f;

    public buhl(buhj buhj, String str, int i, int i2, int i3, int i4, byte[] bArr) {
        super(buhj, str);
        this.f153862b = i;
        this.f153863c = i2;
        this.f153864d = i3;
        this.f153865e = i4;
        this.f153866f = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ buhe mo72662a(Object obj, Object obj2) {
        return new buhk((bugt) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo72664b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        int i;
        buhj buhj = this.f153836a;
        int i2 = buhj.f153855g;
        if (i2 >= 8) {
            buhu buhu = new buhu(this.f153866f, buhj.f153849a.incrementAndGet(), this.f153864d, this.f153865e, i2);
            i = Integer.MAX_VALUE;
            while (buhu.mo72693a() && !m119523a(i)) {
                byte[] b = buhu.mo72694b();
                buhj buhj2 = this.f153836a;
                int i3 = this.f153862b;
                int i4 = this.f153863c;
                synchronized (buhj2.f153853e) {
                    buhj2.f153853e.mo26010a(0, i4);
                }
                i = buhj2.f153856h.sendMessage(i3, i4, new ContextHubMessage(0, 1, b));
            }
        } else {
            Locale locale = Locale.US;
            Object[] objArr = {8, Integer.valueOf(i2)};
            i = -1;
        }
        mo72665c(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72663a() {
        return 1;
    }
}
