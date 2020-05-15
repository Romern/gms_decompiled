package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: bjng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjng extends bjhy {

    /* renamed from: p */
    bwsd f123003p;

    /* renamed from: q */
    Intent f123004q;

    /* renamed from: r */
    boolean f123005r;

    public bjng(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m104037G() {
        mo65128n().mo65084a(2002, bjfv.m103324a(this.f123004q, this.f122639a.f122692a.f122724a));
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i != 2001) {
            if (i != 2002) {
                super.mo52014a(i, bjfd);
                return;
            }
            int b = bjfv.m103325b(bjfd);
            this.f123005r = false;
            if (b == -1) {
                Bundle extras = bjfv.m103323a(bjfd).getExtras();
                if (extras != null) {
                    HashSet hashSet = new HashSet(this.f123003p.f160845c);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : extras.keySet()) {
                        String b2 = bmxx.m108578b(extras.getString(str));
                        if (hashSet.contains(str)) {
                            bxvd da = bwsi.f160863d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwsi bwsi = (bwsi) da.f164949b;
                            str.getClass();
                            int i2 = bwsi.f160865a | 1;
                            bwsi.f160865a = i2;
                            bwsi.f160866b = str;
                            b2.getClass();
                            bwsi.f160865a = i2 | 2;
                            bwsi.f160867c = b2;
                            arrayList.add((bwsi) da.mo74062i());
                        } else {
                            bxvd da2 = bwsh.f160858d.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bwsh bwsh = (bwsh) da2.f164949b;
                            str.getClass();
                            int i3 = bwsh.f160860a | 1;
                            bwsh.f160860a = i3;
                            bwsh.f160861b = str;
                            b2.getClass();
                            bwsh.f160860a = i3 | 2;
                            bwsh.f160862c = b2;
                            arrayList2.add((bwsh) da2.mo74062i());
                        }
                    }
                    ((bjnh) ((bjhy) this).f122754m).mo65383a(arrayList, arrayList2);
                }
                mo65255r();
            } else if (b != 0) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else if (bjfd.mo65080a() != 0) {
            mo65252b(bjfd.f122613a.getIntExtra("errorType", 0));
        } else {
            m104037G();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjnh bjnh = (bjnh) ((bjhy) this).f122754m;
        return bjnh == null ? new bjnh() : bjnh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        bwsb bwsb;
        if (!this.f123005r) {
            boolean z = true;
            this.f123005r = true;
            bwsd bwsd = this.f123003p;
            if (bwsd.f160843a == 1) {
                bwsb = (bwsb) bwsd.f160844b;
            } else {
                bwsb = bwsb.f160826g;
            }
            if ((bwsb.f160828a & 4) != 0) {
                bjfh n = mo65128n();
                Intent intent = this.f123004q;
                WidgetConfig widgetConfig = this.f122639a.f122692a.f122724a;
                bmxy.m108582a(intent, "Launching intent should be provided.");
                bmxy.m108582a(bwsb, "App information should be provided.");
                if ((bwsb.f160828a & 4) == 0) {
                    z = false;
                }
                bmxy.m108601b(z, "App validation should be provided.");
                Intent a = bjfc.m103290a("appValidationAction", widgetConfig);
                a.putExtra("launchingIntent", intent);
                bjhq.m103513b(a, "appInfo", bwsb);
                n.mo65084a(2001, new bjfc(a));
                return;
            }
            m104037G();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("inProgress", this.f123005r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f123005r = bundle.getBoolean("inProgress");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        boolean z;
        bwsb bwsb;
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwsd.f160841e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bwsd bwsd = (bwsd) b;
        this.f123003p = bwsd;
        int i = bwsd.f160843a;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Android app info is required to launch app redirect.");
        bwsd bwsd2 = this.f123003p;
        if (bwsd2.f160843a == 1) {
            bwsb = (bwsb) bwsd2.f160844b;
        } else {
            bwsb = bwsb.f160826g;
        }
        Intent intent = new Intent();
        intent.setPackage(bwsb.f160829b);
        intent.setAction((bwsb.f160828a & 2) != 0 ? bwsb.f160830c : "android.intent.action.VIEW");
        bxwc bxwc = bwsb.f160831d;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            intent.addCategory((String) bxwc.get(i2));
        }
        bxwc bxwc2 = bwsb.f160832e;
        int size2 = bxwc2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bwsh bwsh = (bwsh) bxwc2.get(i3);
            intent.putExtra(bwsh.f160861b, bwsh.f160862c);
        }
        this.f123004q = intent;
    }
}
