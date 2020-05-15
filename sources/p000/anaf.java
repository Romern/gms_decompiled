package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: anaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anaf extends anai {

    /* renamed from: d */
    private final Set f76467d = new HashSet();

    /* renamed from: e */
    private final amwt f76468e;

    /* renamed from: f */
    private final boolean f76469f;

    /* renamed from: g */
    private final boolean f76470g;

    /* renamed from: h */
    private anal f76471h;

    /* renamed from: i */
    private final anap f76472i;

    public anaf(amwt amwt, amwl amwl, amyt amyt, amvm amvm, Uri uri, anaz anaz, alsj alsj, String str) {
        super("FSA2_ApiContactsReader", amwl, amyt, amvm, uri, anaz);
        this.f76468e = amwt;
        amig.m62939a();
        amig.m62939a();
        this.f76469f = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82919J()).booleanValue();
        amig.m62939a();
        this.f76470g = Boolean.valueOf(cfvk.f185780a.mo6606a().mo83042s()).booleanValue();
        if (this.f76469f) {
            this.f76471h = new anal(Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83019bt()).intValue(), Double.valueOf(cfvk.f185780a.mo6606a().mo82952aP()).doubleValue(), Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82945aI()).intValue());
        }
        this.f76472i = new anap(alsj, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amvs mo41585a() {
        String str;
        amvh a = this.f76476a.f76191a.mo41492a();
        int i = a.f76006a;
        String str2 = null;
        if ((i & 1) != 0) {
            str = a.f76007b;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = a.f76008c;
        }
        return new amvs(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41588b() {
        this.f76476a.mo41489a((String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41589c() {
        ((anbh) this.f76477b).f76549i = true;
        if (this.f76478c) {
            this.f76476a.mo41487a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo41590d() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amvs mo41586a(amvs amvs, boolean z, anah anah) {
        int i;
        int i2;
        int i3;
        int i4;
        amvs amvs2 = amvs;
        if (this.f76469f && z) {
            this.f76471h.mo41595a();
        }
        amwt amwt = this.f76468e;
        if (this.f76470g) {
            anap anap = this.f76472i;
            if (anap.f76498a.mo40685a(anap.f76499b)) {
                amig.m62939a();
                i = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83002bc()).intValue();
            } else {
                amig.m62939a();
                i = ((Integer) amhv.f74924a.mo41191a()).intValue();
            }
        } else if (this.f76469f) {
            anal anal = this.f76471h;
            int i5 = anal.f76491d;
            double d = (double) i5;
            double d2 = anal.f76489b;
            Double.isNaN(d);
            anal.f76491d = Math.min((int) (d * d2), anal.f76490c);
            i = i5;
        } else {
            amig.m62939a();
            i = ((Integer) amhv.f74924a.mo41191a()).intValue();
        }
        bxvd da = btep.f148540i.mo74144da();
        bxvd da2 = bteo.f148536c.mo74144da();
        String str = amvs2.f76135a;
        if (str != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((bteo) da2.f164949b).f148538a = str;
        }
        amig.m62939a();
        int i6 = 3;
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82914E()).booleanValue() && amwt.f76219g.f76599b) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bteo) da2.f164949b).f148539b = bten.m116483a(3);
        } else if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82964ab()).booleanValue()) {
            int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82978ap()).intValue();
            if (intValue == 0) {
                i6 = 2;
            } else if (intValue != 1) {
                i6 = intValue != 2 ? 0 : 4;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bteo) da2.f164949b).f148539b = bten.m116483a(i6);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bteo bteo = (bteo) da2.mo74062i();
        bteo.getClass();
        ((btep) da.f164949b).f148544c = bteo;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btep btep = (btep) da.f164949b;
        btep.f148542a = i;
        String str2 = amwt.f76215c;
        str2.getClass();
        btep.f148549h = str2;
        btcu b = amwt.m63567b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btep btep2 = (btep) da.f164949b;
        b.getClass();
        btep2.f148548g = b;
        String str3 = amvs2.f76136b;
        if (str3 != null) {
            str3.getClass();
            btep2.f148543b = str3;
        }
        btea btea = amwt.f76218f;
        if (btea != null) {
            btea.getClass();
            btep2.f148546e = btea;
        }
        btef btef = (btef) bteh.f148502d.mo74144da();
        bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
        bxuv.mo73905a(Arrays.asList(amwt.f76222h));
        bxuw bxuw = (bxuw) bxuv.mo74062i();
        if (btef.f164950c) {
            btef.mo74035c();
            btef.f164950c = false;
        }
        bxuw.getClass();
        ((bteh) btef.f164949b).f148504a = bxuw;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bteh bteh = (bteh) btef.mo74062i();
        bteh.getClass();
        ((btep) da.f164949b).f148545d = bteh;
        btdy c = amwt.m63568c();
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        btdw btdw = (btdw) bxvd;
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83003bd()).booleanValue()) {
            if (btdw.f164950c) {
                btdw.mo74035c();
                btdw.f164950c = false;
            }
            btdy btdy = btdy.f148473d;
            ((btdy) btdw.f164949b).f148477c = GeneratedMessageLite.m124028dc();
            btdw.mo70749a(btdx.CORE_ID);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btdy btdy2 = (btdy) btdw.mo74062i();
        btdy2.getClass();
        ((btep) da.f164949b).f148547f = btdy2;
        amwt.f76216d.mo41626a();
        try {
            ampm ampm = amwt.f76214b;
            ClientContext clientContext = amwt.f76213a;
            btep btep3 = (btep) da.mo74062i();
            try {
                ampl ampl = ampm.f75684b;
                long j = (long) ampm.f75683a;
                if (ampl.f75667b == null) {
                    ampl.f75667b = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/SyncPeople", ciie.m150370a(btep.f148540i), ciie.m150370a(btdv.f148455g));
                }
                btdv btdv = (btdv) ampl.f75682a.mo25553a(ampl.f75667b, clientContext, btep3, j, TimeUnit.MILLISECONDS);
                anav anav = amwt.f76216d;
                if (btdv != null) {
                    i2 = btdv.f148457a.size();
                } else {
                    i2 = 0;
                }
                anav.mo41628a("FSA_syncPeople", i2, amwy.m63594a(btdv));
                if (btdv != null) {
                    boolean booleanValue = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82979aq()).booleanValue();
                    if (!booleanValue) {
                        i3 = btdv.f148460d;
                    } else {
                        btbt btbt = btdv.f148462f;
                        if (btbt == null) {
                            btbt = btbt.f148212b;
                        }
                        i3 = btbt.f148214a;
                    }
                    amwt.f76217e.mo41631a(amjf.CONTACT, amkb.BEFORE_SYNC, amjd.SERVER, i3);
                    if (amwt.f76225i.mo66813a() && ((Boolean) amga.f74877a.mo41191a()).booleanValue() && z) {
                        amxe amxe = (amxe) amwt.f76225i.mo66814b();
                        if (!booleanValue) {
                            if (!TextUtils.isEmpty(amvs2.f76135a)) {
                                i4 = btdv.f148457a.size();
                            } else {
                                i4 = btdv.f148460d;
                            }
                            amxe.mo41510a(i4);
                        } else {
                            int i7 = btdv.f148461e;
                            if (((anbh) amwt.f76217e).f76560t) {
                                amxe.mo41510a(i3);
                                amxe.mo41524e(i3 - i7);
                            } else {
                                amxe.mo41510a(i7);
                            }
                        }
                    }
                }
                if (btdv != null) {
                    Log.i("FSA2_ContactSyncGrpc", "Received non-null API-contact response");
                    amvs amvs3 = new amvs(btdv.f148459c, btdv.f148458b);
                    if (btdv.f148457a.size() == 0) {
                        return amvs3;
                    }
                    btdv.f148457a.size();
                    for (bler bler : btdv.f148457a) {
                        if (bler == null) {
                            Log.i("FSA2_ContactSyncGrpc", "Ignoring null API person");
                        } else {
                            for (String str4 : anaw.m63873a(bler)) {
                                amvp a = amww.m63581a(bler, str4);
                                if (a == null) {
                                    amdk.m62658a("FSA2_ContactSyncGrpc", "Skipping invalid/unexpected API person {id=%s}", str4);
                                } else if (a.f76099h || !ancm.m64008a((Collection) a.f76111t)) {
                                    anah.mo41591a(a);
                                } else {
                                    amdk.m62658a("FSA2_ContactSyncGrpc", "Skipping Other contact {id=%s}", str4);
                                }
                            }
                        }
                    }
                    return amvs3;
                }
                Log.e("FSA2_ContactSyncGrpc", "Received null API-contact response");
                return null;
            } catch (gid e) {
                e = e;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            } catch (chuw e2) {
                e = e2;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            }
        } catch (gid e3) {
            Log.e("FSA2_ContactSyncGrpc", "getContacts() failed", e3);
            throw new amyc(e3);
        } catch (chuw e4) {
            Log.e("FSA2_ContactSyncGrpc", "getContacts() failed", e4);
            throw e4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo41587a(Object obj) {
        amvp amvp = (amvp) obj;
        if (this.f76467d.contains(amvp.f76092a)) {
            String str = amvp.f76092a;
            return false;
        }
        this.f76467d.add(amvp.f76092a);
        return true;
    }
}
