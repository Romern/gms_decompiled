package p000;

import android.content.ContentValues;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnr extends bjhy implements bjze {

    /* renamed from: p */
    bjzf f123024p;

    /* renamed from: q */
    boolean f123025q;

    /* renamed from: r */
    long f123026r;

    /* renamed from: s */
    long f123027s;

    /* renamed from: t */
    Pattern f123028t;

    /* renamed from: u */
    Pattern f123029u;

    /* renamed from: v */
    boolean f123030v;

    /* renamed from: w */
    private bwso f123031w;

    public bjnr(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m104083G() {
        if (!this.f123030v) {
            if (!this.f123025q) {
                if (bjzc.m104960a(this.f122639a.f122692a.f122732i, "android.permission.READ_SMS") && bjzc.m104960a(this.f122639a.f122692a.f122732i, "android.permission.RECEIVE_SMS")) {
                    bwso bwso = this.f123031w;
                    if ((bwso.f160896a & 2) != 0) {
                        Pattern compile = Pattern.compile(bwso.f160898c);
                        this.f123028t = compile;
                        if (compile.matcher("").groupCount() != 1) {
                            this.f123028t = null;
                        }
                        bwso bwso2 = this.f123031w;
                        if ((bwso2.f160896a & 1) != 0) {
                            this.f123029u = Pattern.compile(bwso2.f160897b);
                        }
                    }
                }
                this.f123025q = true;
            }
            if (this.f123028t != null) {
                ArrayList a = bjzg.m104969a(this.f122639a.f122692a.f122732i, Math.max(this.f123026r, this.f123027s), this.f123029u);
                this.f123027s = System.currentTimeMillis();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    if (!mo65406a((ContentValues) a.get(i))) {
                        i++;
                    } else {
                        return;
                    }
                }
                if (this.f123024p == null) {
                    this.f123024p = new bjzf();
                }
                bjzf bjzf = this.f123024p;
                bjzf.f123667b = this;
                bjzf.mo65656a(this.f122639a.f122692a.f122732i);
                return;
            }
            mo65256s();
        }
    }

    /* renamed from: H */
    private final void m104084H() {
        bjzf bjzf = this.f123024p;
        if (bjzf != null) {
            bjzf.mo65657b(this.f122639a.f122692a.f122732i);
        }
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        this.f123030v = false;
        if (i == 123456) {
            int a = bjfu.m103320a(bjfd);
            if (a == -1) {
                Integer num = (Integer) bjfu.m103322b(bjfd).get("android.permission.READ_SMS");
                Integer num2 = (Integer) bjfu.m103322b(bjfd).get("android.permission.RECEIVE_SMS");
                if (num == null || num.intValue() != 0 || num2 == null || num2.intValue() != 0) {
                    mo65256s();
                } else {
                    m104083G();
                }
            } else if (a != 0) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjns bjns = (bjns) ((bjhy) this).f122754m;
        return bjns == null ? new bjns() : bjns;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cb */
    public final void mo65087cb() {
        m104084H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65119d() {
        this.f123025q = false;
        this.f123026r = 0;
        this.f123028t = null;
        this.f123029u = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f123030v && this.f122792n == 3) {
            boolean a = bjzc.m104960a(this.f122639a.f122692a.f122732i, "android.permission.RECEIVE_SMS");
            boolean a2 = bjzc.m104960a(this.f122639a.f122692a.f122732i, "android.permission.READ_SMS");
            if (a && a2) {
                m104083G();
                return;
            }
            this.f123030v = true;
            WidgetConfig widgetConfig = this.f122639a.f122692a.f122724a;
            ArrayList arrayList = new ArrayList();
            if (!a) {
                arrayList.add("android.permission.RECEIVE_SMS");
            }
            if (!a2) {
                arrayList.add("android.permission.READ_SMS");
            }
            mo65128n().mo65084a(123456, bjfu.m103321a(widgetConfig, (String[]) arrayList.toArray(new String[0])));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65259v() {
        m104084H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo65260w() {
        m104084H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65261x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public final void mo65086cG() {
        super.mo65257t();
        if (((bjhu) this).f122751l == 3) {
            m104083G();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putLong("lastMatchingSmsReceivedMsKey", this.f123026r);
        bundle.putLong("lastSmsScanMsKey", this.f123027s);
        bundle.putBoolean("isWaitingForResponse", this.f123030v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        this.f123030v = false;
        if (bundle != null) {
            this.f123026r = bundle.getLong("lastMatchingSmsReceivedMsKey");
            this.f123027s = bundle.getLong("lastSmsScanMsKey");
            this.f123030v = bundle.getBoolean("isWaitingForResponse");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwso.f160894e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123031w = (bwso) b;
    }

    /* renamed from: a */
    public final void mo65405a(SmsMessage[] smsMessageArr) {
        if (mo65406a(bjzg.m104967a(smsMessageArr))) {
            mo65255r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo65406a(ContentValues contentValues) {
        String asString = contentValues.getAsString("address");
        String asString2 = contentValues.getAsString("body");
        long longValue = contentValues.getAsLong("date").longValue();
        if ((this.f123029u != null && (TextUtils.isEmpty(asString) || !this.f123029u.matcher(asString).matches())) || this.f123026r > longValue || TextUtils.isEmpty(asString2)) {
            return false;
        }
        Matcher matcher = this.f123028t.matcher(asString2);
        if (!matcher.find()) {
            return false;
        }
        this.f123026r = System.currentTimeMillis();
        ((bjns) ((bjhy) this).f122754m).mo65262a(matcher.group(1));
        return true;
    }
}
