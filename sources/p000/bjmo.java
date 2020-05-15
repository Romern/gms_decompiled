package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bjmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmo extends bjhy {

    /* renamed from: p */
    bwqe f122975p;

    /* renamed from: q */
    ArrayList f122976q;

    /* renamed from: r */
    int f122977r;

    /* renamed from: s */
    private boolean f122978s;

    public bjmo(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m103952G() {
        this.f122976q = null;
        this.f122978s = false;
    }

    /* renamed from: H */
    private final void m103953H() {
        boolean z;
        this.f122978s = true;
        if (this.f122792n == 3) {
            bjmp bjmp = (bjmp) ((bjhy) this).f122754m;
            bjmp.f122979d.clear();
            bjmp.mo65244a((bjgf) null);
            int i = this.f122977r;
            for (int i2 = 0; i2 < this.f122976q.size(); i2++) {
                bjfh n = mo65128n();
                int i3 = i2 + 1001 + i;
                WidgetConfig widgetConfig = this.f122639a.f122692a.f122724a;
                String str = (String) this.f122976q.get(i2);
                bwqe bwqe = this.f122975p;
                Intent a = bjfc.m103290a("O2DocumentUploadAction", widgetConfig);
                bmxy.m108582a(str, "Cannot upload empty file string.");
                a.putExtra("filename", str);
                bmxy.m108582a(bwqe, "Document upload data should be provided.");
                if ((bwqe.f160651a & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108601b(z, "Cannot upload without an upload_url.");
                bjhq.m103513b(a, "documentUploadData", bwqe);
                n.mo65084a(i3, new bjfc(a));
                this.f122977r++;
            }
            this.f122978s = false;
            if (this.f122976q.isEmpty()) {
                mo65255r();
            } else {
                mo65253p();
            }
        }
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        int i2;
        if (i < 1001 || i > (i2 = this.f122977r + 1001)) {
            super.mo52014a(i, bjfd);
            return;
        }
        ArrayList arrayList = this.f122976q;
        if (arrayList != null && i >= i2 - arrayList.size() && i <= this.f122977r + 1001) {
            String stringExtra = bjfd.f122613a.getStringExtra("documentToken");
            if (!TextUtils.isEmpty(stringExtra)) {
                bjmp bjmp = (bjmp) ((bjhy) this).f122754m;
                bxvd da = bwqg.f160659d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwqg bwqg = (bwqg) da.f164949b;
                stringExtra.getClass();
                int i3 = bwqg.f160661a | 2;
                bwqg.f160661a = i3;
                bwqg.f160663c = stringExtra;
                bwqg.f160661a = i3 | 1;
                bwqg.f160662b = i - 1001;
                bjmp.f122979d.add((bwqg) da.mo74062i());
                bjmp.mo65244a((bjgf) null);
                if (((bjmp) ((bjhy) this).f122754m).f122979d.size() == this.f122976q.size()) {
                    mo65255r();
                    return;
                }
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmp bjmp = (bjmp) ((bjhy) this).f122754m;
        return bjmp == null ? new bjmp() : bjmp;
    }

    /* renamed from: v */
    public final void mo65259v() {
        m103952G();
    }

    /* renamed from: x */
    public final void mo65261x() {
        m103952G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public final void mo65086cG() {
        super.mo65257t();
        if (this.f122978s) {
            m103953H();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putStringArrayList("fileNames", this.f122976q);
        bundle.putInt("lastRequestCode", this.f122977r);
        bundle.putBoolean("requestingUploads", this.f122978s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122976q = bundle.getStringArrayList("fileNames");
            this.f122977r = bundle.getInt("lastRequestCode");
            this.f122978s = bundle.getBoolean("requestingUploads");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqe.f160649f;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122975p = (bwqe) b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: bngx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: bngx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: bngx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: bngx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bngx} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        boolean z;
        bngx bngx;
        bxvj bxvj = bwqj.f160666e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwqj.f160666e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwqj bwqj = (bwqj) b;
            int a = bwqi.m122209a(bwqj.f160670c);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            if (a - 1 == 0) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwqi.m122209a(bwqj.f160670c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Unsupported resulting action: %d.", objArr));
            } else if (bwqj.f160668a == 2) {
                bwql bwql = (bwql) bwqj.f160669b;
                this.f122976q = new ArrayList(bwql.f160679a.size());
                bxwc bxwc = bwql.f160679a;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bwqk bwqk = (bwqk) bxwc.get(i2);
                    ArrayList arrayList = this.f122976q;
                    bjge bjge = this.f122639a.f122693b;
                    if ((bwqk.f160674a & 1) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bmxy.m108589a(z, "Cannot get data with unset data reference.");
                    Object a3 = bjge.mo65130a(bwqk.f160675b).mo65096a(bwqk.f160676c);
                    if (a3 instanceof String) {
                        String str = (String) a3;
                        bngx = TextUtils.isEmpty(str) ? bngx.m109376e() : bngx.m109356a(str);
                    } else if (a3 instanceof List) {
                        List list = (List) a3;
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (Object obj : list) {
                            if (obj instanceof String) {
                                arrayList2.add((String) obj);
                            }
                        }
                        bngx = arrayList2;
                    } else {
                        bngx = bngx.m109376e();
                    }
                    arrayList.addAll(bngx);
                }
                m103953H();
            } else {
                mo65114b("RESULTING_ACTION_TYPE_START_UPLOAD should contain UploadByReference field");
            }
        } else {
            super.mo65103a(bwoq);
        }
    }
}
