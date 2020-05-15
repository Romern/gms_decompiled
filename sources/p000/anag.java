package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: anag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anag extends anai {

    /* renamed from: d */
    private final amwu f76473d;

    public anag(amwu amwu, amwl amwl, amyt amyt, amvm amvm, Uri uri, anaz anaz) {
        super("FSA2_ApiGroupsReader", amwl, amyt, amvm, uri, anaz);
        this.f76473d = amwu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amvs mo41585a() {
        String str;
        amvh a = this.f76476a.f76191a.mo41492a();
        int i = a.f76006a;
        String str2 = null;
        if ((i & 4) != 0) {
            str = a.f76009d;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = a.f76010e;
        }
        return new amvs(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41588b() {
        this.f76476a.mo41490b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41589c() {
        ((anbh) this.f76477b).f76548h = true;
        if (this.f76478c) {
            this.f76476a.mo41487a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo41590d() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amvs mo41586a(amvs amvs, boolean z, anah anah) {
        int i;
        String str;
        amvs amvs2 = amvs;
        amwu amwu = this.f76473d;
        bxvd da = btdp.f148424g.mo74144da();
        amig.m62939a();
        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82976an()).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btdp btdp = (btdp) da.f164949b;
        btdp.f148426a = intValue;
        String str2 = amvs2.f76135a;
        if (str2 != null) {
            str2.getClass();
            btdp.f148428c = str2;
            btdo btdo = btdo.INCLUDE_DELETED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btdp btdp2 = (btdp) da.f164949b;
            btdo.getClass();
            if (!btdp2.f148429d.mo73666a()) {
                btdp2.f148429d = bxvk.m124019a(btdp2.f148429d);
            }
            btdp2.f148429d.mo74153d(btdo.mo3214a());
        }
        String str3 = amvs2.f76136b;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str3.getClass();
            ((btdp) da.f164949b).f148427b = str3;
        }
        btdg btdg = (btdg) btdi.f148400b.mo74144da();
        btdg.mo70746a(btdh.GDATA_COMPATIBILITY);
        btdi btdi = (btdi) btdg.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btdp btdp3 = (btdp) da.f164949b;
        btdi.getClass();
        btdp3.f148430e = btdi;
        btea btea = amwu.f76218f;
        btea.getClass();
        btdp3.f148431f = btea;
        try {
            amwu.f76216d.mo41626a();
            ampm ampm = amwu.f76214b;
            ClientContext clientContext = amwu.f76213a;
            btdp btdp4 = (btdp) da.mo74062i();
            ampl ampl = ampm.f75684b;
            long j = (long) ampm.f75683a;
            if (ampl.f75671f == null) {
                ampl.f75671f = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/ListContactGroups", ciie.m150370a(btdp.f148424g), ciie.m150370a(btdq.f148432e));
            }
            btdq btdq = (btdq) ampl.f75682a.mo25553a(ampl.f75671f, clientContext, btdp4, j, TimeUnit.MILLISECONDS);
            anav anav = amwu.f76216d;
            if (btdq != null) {
                i = btdq.f148434a.size();
            } else {
                i = 0;
            }
            anav.mo41628a("FSA_listContactGroups", i, amwy.m63594a(btdq));
            if (btdq != null) {
                Log.i("FSA2_GroupSyncGrpc", "Received non-null API-group response");
                amvs amvs3 = new amvs(btdq.f148436c, btdq.f148435b);
                amwu.f76217e.mo41631a(amjf.GROUP, amkb.BEFORE_SYNC, amjd.SERVER, btdq.f148437d);
                bxwc bxwc = btdq.f148434a;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bzkv bzkv = (bzkv) bxwc.get(i2);
                    try {
                        amvr a = amww.m63582a(bzkv);
                        a.mo41404j();
                        a.mo41399f();
                        anah.mo41591a(a);
                    } catch (amxw e) {
                        amxw amxw = e;
                        if (amxw.f76364a == 5) {
                            if (bzkv != null) {
                                bzkp bzkp = bzkv.f170481d;
                                if (bzkp == null) {
                                    bzkp = bzkp.f170452g;
                                }
                                if ((bzkp.f170454a & 1) != 0) {
                                    bzkp bzkp2 = bzkv.f170481d;
                                    if (bzkp2 == null) {
                                        bzkp2 = bzkp.f170452g;
                                    }
                                    bzkq bzkq = bzkp2.f170455b;
                                    if (bzkq == null) {
                                        bzkq = bzkq.f170460c;
                                    }
                                    str = bzkq.f170463b;
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            amdk.m62658a("FSA2_GroupSyncGrpc", "Skipping unexpected system group {id=%s}", str);
                        } else {
                            amdk.m62659b("FSA2_GroupSyncGrpc", "Stop syncing because of error when loading API group", amxw);
                            throw new amyc(amxw);
                        }
                    } catch (chuw e2) {
                        amdk.m62659b("FSA2_GroupSyncGrpc", "Stop syncing because of error when loading API group", e2);
                        throw new amyc(e2);
                    }
                }
                if (amwu.f76226h.mo66813a()) {
                    amig.m62939a();
                    if (((Boolean) amfz.f74876a.mo41191a()).booleanValue() && z) {
                        ((amxe) amwu.f76226h.mo66814b()).mo41518b(btdq.f148437d);
                        return amvs3;
                    }
                }
                return amvs3;
            }
            Log.e("FSA2_GroupSyncGrpc", "Received null API-group response");
            return null;
        } catch (chuw | gid e3) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e3);
            throw e3;
        } catch (gid e4) {
            Log.e("FSA2_GroupSyncGrpc", "getGroups() failed", e4);
            throw new amyc(e4);
        } catch (chuw e5) {
            Log.e("FSA2_GroupSyncGrpc", "getGroups() failed", e5);
            throw e5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo41587a(Object obj) {
        amvr amvr = (amvr) obj;
        return true;
    }
}
