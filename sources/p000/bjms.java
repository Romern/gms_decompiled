package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.Charset;

/* renamed from: bjms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjms extends bjhy {

    /* renamed from: r */
    private static final Charset f122983r = Charset.forName("UTF-8");

    /* renamed from: p */
    boolean f122984p;

    /* renamed from: q */
    bwqo f122985q;

    public bjms(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 2000) {
            this.f122984p = false;
            if (bjfd.mo65080a() == 0) {
                ((bjmt) ((bjhy) this).f122754m).mo65262a(bjfd.f122613a.getStringExtra("encryptionValue"));
                mo65255r();
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmt bjmt = (bjmt) ((bjhy) this).f122754m;
        return bjmt == null ? new bjmt() : bjmt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        int i;
        String str;
        long j;
        if (!this.f122984p) {
            this.f122984p = true;
            bwqo bwqo = this.f122985q;
            int i2 = bwqo.f160695a;
            if (i2 != 0) {
                i = i2 != 3 ? i2 != 4 ? 0 : 2 : 1;
            } else {
                i = 3;
            }
            int i3 = i - 1;
            byte[] bArr = null;
            if (i != 0) {
                if (i3 == 0) {
                    str = i2 == 3 ? (String) bwqo.f160696b : "";
                } else if (i3 != 1) {
                    str = null;
                } else {
                    bjge bjge = this.f122639a.f122693b;
                    if (i2 == 4) {
                        j = ((Long) bwqo.f160696b).longValue();
                    } else {
                        j = 0;
                    }
                    bjgd a = bjge.mo65130a(j);
                    str = a != null ? a.mo65122h() : null;
                }
                bjmq bjmq = (bjmq) this.f122639a.f122693b.mo65131a(this.f122985q.f160699e, bjmq.class);
                if (bjmq != null) {
                    bArr = bjmq.f122981q;
                }
                if (!TextUtils.isEmpty(str) && bArr != null) {
                    byte[] bytes = str.getBytes(f122983r);
                    bwqo bwqo2 = this.f122985q;
                    String str2 = bwqo2.f160697c;
                    String str3 = bwqo2.f160698d;
                    Intent a2 = bjfc.m103290a("EncryptionAction", this.f122639a.f122692a.f122724a);
                    a2.putExtra("plainText", bytes);
                    a2.putExtra("keyId", str2);
                    a2.putExtra("initializationVector", str3);
                    a2.putExtra("cReqSessionKey", bArr);
                    mo65128n().mo65084a(2000, new bjfc(a2));
                    return;
                }
                mo65256s();
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isWaitingForResponse", this.f122984p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        if (bundle != null) {
            this.f122984p = bundle.getBoolean("isWaitingForResponse");
        }
        super.mo65099a(bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqo.f160693g;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122985q = (bwqo) b;
    }
}
