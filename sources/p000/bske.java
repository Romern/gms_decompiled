package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/* renamed from: bske */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bske {

    /* renamed from: a */
    static final Comparator f144869a = bnny.m109908a(bskc.f144867a).mo68163b(bskd.f144868a);

    /* renamed from: c */
    public static final /* synthetic */ int f144870c = 0;

    /* renamed from: b */
    public bmxv f144871b;

    /* renamed from: d */
    private final ArrayList f144872d;

    /* renamed from: e */
    private bngs f144873e;

    /* renamed from: f */
    private bngx f144874f;

    /* renamed from: g */
    private bnia f144875g;

    /* renamed from: h */
    private bnic f144876h;

    /* renamed from: i */
    private bmxv f144877i;

    public bske() {
        this.f144872d = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bngs mo70655a() {
        if (this.f144873e == null) {
            if (this.f144874f != null) {
                bngs j = bngx.m109377j();
                this.f144873e = j;
                j.mo67666b((Iterable) this.f144874f);
                this.f144874f = null;
            } else {
                this.f144873e = bngx.m109377j();
            }
        }
        return this.f144873e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bnia mo70658b() {
        if (this.f144875g == null) {
            if (this.f144876h != null) {
                bnia j = bnic.m109500j();
                this.f144875g = j;
                j.mo67752b((Iterable) this.f144876h);
                this.f144876h = null;
            } else {
                this.f144875g = bnic.m109500j();
            }
        }
        return this.f144875g;
    }

    /* renamed from: a */
    public final bskf mo70656a(bnhe bnhe) {
        boolean z;
        Collections.sort(this.f144872d, f144869a);
        mo70655a().mo67666b((Iterable) this.f144872d);
        bnre i = mo70655a().mo67664a().listIterator();
        while (true) {
            z = false;
            if (!i.hasNext()) {
                break;
            }
            bskl bskl = (bskl) i.next();
            if (bnhe.containsKey(bskl.mo26728c())) {
                mo70658b().mo67629b((bytw) bnhe.get(bskl.mo26728c()));
            } else {
                bnia b = mo70658b();
                bxvd da = bytw.f167725e.mo74144da();
                String c = bskl.mo26728c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytw bytw = (bytw) da.f164949b;
                c.getClass();
                bytw.f167727a = 1 | bytw.f167727a;
                bytw.f167728b = c;
                bytv a = bskk.m115901a(bskl.mo26728c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytw bytw2 = (bytw) da.f164949b;
                a.getClass();
                bytw2.f167729c = a;
                bytw2.f167727a |= 2;
                b.mo67629b((bytw) da.mo74062i());
            }
        }
        bngs bngs = this.f144873e;
        if (bngs != null) {
            this.f144874f = bngs.mo67664a();
        } else if (this.f144874f == null) {
            this.f144874f = bngx.m109376e();
        }
        bnia bnia = this.f144875g;
        if (bnia != null) {
            this.f144876h = bnia.mo67751a();
        } else if (this.f144876h == null) {
            this.f144876h = bnon.f131923a;
        }
        bsjz bsjz = new bsjz(this.f144874f, this.f144871b, this.f144876h, this.f144877i);
        bmxy.m108601b(!bsjz.f144861a.isEmpty(), "Credential Group must be non-empty");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        bnre i2 = bsjz.f144861a.listIterator();
        while (i2.hasNext()) {
            bskl bskl2 = (bskl) i2.next();
            hashSet.add(bskl2.mo26726a());
            hashSet2.add(bskl2.mo26743g());
            hashSet3.add(bskl2.mo26730e());
            hashSet4.add(bskl2.mo26729d());
        }
        bmxy.m108600b(hashSet.size() <= 1);
        bmxy.m108600b(hashSet2.size() <= 1);
        bmxy.m108600b(hashSet3.size() <= 1);
        if (hashSet4.size() <= 1) {
            z = true;
        }
        bmxy.m108600b(z);
        return bsjz;
    }

    public bske(byte[] bArr) {
        this.f144872d = new ArrayList();
        this.f144871b = bmvz.f131120a;
        this.f144877i = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo70657a(bskl bskl) {
        this.f144872d.add(bskl);
        if (bskl.mo26729d().mo66813a()) {
            this.f144877i = bmxv.m108566b(bskk.m115901a((String) bskl.mo26729d().mo66814b()).f167722d);
        }
    }
}
