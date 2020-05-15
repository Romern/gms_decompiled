package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: afxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxm extends aaab {

    /* renamed from: b */
    private static final bnsn f64924b = afvx.m53604b();

    /* renamed from: a */
    public final SyncRequest f64925a;

    /* renamed from: c */
    private final afxv f64926c;

    /* renamed from: d */
    private final aecs f64927d;

    /* renamed from: e */
    private final Executor f64928e;

    /* renamed from: f */
    private final afvy f64929f;

    /* renamed from: g */
    private final String f64930g;

    /* renamed from: h */
    private final Account f64931h;

    /* renamed from: i */
    private final CallerInfo f64932i;

    /* renamed from: j */
    private final afwa f64933j;

    /* renamed from: k */
    private final afvo f64934k;

    public afxm(afxv afxv, aecs aecs, Executor executor, afwa afwa, afvy afvy, String str, Account account, afvo afvo, SyncRequest syncRequest, CallerInfo callerInfo) {
        super(BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, "HandleSyncOperation");
        this.f64926c = afxv;
        this.f64927d = aecs;
        this.f64928e = executor;
        this.f64933j = afwa;
        this.f64929f = afvy;
        this.f64930g = str;
        this.f64931h = account;
        this.f64934k = afvo;
        this.f64925a = syncRequest;
        this.f64932i = callerInfo;
    }

    /* renamed from: a */
    private final void m53647a(int i) {
        afvy afvy = this.f64929f;
        afrg afrg = this.f64925a.f80029a;
        CallerInfo callerInfo = this.f64932i;
        String str = this.f64930g;
        long d = cfgy.m139567d();
        if (afvy.f64857b.mo35048a(d)) {
            bbin bbin = (bbin) afvy.f64856a.mo6606a();
            bxvd da = bbic.f102696f.mo74144da();
            int i2 = (int) d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic = (bbic) da.f164949b;
            bbic.f102698a |= 16;
            bbic.f102701d = i2;
            bxvd da2 = afre.f64610e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            afre afre = (afre) da2.f164949b;
            afre.f64615d = i - 1;
            afre.f64612a |= 1;
            bxvd da3 = afrc.f64601d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            afrc afrc = (afrc) da3.f164949b;
            afrc.f64604b = afrg.f64622e;
            afrc.f64603a |= 1;
            bxvd da4 = afrb.f64595e.mo74144da();
            long j = callerInfo.f80028b;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            afrb afrb = (afrb) da4.f164949b;
            int i3 = afrb.f64597a | 2;
            afrb.f64597a = i3;
            afrb.f64598b = j;
            str.getClass();
            int i4 = i3 | 4;
            afrb.f64597a = i4;
            afrb.f64599c = str;
            String str2 = callerInfo.f80027a;
            str2.getClass();
            afrb.f64597a = i4 | 8;
            afrb.f64600d = str2;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            afrc afrc2 = (afrc) da3.f164949b;
            afrb afrb2 = (afrb) da4.mo74062i();
            afrb2.getClass();
            afrc2.f64605c = afrb2;
            afrc2.f64603a |= 2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            afre afre2 = (afre) da2.f164949b;
            afrc afrc3 = (afrc) da3.mo74062i();
            afrc3.getClass();
            afre2.f64614c = afrc3;
            afre2.f64613b = 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic2 = (bbic) da.f164949b;
            afre afre3 = (afre) da2.mo74062i();
            afre3.getClass();
            bbic2.f102700c = afre3;
            bbic2.f102699b = 5;
            bxvd da5 = bbib.f102689f.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bbib bbib = (bbib) da5.f164949b;
            int i5 = bbib.f102691a | 2;
            bbib.f102691a = i5;
            bbib.f102692b = 1;
            "com.google.android.gms".getClass();
            int i6 = i5 | 4;
            bbib.f102691a = i6;
            bbib.f102693c = "com.google.android.gms";
            "mdisync".getClass();
            bbib.f102691a = i6 | 16;
            bbib.f102695e = "mdisync";
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic3 = (bbic) da.f164949b;
            bbib bbib2 = (bbib) da5.mo74062i();
            bbib2.getClass();
            bbic3.f102702e = bbib2;
            bbic3.f102698a |= 32;
            bbin.mo56151a(2001, (bbic) da.mo74062i());
        }
    }

    /* renamed from: a */
    private final byte[] m53648a(afxu afxu) {
        bqgg bqgg;
        try {
            if (!cfgy.m139570g()) {
                bqgg = this.f64927d.mo34060a(afxu.mo35009a()).mo34066a(new afxl(this, afxu), 1, this.f64928e);
            } else {
                bqgg = (cfgy.m139571h() ? this.f64927d.mo34061a(afxu.mo35009a(), this.f64931h) : this.f64927d.mo34060a(afxu.mo35009a())).mo34068a(new afxk(this, afxu), 1, this.f64928e);
            }
            return (byte[]) bqgg.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            bmxy.m108582a(cause, "Failed sync must have a cause!");
            bmzo.m108687a(cause, afxp.class);
            bmzo.m108687a(cause, afxt.class);
            bmzo.m108687a(cause, InterruptedException.class);
            bmzo.m108687a(cause, afxq.class);
            bmzo.m108687a(cause, bbjh.class);
            bmzo.m108687a(cause, bbjk.class);
            bmzo.m108686a(cause);
            throw new IllegalStateException("Sync failed with an unknown checked exception!", cause);
        } catch (afxs e2) {
            m53647a(7);
            throw new aaaj(38002, "Given request is malformed!", null, e2);
        } catch (afxp e3) {
            m53647a(3);
            throw new aaaj(38003, "Sync failed with an authentication error!", null, e3);
        } catch (bbjh e4) {
            m53647a(10);
            throw new aaaj(38004, "Sync failed, because constraints are not met!", null, e4);
        } catch (bbjk e5) {
            m53647a(11);
            throw new aaaj(38005, "Sync is disabled by flag!", null, e5);
        } catch (afxt e6) {
            m53647a(8);
            throw new aaaj(7, "Sync failed with a network error!", null, e6);
        } catch (InterruptedException e7) {
            m53647a(6);
            Thread.currentThread().interrupt();
            throw new aaaj(14, "Sync was interrupted!", null, e7);
        } catch (afxq e8) {
            m53647a(5);
            bnsi c = afvx.m53603a().mo68388c();
            c.mo68402a((int) cfgy.m139566c());
            c.mo68437a(e8);
            c.mo68432a("afxm", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Sync '%d' failed with an internal error!", this.f64925a.f80029a.f64622e);
            throw new aaaj(8, "Sync failed with an internal error!", null, e8);
        } catch (RuntimeException e9) {
            m53647a(12);
            bnsi c2 = afvx.m53603a().mo68388c();
            c2.mo68402a((int) cfgy.m139566c());
            c2.mo68437a(e9);
            c2.mo68432a("afxm", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68409a("Sync '%d' failed with an unexpected error!", this.f64925a.f80029a.f64622e);
            throw new aaaj(8, "Sync failed with an unexpected error!", null, e9);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ab A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqgg bqgg;
        aect aect;
        int i;
        long j;
        long j2;
        boolean z;
        bnsi d = f64924b.mo68390d();
        d.mo68432a("afxm", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Executing operation '%d'...", this.f64925a.f80029a.f64622e);
        try {
            afxv afxv = this.f64926c;
            afrg afrg = this.f64925a.f80029a;
            afxv.m53657a(afrg != afrg.UNKNOWN, "No handler registered for the UNKNOWN operation!");
            afxu afxu = (afxu) afxv.f64949a.get(afrg);
            if (afxu != null) {
                afqw a = cfgy.f184062a.mo6606a().mo81216a();
                String str = this.f64930g;
                afqx afqx = afqx.f64585b;
                str.getClass();
                bxww bxww = a.f64584a;
                if (bxww.containsKey(str)) {
                    afqx = (afqx) bxww.get(str);
                }
                bxwc bxwc = afqx.f64587a;
                int size = bxwc.size();
                int i2 = 0;
                while (i2 < size) {
                    afqz afqz = (afqz) bxwc.get(i2);
                    int i3 = afqz.f64591a;
                    if ((i3 & 1) != 0) {
                        j = afqz.f64592b;
                    } else {
                        j = Long.MIN_VALUE;
                    }
                    if ((i3 & 2) != 0) {
                        j2 = afqz.f64593c;
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (new bxvv(afqz.f64594d, afqz.f64588e).contains(this.f64925a.f80029a)) {
                        long j3 = this.f64932i.f80028b;
                        if (j <= j3 && j3 <= j2) {
                            z = true;
                            i2++;
                            if (z) {
                                throw new aaaj(38000, "API invocation rejected because the caller is blacklisted!", null);
                            }
                        }
                    }
                    z = false;
                    i2++;
                    if (z) {
                    }
                }
                if (cfgy.f184062a.mo6606a().mo81222g()) {
                    afwa afwa = this.f64933j;
                    String str2 = this.f64932i.f80027a;
                    int ordinal = this.f64925a.f80029a.ordinal();
                    if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        i = 2005;
                    } else {
                        i = 1;
                    }
                    new bbim(bbij.m88048a(afwa.f64859a, null, str2), afwa.f64860b, i, new afwb(afwa.f64862d, afwa.f64861c), cfgv.m139558c()).mo56150a();
                }
                try {
                    if (!cfgy.m139570g()) {
                        bqgg = this.f64927d.mo34060a(afxu.mo35009a()).mo34066a(new afxl(this, afxu), 1, this.f64928e);
                    } else {
                        if (cfgy.m139571h()) {
                            aect = this.f64927d.mo34061a(afxu.mo35009a(), this.f64931h);
                        } else {
                            aect = this.f64927d.mo34060a(afxu.mo35009a());
                        }
                        bqgg = aect.mo34068a(new afxk(this, afxu), 1, this.f64928e);
                    }
                    this.f64934k.mo35036a(Status.f30107a, new SyncResult((byte[]) bqgg.get()));
                    bnsi d2 = f64924b.mo68390d();
                    d2.mo68432a("afxm", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68409a("Operation '%d' completed successfully!", this.f64925a.f80029a.f64622e);
                    m53647a(2);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    bmxy.m108582a(cause, "Failed sync must have a cause!");
                    bmzo.m108687a(cause, afxp.class);
                    bmzo.m108687a(cause, afxt.class);
                    bmzo.m108687a(cause, InterruptedException.class);
                    bmzo.m108687a(cause, afxq.class);
                    bmzo.m108687a(cause, bbjh.class);
                    bmzo.m108687a(cause, bbjk.class);
                    bmzo.m108686a(cause);
                    throw new IllegalStateException("Sync failed with an unknown checked exception!", cause);
                } catch (afxs e2) {
                    m53647a(7);
                    throw new aaaj(38002, "Given request is malformed!", null, e2);
                } catch (afxp e3) {
                    m53647a(3);
                    throw new aaaj(38003, "Sync failed with an authentication error!", null, e3);
                } catch (bbjh e4) {
                    m53647a(10);
                    throw new aaaj(38004, "Sync failed, because constraints are not met!", null, e4);
                } catch (bbjk e5) {
                    m53647a(11);
                    throw new aaaj(38005, "Sync is disabled by flag!", null, e5);
                } catch (afxt e6) {
                    m53647a(8);
                    throw new aaaj(7, "Sync failed with a network error!", null, e6);
                } catch (InterruptedException e7) {
                    m53647a(6);
                    Thread.currentThread().interrupt();
                    throw new aaaj(14, "Sync was interrupted!", null, e7);
                } catch (afxq e8) {
                    m53647a(5);
                    bnsi c = afvx.m53603a().mo68388c();
                    c.mo68402a((int) cfgy.m139566c());
                    c.mo68437a(e8);
                    c.mo68432a("afxm", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68409a("Sync '%d' failed with an internal error!", this.f64925a.f80029a.f64622e);
                    throw new aaaj(8, "Sync failed with an internal error!", null, e8);
                } catch (RuntimeException e9) {
                    m53647a(12);
                    bnsi c2 = afvx.m53603a().mo68388c();
                    c2.mo68402a((int) cfgy.m139566c());
                    c2.mo68437a(e9);
                    c2.mo68432a("afxm", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68409a("Sync '%d' failed with an unexpected error!", this.f64925a.f80029a.f64622e);
                    throw new aaaj(8, "Sync failed with an unexpected error!", null, e9);
                }
            } else {
                throw new IllegalStateException(String.format("No handler registered for operation '%d'!", Integer.valueOf(afrg.f64622e)));
            }
        } catch (afxr e10) {
            m53647a(13);
            throw new aaaj(38001, "Unknown or unsupported sync operation requested!", null, e10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64934k.mo35036a(status, (SyncResult) null);
        bnsi d = f64924b.mo68390d();
        d.mo68432a("afxm", "a", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68411a("Operation '%d' failed with status '%d'!", this.f64925a.f80029a.f64622e, status.f30115i);
    }
}
