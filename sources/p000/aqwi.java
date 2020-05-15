package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: aqwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwi extends AsyncTaskLoader {

    /* renamed from: a */
    private List f86970a;

    /* renamed from: b */
    private final ClientContext f86971b;

    /* renamed from: c */
    private final aqwy f86972c = new aqwx(new sgv(getContext(), cgnq.f187374a.mo6606a().mo84169c(), cgnq.f187374a.mo6606a().mo84168b(), false, true, null, null));

    /* renamed from: d */
    private final bzid f86973d;

    public aqwi(Context context, ClientContext clientContext, bzid bzid) {
        super(context);
        this.f86971b = clientContext;
        this.f86973d = bzid;
    }

    /* renamed from: a */
    public final void deliverResult(List list) {
        this.f86970a = list;
        if (isStarted()) {
            super.deliverResult(list);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bzie bzie;
        try {
            aqwy aqwy = this.f86972c;
            bzid bzid = this.f86973d;
            ClientContext clientContext = this.f86971b;
            bxvf bxvf = (bxvf) blbz.f125890a.mo74144da();
            bxvf.mo74125a(aqwx.f87011a, bzid);
            blbz blbz = (blbz) bxvf.mo74062i();
            bxvd da = blby.f125883e.mo74144da();
            int a = aqwx.f87011a.mo73900a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blby blby = (blby) da.f164949b;
            int i = blby.f125885a | 1;
            blby.f125885a = i;
            blby.f125886b = a;
            blbz.getClass();
            blby.f125887c = blbz;
            blby.f125885a = i | 2;
            blby blby2 = (blby) da.mo74062i();
            bxvd da2 = blbu.f125867b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blbu blbu = (blbu) da2.f164949b;
            blby2.getClass();
            if (!blbu.f125869a.mo73666a()) {
                blbu.f125869a = bxvk.m124021a(blbu.f125869a);
            }
            blbu.f125869a.add(blby2);
            blbv blbv = (blbv) ((aqwx) aqwy).f87012b.mo25513a(clientContext, 1, "/batchfetch?alt=proto", ((blbu) da2.mo74062i()).mo73642k(), blbv.f125871b);
            if (blbv.f125873a.size() > 0) {
                bxvd da3 = blcb.f125898d.mo74144da();
                blca blca = ((blcb) blbv.f125873a.get(0)).f125901b;
                if (blca == null) {
                    blca = blca.f125893b;
                }
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blcb blcb = (blcb) da3.f164949b;
                blca.getClass();
                blcb.f125901b = blca;
                blcb.f125900a |= 1;
                blcb blcb2 = (blcb) da3.mo74062i();
                if ((blcb2.f125900a & 2) != 0) {
                    Object[] objArr = new Object[1];
                    bxbg bxbg = blcb2.f125902c;
                    if (bxbg == null) {
                        bxbg = bxbg.f161808c;
                    }
                    objArr[0] = bxbg.f161811b;
                    Log.w("DataMixerServer", String.format("Server error fetching cards data: %s", objArr));
                    bzie = null;
                } else {
                    blca blca2 = blcb2.f125901b;
                    if (blca2 == null) {
                        blca2 = blca.f125893b;
                    }
                    bxvj bxvj = bzie.f170163c;
                    blca2.mo74135a(bxvj);
                    Object b = blca2.f164952m.mo73913b(bxvj.f164958d);
                    if (b == null) {
                        b = bxvj.f164956b;
                    } else {
                        bxvj.mo74139a(b);
                    }
                    bzie = (bzie) b;
                }
            } else {
                bzie = null;
            }
            if (bzie != null) {
                return bzie.f170165a;
            }
            return bngx.m109376e();
        } catch (gid e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Auth exception fetching server cards: ");
            sb.append(valueOf);
            Log.w("DataMixerLoader", sb.toString());
            return null;
        } catch (VolleyError e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("Volley error fetching server cards: ");
            sb2.append(valueOf2);
            Log.w("DataMixerLoader", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.f86970a = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        List list = this.f86970a;
        if (list != null) {
            deliverResult(list);
        }
        if (takeContentChanged() || this.f86970a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
