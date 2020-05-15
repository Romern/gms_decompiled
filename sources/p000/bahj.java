package p000;

import java.util.List;

/* renamed from: bahj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahj extends cazu {

    /* renamed from: b */
    private final cijl f100876b;

    /* renamed from: c */
    private final cazn f100877c;

    /* renamed from: d */
    private final cazn f100878d;

    /* renamed from: e */
    private final cazn f100879e;

    /* renamed from: f */
    private final cazn f100880f;

    /* renamed from: g */
    private final cazn f100881g;

    /* renamed from: h */
    private final cazn f100882h;

    /* renamed from: i */
    private final cazn f100883i;

    /* renamed from: j */
    private final cazn f100884j;

    public bahj(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8) {
        super(cijl2, cbag.m127657a(bahj.class), cijl);
        this.f100876b = cijl3;
        this.f100877c = cbac.m127643a(cazn);
        this.f100878d = cbac.m127643a(cazn2);
        this.f100879e = cbac.m127643a(cazn3);
        this.f100880f = cbac.m127643a(cazn4);
        this.f100881g = cbac.m127643a(cazn5);
        this.f100882h = cbac.m127643a(cazn6);
        this.f100883i = cbac.m127643a(cazn7);
        this.f100884j = cbac.m127643a(cazn8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100877c.mo75201b(), this.f100878d.mo75201b(), this.f100879e.mo75201b(), this.f100880f.mo75201b(), this.f100881g.mo75201b(), this.f100882h.mo75201b(), this.f100883i.mo75201b(), this.f100884j.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bany bany;
        Throwable th;
        byhn byhn;
        byhi byhi;
        byhv byhv;
        List list = (List) obj;
        cayo b = cayx.m127580b(this.f100876b);
        bygz bygz = (bygz) list.get(0);
        int i = 1;
        byid byid = (byid) list.get(1);
        bafv bafv = (bafv) list.get(2);
        int i2 = 3;
        badr badr = (badr) list.get(3);
        int i3 = 4;
        Long l = (Long) list.get(4);
        int i4 = 5;
        Long l2 = (Long) list.get(5);
        Integer num = (Integer) list.get(6);
        bara bara = (bara) list.get(7);
        bxwc<bygu> bxwc = byid.f166549a;
        bany b2 = bafv.mo55696c().mo55799b();
        try {
            if (bafv.mo55693b().mo55763a(b2)) {
                for (bygu bygu : bxwc) {
                    int a = bygt.m124796a(bygu.f166387d);
                    if (a == 0) {
                        a = 1;
                    }
                    int i5 = a - 1;
                    if (i5 != i) {
                        if (i5 != 2) {
                            if (i5 == i2) {
                                String valueOf = String.valueOf(bygz);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                                sb.append("Unsupported change type DELETE while syncing channel ");
                                sb.append(valueOf);
                                throw new bapa(sb.toString());
                            } else if (i5 != i3) {
                                if (i5 != i4) {
                                    try {
                                        int a2 = bygt.m124796a(bygu.f166387d);
                                        if (a2 != 0) {
                                            i = a2;
                                        }
                                        String valueOf2 = String.valueOf(bygt.m124797b(i));
                                        String valueOf3 = String.valueOf(bygz);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47 + String.valueOf(valueOf3).length());
                                        sb2.append("Got unknown change type ");
                                        sb2.append(valueOf2);
                                        sb2.append(" while syncing channel ");
                                        sb2.append(valueOf3);
                                        throw new bapa(sb2.toString());
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bany = b2;
                                    }
                                } else {
                                    if (bygu.f166385b == i4) {
                                        byhv = (byhv) bygu.f166386c;
                                    } else {
                                        byhv = byhv.f166516c;
                                    }
                                    long j = byhv.f166518a;
                                    long j2 = byhv.f166519b;
                                    bxwc bxwc2 = bxwc;
                                    bany = b2;
                                    try {
                                        bafv.mo55687a(b2, j, j2);
                                        bxwc = bxwc2;
                                        b2 = bany;
                                        i = 1;
                                        i3 = 4;
                                        i4 = 5;
                                        i2 = 3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        try {
                                            bany.close();
                                        } catch (Throwable th4) {
                                            bqye.m113761a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        bxwc bxwc3 = bxwc;
                        bany bany2 = b2;
                        if (bygu.f166385b == 4) {
                            byhi = (byhi) bygu.f166386c;
                        } else {
                            byhi = byhi.f166451f;
                        }
                        bafv.mo55689a(bany2, byhi.f166456d, byhi.f166454b);
                        bxwc = bxwc3;
                        b2 = bany2;
                        i = 1;
                        i3 = 4;
                        i4 = 5;
                        i2 = 3;
                    } else {
                        bafv.mo55686a(b2);
                        bara.mo55900c();
                        bxwc = bxwc;
                        b2 = b2;
                        i = 1;
                        i3 = 4;
                        i4 = 5;
                        i2 = 3;
                    }
                }
                bxwc bxwc4 = bxwc;
                bany bany3 = b2;
                byjj byjj = byid.f166550b;
                if (byjj == null) {
                    byjj = byjj.f166658c;
                }
                bafv.mo55691a(bany3, byjj);
                bafv.mo55688a(bany3, badr, l.longValue(), num.intValue(), l2.longValue(), byid.f166552d);
                bany3.mo55796b();
                bany3.close();
                if (bygz.f166412a == 2) {
                    byhn = (byhn) bygz.f166413b;
                } else {
                    byhn = byhn.f166478e;
                }
                ((achw) b.mo16713a()).logVerbose("Downloaded %d changes to the local %s/%s InternalFootprintsTimeSeriesSyncVariant.", Integer.valueOf(bxwc4.size()), Integer.valueOf(byhn.f166481b), Integer.valueOf(byhn.f166482c));
                bara.mo55899b((long) byid.f166549a.size());
                int i6 = byid.f164961ai;
                if (i6 == -1) {
                    i6 = bxxm.f165037a.mo74228a(byid).mo74223b(byid);
                    byid.f164961ai = i6;
                }
                long j3 = (long) i6;
                bara.mo55897a(j3, j3);
                return bqga.m112775a((Object) null);
            }
            bany = b2;
            throw new baqd("GetChanges aborted due to pending local changes", 3);
        } catch (Throwable th5) {
            th = th5;
            bany = b2;
            th = th;
            bany.close();
            throw th;
        }
    }
}
