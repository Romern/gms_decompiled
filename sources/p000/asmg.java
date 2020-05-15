package p000;

import android.net.Uri;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmg {

    /* renamed from: A */
    public String f89220A;

    /* renamed from: B */
    public String f89221B;

    /* renamed from: C */
    private final List f89222C = new ArrayList();

    /* renamed from: a */
    public String f89223a;

    /* renamed from: b */
    public byte[] f89224b;

    /* renamed from: c */
    public String f89225c;

    /* renamed from: d */
    public String f89226d;

    /* renamed from: e */
    public int f89227e;

    /* renamed from: f */
    public TokenStatus f89228f;

    /* renamed from: g */
    public String f89229g;

    /* renamed from: h */
    public Uri f89230h;

    /* renamed from: i */
    public int f89231i;

    /* renamed from: j */
    public int f89232j;

    /* renamed from: k */
    public IssuerInfo f89233k;

    /* renamed from: l */
    public String f89234l;

    /* renamed from: m */
    public TransactionInfo f89235m;

    /* renamed from: n */
    public String f89236n;

    /* renamed from: o */
    public byte[] f89237o;

    /* renamed from: p */
    public int f89238p;

    /* renamed from: q */
    public int f89239q;

    /* renamed from: r */
    public InStoreCvmConfig f89240r;

    /* renamed from: s */
    public InAppCvmConfig f89241s;

    /* renamed from: t */
    public String f89242t;

    /* renamed from: u */
    public OnlineAccountCardLinkInfo[] f89243u;

    /* renamed from: v */
    public boolean f89244v;

    /* renamed from: w */
    public long f89245w;

    /* renamed from: x */
    public long f89246x;

    /* renamed from: y */
    public boolean f89247y;

    /* renamed from: z */
    public long f89248z;

    /* renamed from: a */
    public final CardInfo mo49237a() {
        return new CardInfo(this.f89223a, this.f89224b, this.f89225c, this.f89226d, this.f89227e, this.f89228f, this.f89229g, this.f89230h, this.f89231i, this.f89232j, this.f89233k, this.f89234l, this.f89235m, this.f89236n, this.f89237o, this.f89238p, 0, this.f89239q, this.f89240r, this.f89241s, this.f89242t, this.f89243u, false, this.f89222C, false, this.f89244v, this.f89245w, this.f89246x, this.f89247y, this.f89248z, this.f89220A, this.f89221B);
    }
}
