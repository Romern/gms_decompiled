package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyd extends aayk {

    /* renamed from: a */
    private final ErrorReport f51562a;

    public wyd(Context context, HelpConfig helpConfig, bqgj bqgj, ErrorReport errorReport) {
        super(context, helpConfig, bqgj);
        this.f51562a = errorReport;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, java.lang.String, java.util.List, com.google.android.gms.googlehelp.common.HelpConfig, boolean):java.util.Map
     arg types: [java.lang.String, java.lang.String, bxwc, com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm
      aasm.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):aasm
      aasm.a(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, aars):java.lang.String
      aasm.a(java.lang.String, java.lang.String, java.util.List, com.google.android.gms.googlehelp.common.HelpConfig, boolean):java.util.Map */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* renamed from: a */
    public static Pair m42463a(Context context, HelpConfig helpConfig, bqgj bqgj, ErrorReport errorReport) {
        Map map;
        String str;
        aasm aasm;
        sdo.m34973b("Must be called from a worker thread.");
        wyd wyd = new wyd(context, helpConfig, bqgj, errorReport);
        Pair pair = null;
        try {
            aays k = wyd.mo31910k();
            if (wyd.mo31909a(k)) {
                try {
                    bzov bzov = (bzov) GeneratedMessageLite.m124016a(bzov.f170876b, k.f56844c, bxus.m123744c());
                    HelpConfig helpConfig2 = wyd.f56831d;
                    if (bzov == null || bzov.f170878a.size() == 0) {
                        map = null;
                    } else if (!aaxx.m47206e()) {
                        map = aasm.m46895a("unknownId", "", (List) bzov.f170878a, helpConfig2, false);
                    } else {
                        bxvd da = bzrk.f171153e.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzrk bzrk = (bzrk) da.f164949b;
                        bzrk.f171157c = 1;
                        bzrk.f171155a = 1 | bzrk.f171155a;
                        bxwc bxwc = bzov.f170878a;
                        bzrk.mo74556c();
                        bxsy.m123078a(bxwc, bzrk.f171156b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzrk bzrk2 = (bzrk) da.f164949b;
                        "".getClass();
                        bzrk2.f171155a |= 2;
                        bzrk2.f171158d = "";
                        map = aasm.m46894a("unknownId", (bzrk) da.mo74062i(), helpConfig2);
                    }
                    Iterator it = bzov.f170878a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        bzrj bzrj = (bzrj) it.next();
                        if ((bzrj.f171144a & 1024) != 0) {
                            bzrh bzrh = bzrj.f171152i;
                            if (bzrh == null) {
                                bzrh = bzrh.f171129d;
                            }
                            str = bzrh.f171132b;
                        }
                    }
                    if (map != null) {
                        Iterator it2 = map.values().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            aasm = (aasm) it2.next();
                            if (aasm.mo31737t()) {
                                break;
                            }
                        }
                        if (aasm != null && !TextUtils.isEmpty(str)) {
                            pair = wyo.m42472a(wyd.f56830c, wyd.f56831d, wyd.f56834g, aasm, str);
                        }
                        if (pair == null) {
                            Log.e("gF_SuggestionsCReq", "Unsupported/empty response received");
                            return pair;
                        }
                    }
                    aasm = null;
                    pair = wyo.m42472a(wyd.f56830c, wyd.f56831d, wyd.f56834g, aasm, str);
                    if (pair == null) {
                    }
                } catch (IOException e) {
                    Log.e("gF_SuggestionsCReq", "Parsing suggestion response data failed.", e);
                }
            }
            return pair;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gF_SuggestionsCReq", "Fetching suggestion failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return cdtr.f181715a.mo6606a().mo78297D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) TimeUnit.SECONDS.convert(cdtr.m134949k(), TimeUnit.MILLISECONDS);
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3074);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(cdtu.f181751a.mo6606a().mo78330b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56438c = this.f51562a.f31546b;
        aash.f56439d = cdtr.m134942d();
    }
}
