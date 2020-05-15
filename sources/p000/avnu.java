package p000;

import android.content.Context;
import java.io.File;

/* renamed from: avnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnu extends avnn {

    /* renamed from: e */
    static final avto f93559e = new avto("file_path", "");

    /* renamed from: f */
    static final avto f93560f = new avto("dir_path", "");

    /* renamed from: g */
    static final avtg f93561g = new avtg("network_error_attempts", 0);

    /* renamed from: h */
    private final Context f93562h;

    /* renamed from: i */
    private final avmx f93563i = ((avmx) avmx.f93453h.mo51589b());

    public avnu(Context context, avte avte) {
        super("ab-update-prep", avte);
        this.f93562h = context;
    }

    /* renamed from: e */
    private final avni m78888e() {
        if (!cfsg.m142822i() || bmxx.m108577a((String) avma.f93363i.mo51364a())) {
            avtd a = avte.m79303a();
            a.mo51595a(avoh.f93595e.mo51602b((String) mo51432a().mo51597a(f93559e)));
            return new avni("non-streaming-ab-apply", a.mo51593a());
        }
        avtd a2 = avte.m79303a();
        a2.mo51594a(avoo.f93634e, (String) mo51433a(f93560f));
        return new avni("streaming-apply", a2.mo51593a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
     arg types: [bxwc, java.lang.Class]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[] */
    /* renamed from: c */
    public final avni mo51435c() {
        bmxv bmxv;
        bmxv bmxv2;
        if (!cftn.f185688a.mo6606a().mo82707c() || !ssw.m36269a()) {
            return m78888e();
        }
        this.f93563i.mo51402a(2323, -1.0d);
        boolean booleanValue = ((Boolean) ((avtn) avtn.f93892a.mo51589b()).mo51607b(avnp.f93539n)).booleanValue();
        try {
            bmxy.m108589a(ssw.m36269a(), "Attempt to cleanupAppliedPayload on unsupported platform version.");
            avpn.f93712a.mo25414c("cleanupAppliedPayload()", new Object[0]);
            int cleanupAppliedPayload = ((avpn) avpn.f93713b.mo51589b()).f93715d.cleanupAppliedPayload();
            if (cleanupAppliedPayload == 1) {
                this.f93563i.mo51402a(2067, -1.0d);
                avoa f = avob.m78904f();
                f.mo51452a(cftn.f185688a.mo6606a().mo82706b());
                f.mo51446a("ab-update-prep", mo51432a().mo51598b().mo51593a());
                bmxv = bmxv.m108566b(f.mo51447b());
            } else if (cleanupAppliedPayload != 61) {
                bmxv = bmvz.f131120a;
            } else {
                this.f93563i.mo51402a(24, -1.0d);
                bmxv = bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
            }
            if (bmxv.mo66813a()) {
                avni avni = (avni) bmxv.mo66814b();
                ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(Boolean.valueOf(booleanValue)));
                return avni;
            }
            if (!booleanValue) {
                booleanValue = avow.m78971a(this.f93562h, this.f93563i.mo51414d().f109459a);
            }
            if (booleanValue) {
                try {
                    bmxy.m108589a(ssw.m36269a(), "Attempt to allocateSpace on unsupported platform version.");
                    bmxv bmxv3 = (bmxv) ((avtn) avtn.f93892a.mo51589b()).mo51607b(avnp.f93533h);
                    bmxy.m108589a(bmxv3.mo66813a(), "Unable to allocate space due to missing AbPayloadSpec.");
                    File file = new File(avov.m78963a().getAbsolutePath(), "payload_metadata.bin");
                    avov.m78966a(file);
                    avpn.f93712a.mo25414c("allocateSpace()", new Object[0]);
                    int errorCode = ((avpn) avpn.f93713b.mo51589b()).f93715d.allocateSpace(file.getAbsolutePath(), (String[]) bnjd.m109584a((Iterable) ((avsp) bmxv3.mo66814b()).f93846b, String.class)).getErrorCode();
                    if (errorCode == 1) {
                        this.f93563i.mo51402a(1811, -1.0d);
                        avoa f2 = avob.m78904f();
                        f2.mo51452a(cftn.m143003b());
                        f2.mo51446a("ab-update-prep", mo51432a());
                        bmxv2 = bmxv.m108566b(f2.mo51447b());
                    } else if (errorCode != 60) {
                        bmxv2 = bmvz.f131120a;
                    } else {
                        this.f93563i.mo51402a(1555, -1.0d);
                        avoa f3 = avob.m78904f();
                        f3.mo51452a(cftn.m143003b());
                        f3.mo51446a("ab-update-prep", mo51432a());
                        bmxv2 = bmxv.m108566b(f3.mo51447b());
                    }
                    if (bmxv2.mo66813a()) {
                        avni avni2 = (avni) bmxv2.mo66814b();
                        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(true));
                        return avni2;
                    }
                    ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(true));
                    return m78888e();
                } catch (avps | avpt | avpu e) {
                    try {
                        avtd b = mo51432a().mo51598b();
                        b.mo51594a(f93561g, Integer.valueOf(((Integer) mo51433a(f93561g)).intValue() + 1));
                        avte a = b.mo51593a();
                        this.f93563i.mo51402a(2579, -1.0d);
                        avnx f4 = avny.m78899f();
                        f4.mo51451a(cfsd.m142761d(), cfsd.m142762e());
                        f4.mo51449a(cfsd.m142763f());
                        f4.mo51450a(((Integer) mo51433a(f93561g)).intValue());
                        f4.mo51446a("ab-update-prep", a);
                        avni b2 = f4.mo51447b();
                        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(Boolean.valueOf(booleanValue)));
                        return b2;
                    } catch (Throwable th) {
                        th = th;
                        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(Boolean.valueOf(booleanValue)));
                        throw th;
                    }
                }
            } else {
                throw new avpt("Unable to download payload metadata.");
            }
        } catch (avps | avpt | avpu e2) {
            avtd b3 = mo51432a().mo51598b();
            b3.mo51594a(f93561g, Integer.valueOf(((Integer) mo51433a(f93561g)).intValue() + 1));
            avte a2 = b3.mo51593a();
            this.f93563i.mo51402a(2579, -1.0d);
            avnx f42 = avny.m78899f();
            f42.mo51451a(cfsd.m142761d(), cfsd.m142762e());
            f42.mo51449a(cfsd.m142763f());
            f42.mo51450a(((Integer) mo51433a(f93561g)).intValue());
            f42.mo51446a("ab-update-prep", a2);
            avni b22 = f42.mo51447b();
            ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(Boolean.valueOf(booleanValue)));
            return b22;
        } catch (Throwable th2) {
            th = th2;
            ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93539n.mo51602b(Boolean.valueOf(booleanValue)));
            throw th;
        }
    }
}
