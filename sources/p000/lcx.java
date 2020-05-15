package p000;

import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.service.autofill.AutofillService;
import android.service.autofill.FillCallback;
import android.service.autofill.FillContext;
import android.service.autofill.FillEventHistory;
import android.service.autofill.FillRequest;
import android.service.autofill.FillResponse;
import android.service.autofill.SaveCallback;
import android.service.autofill.SaveRequest;
import android.util.ArraySet;
import android.view.inputmethod.InlineSuggestionsRequest;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import com.google.android.gms.autofill.service.common.ClientState;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lcx extends AutofillService {

    /* renamed from: a */
    public static final srn f25813a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: h */
    private static String f25814h = "";

    /* renamed from: i */
    private static String f25815i = "";

    /* renamed from: b */
    public kre f25816b;

    /* renamed from: c */
    private final AtomicBoolean f25817c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f25818d = new AtomicBoolean(false);

    /* renamed from: e */
    private ldb f25819e;

    /* renamed from: f */
    private final Set f25820f = Collections.synchronizedSet(new ArraySet());

    /* renamed from: g */
    private final Set f25821g = Collections.synchronizedSet(new ArraySet());

    /* renamed from: a */
    public static void m18935a(kwu kwu, int i, int i2) {
        bxvd da = law.f25629c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        law law = (law) da.f164949b;
        law.f25631a = i;
        law.f25632b = i2 - 2;
        da.getClass();
        kwu.mo14915p(new lcu(da));
    }

    /* renamed from: b */
    private final FillEventHistory m18937b() {
        try {
            return getFillEventHistory();
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f25813a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lcx", "b", 691, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get fill event history.");
            return null;
        }
    }

    public final void onConnected() {
    }

    public final void onCreate() {
        ldb ldb = new ldb();
        int i = Build.VERSION.SDK_INT;
        super.onCreate();
        this.f25819e = ldb;
        this.f25816b = krc.m18382a(this);
    }

    public final void onDisconnected() {
        if (this.f25817c.getAndSet(false)) {
            bnsl bnsl = (bnsl) f25813a.mo68388c();
            bnsl.mo68432a("lcx", "onDisconnected", 510, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Autofill service disconnected while executing FillRequest");
        }
        this.f25818d.getAndSet(false);
        kwu a = this.f25816b.mo14825a(this).mo14863a();
        synchronized (this.f25820f) {
            this.f25820f.stream().filter(lcp.f25795a).forEach(new lcq(a));
        }
        this.f25820f.clear();
        synchronized (this.f25821g) {
            this.f25821g.stream().filter(lcr.f25797a).forEach(new lcs(a));
        }
        this.f25821g.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05b6 A[RETURN] */
    public final void onFillRequest(FillRequest fillRequest, CancellationSignal cancellationSignal, FillCallback fillCallback) {
        int i;
        FillEventHistory fillEventHistory;
        kuw kuw;
        leh leh;
        boolean z;
        boolean z2;
        boolean z3;
        bmvz bmvz;
        this.f25817c.set(true);
        lhi f = this.f25816b.mo14831f();
        if (!ccip.m129863c()) {
            mo14987a(fillCallback, bmvz.f131120a, false, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a);
        } else if (!ccjf.m130035e() || f.mo15095o()) {
            bmza b = bmza.m108659b(new srg());
            if (kdi.f23885a.equals(this.f25816b.mo14831f().mo15081a())) {
                i = !lqo.m19536b(this.f25816b.mo14834i()) ? 5 : 4;
            } else {
                i = 3;
            }
            try {
                fillEventHistory = getFillEventHistory();
            } catch (RuntimeException e) {
                bnsl bnsl = (bnsl) f25813a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lcx", "b", 691, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to get fill event history.");
                fillEventHistory = null;
            }
            FillContext fillContext = !fillRequest.getFillContexts().isEmpty() ? fillRequest.getFillContexts().get(fillRequest.getFillContexts().size() - 1) : null;
            if (fillContext == null) {
                bnsl bnsl2 = (bnsl) f25813a.mo68388c();
                bnsl2.mo68432a("lcx", "onFillRequest", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Received 0 fill contexts");
                kuw a = this.f25816b.mo14825a(this);
                a.mo14866d().mo15018a(fillEventHistory);
                bxvd da = lan.f25571j.mo74144da();
                int flags = fillRequest.getFlags();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((lan) da.f164949b).f25574b = flags;
                b.mo66931e();
                long a2 = b.mo66928a(TimeUnit.MILLISECONDS);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lan lan = (lan) da.f164949b;
                lan.f25575c = a2;
                lan.f25576d = false;
                lan.f25577e = false;
                lan.f25578f = lam.m18854a(i);
                m18936a((lan) da.mo74062i(), bmvz.f131120a, a.mo14863a());
                mo14987a(fillCallback, bmvz.f131120a, true, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a);
                return;
            }
            ClientState a3 = ClientState.m7166a(fillRequest.getClientState());
            ComponentName activityComponent = fillContext.getStructure().getActivityComponent();
            String packageName = activityComponent.getPackageName();
            int i2 = Build.VERSION.SDK_INT;
            if (!kwv.m18706a(a3.f11673e, activityComponent.getClassName())) {
                a3.f11673e = kwv.m18698a(kwv.m18699a(packageName, getPackageManager()), kwv.m18705a(activityComponent.getClassName()));
            }
            MetricsContext metricsContext = a3.f11673e;
            if (metricsContext != null) {
                kuw = this.f25816b.mo14826a(this, metricsContext);
            } else {
                kuw = this.f25816b.mo14825a(this);
            }
            int flags2 = (fillRequest.getFlags() & 1) ^ 1;
            if (flags2 != 0) {
                boolean a4 = lqp.m19538a(packageName);
                boolean a5 = lqp.m19538a(activityComponent.getClassName());
                if (a4 || a5) {
                    b.mo66931e();
                    long a6 = b.mo66928a(TimeUnit.MILLISECONDS);
                    bnsl bnsl3 = (bnsl) f25813a.mo68390d();
                    bnsl3.mo68432a("lcx", "onFillRequest", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68424a("App[ %s ] or Activity[ %s ] excluded from AwG", packageName, activityComponent.getClassName());
                    bxvd da2 = lan.f25571j.mo74144da();
                    int flags3 = fillRequest.getFlags();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        z3 = false;
                        da2.f164950c = false;
                    } else {
                        z3 = false;
                    }
                    lan lan2 = (lan) da2.f164949b;
                    lan2.f25574b = flags3;
                    lan2.f25575c = a6;
                    lan2.f25576d = true;
                    lan2.f25577e = z3;
                    lan2.f25579g = true;
                    lan2.f25578f = lam.m18854a(i);
                    m18936a((lan) da2.mo74062i(), bmxv.m108567c(a3.f11673e), kuw.mo14863a());
                    if (this.f25816b.mo14831f().mo15089i()) {
                        kwe a7 = kwe.m18646a(getApplicationContext());
                        a7.mo14893d(fillRequest.getFlags());
                        a7.mo14884a(a6);
                        a7.mo14891b(true);
                        bxvd bxvd = a7.f25250c;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        kwq kwq = kwq.f25305l;
                        ((kwq) bxvd.f164949b).f25314h = true;
                        a7.mo14883a(lam.m18854a(i));
                        bmxv c = bmxv.m108567c(a3.f11673e);
                        if (c.mo66813a()) {
                            MetricsContext metricsContext2 = (MetricsContext) c.mo66814b();
                            kwe a8 = kwe.m18646a(getApplicationContext());
                            a8.mo14894e(metricsContext2.mo7953a());
                            a8.mo14886a(metricsContext2.mo7956b().f25496a, metricsContext2.mo7956b().f25497b);
                            a8.mo14885a(metricsContext2.mo7957c().f25727a);
                        }
                        mo14985a();
                    }
                    if (ccim.f179064a.mo6606a().mo76029c()) {
                        int i3 = Build.VERSION.SDK_INT;
                        long a9 = ccim.f179064a.mo6606a().mo76027a();
                        if (a9 > 0) {
                            FillResponse.Builder builder = new FillResponse.Builder();
                            builder.disableAutofill(TimeUnit.HOURS.toMillis(a9));
                            if (a5) {
                                builder.setFlags(2);
                            }
                            bmvz = bmxv.m108566b(builder.build());
                        } else {
                            bmvz = bmvz.f131120a;
                        }
                        mo14987a(fillCallback, bmvz, true, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a);
                        return;
                    }
                    mo14987a(fillCallback, bmvz.f131120a, true, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a);
                    return;
                }
            }
            MetricsContext metricsContext3 = a3.f11673e;
            if (metricsContext3 != null && this.f25820f.add(Integer.valueOf(metricsContext3.mo7953a()))) {
                bnsl bnsl4 = (bnsl) f25813a.mo68388c();
                bnsl4.mo68432a("lcx", "onFillRequest", 307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Pending fill request while another request in the same session was triggered.");
            }
            if (ssw.m36269a()) {
                InlineSuggestionsRequest inlineSuggestionsRequest = fillRequest.getInlineSuggestionsRequest();
                if (!ssw.m36269a() || !ccjm.f179188a.mo6606a().mo76143c()) {
                    z = false;
                } else {
                    z = true;
                }
                if (inlineSuggestionsRequest == null || ((long) inlineSuggestionsRequest.getMaxSuggestionCount()) <= ccjm.m130120c()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    if (bmxx.m108577a(ccjm.m130119b())) {
                        String[] split = ccjm.m130119b().split("\\|");
                        int length = split.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (bmwb.m108443a(split[i4], inlineSuggestionsRequest.getHostPackageName())) {
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                    }
                    leh = new leh(fillRequest.getFlags(), fillContext.getStructure(), a3, fillRequest.getId(), bmxv.m108567c(fillRequest.getInlineSuggestionsRequest()));
                    bqgg a10 = kuw.mo14864b().mo15036a(bqgs.m112811a((ExecutorService) snp.m35702a(9)), leh);
                    cancellationSignal.setOnCancelListener(new lco(a10));
                    bqga.m112781a(a10, new lcv(this, b, fillCallback, true, packageName, a3, leh, i, kuw, fillEventHistory), bqfb.INSTANCE);
                    if (!this.f25816b.mo14831f().mo15089i()) {
                        kwe a11 = kwe.m18646a(getApplicationContext());
                        AssistStructure structure = fillContext.getStructure();
                        HashMap hashMap = new HashMap();
                        AtomicInteger atomicInteger = new AtomicInteger(1);
                        bxvd da3 = kbu.f23718f.mo74144da();
                        long acquisitionEndTime = structure.getAcquisitionEndTime();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((kbu) da3.f164949b).f23720a = acquisitionEndTime;
                        long acquisitionStartTime = structure.getAcquisitionStartTime();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((kbu) da3.f164949b).f23721b = acquisitionStartTime;
                        bxvd da4 = kbt.f23714c.mo74144da();
                        ComponentName activityComponent2 = structure.getActivityComponent();
                        if (activityComponent2.getClassName() != null) {
                            String className = activityComponent2.getClassName();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            className.getClass();
                            ((kbt) da4.f164949b).f23716a = className;
                        }
                        if (activityComponent2.getPackageName() != null) {
                            String packageName2 = activityComponent2.getPackageName();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            packageName2.getClass();
                            ((kbt) da4.f164949b).f23717b = packageName2;
                        }
                        kbt kbt = (kbt) da4.mo74062i();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        kbt.getClass();
                        ((kbu) da3.f164949b).f23722c = kbt;
                        boolean isHomeActivity = structure.isHomeActivity();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((kbu) da3.f164949b).f23724e = isHomeActivity;
                        for (int i5 = 0; i5 < structure.getWindowNodeCount(); i5++) {
                            AssistStructure.WindowNode windowNodeAt = structure.getWindowNodeAt(i5);
                            bxvd da5 = kcj.f23808h.mo74144da();
                            int displayId = windowNodeAt.getDisplayId();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((kcj) da5.f164949b).f23810a = displayId;
                            int height = windowNodeAt.getHeight();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((kcj) da5.f164949b).f23811b = height;
                            int left = windowNodeAt.getLeft();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((kcj) da5.f164949b).f23812c = left;
                            kci a12 = kbx.m17608a(windowNodeAt.getRootViewNode(), atomicInteger, hashMap);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            a12.getClass();
                            ((kcj) da5.f164949b).f23813d = a12;
                            if (windowNodeAt.getTitle() != null) {
                                String charSequence = windowNodeAt.getTitle().toString();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                charSequence.getClass();
                                ((kcj) da5.f164949b).f23814e = charSequence;
                            }
                            int top = windowNodeAt.getTop();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((kcj) da5.f164949b).f23815f = top;
                            int width = windowNodeAt.getWidth();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((kcj) da5.f164949b).f23816g = width;
                            kcj kcj = (kcj) da5.mo74062i();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            kbu kbu = (kbu) da3.f164949b;
                            kcj.getClass();
                            if (!kbu.f23723d.mo73666a()) {
                                kbu.f23723d = bxvk.m124021a(kbu.f23723d);
                            }
                            kbu.f23723d.add(kcj);
                        }
                        kbu kbu2 = (kbu) da3.mo74062i();
                        bxvd bxvd2 = a11.f25250c;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        kwq kwq2 = kwq.f25305l;
                        kbu2.getClass();
                        ((kwq) bxvd2.f164949b).f25307a = kbu2;
                        hashMap.entrySet().stream().forEach(new kvy(a11));
                        bxvd bxvd3 = kwe.m18646a(getApplicationContext()).f25250c;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        ((kwq) bxvd3.f164949b).f25308b = flags2 != 0;
                        return;
                    }
                    return;
                }
            }
            leh = new leh(fillRequest.getFlags(), fillContext.getStructure(), a3, fillRequest.getId());
            bqgg a102 = kuw.mo14864b().mo15036a(bqgs.m112811a((ExecutorService) snp.m35702a(9)), leh);
            cancellationSignal.setOnCancelListener(new lco(a102));
            bqga.m112781a(a102, new lcv(this, b, fillCallback, true, packageName, a3, leh, i, kuw, fillEventHistory), bqfb.INSTANCE);
            if (!this.f25816b.mo14831f().mo15089i()) {
            }
        } else {
            mo14987a(fillCallback, bmvz.f131120a, true, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a);
        }
    }

    public final void onSaveRequest(SaveRequest saveRequest, SaveCallback saveCallback) {
        lgv lgv;
        kuw kuw;
        this.f25818d.set(true);
        if (ccip.m129863c()) {
            List<FillContext> fillContexts = saveRequest.getFillContexts();
            if (!fillContexts.isEmpty()) {
                bngs b = bngx.m109371b(fillContexts.size());
                bnha a = bnhe.m109406a(fillContexts.size());
                for (FillContext fillContext : fillContexts) {
                    b.mo67668c(fillContext.getStructure());
                    a.mo67695b(fillContext.getStructure(), Integer.valueOf(fillContext.getRequestId()));
                }
                lgv = new lgv(b.mo67664a(), ClientState.m7166a(saveRequest.getClientState()), a.mo67618b());
            } else {
                lgv = null;
            }
            if (lgv == null) {
                bnsl bnsl = (bnsl) f25813a.mo68388c();
                bnsl.mo68432a("lcx", "onSaveRequest", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Received 0 fill contexts");
                mo14988a(saveCallback);
                return;
            }
            bqgj a2 = bqgs.m112811a((ExecutorService) snp.m35702a(10));
            MetricsContext metricsContext = lgv.f26063b.f11673e;
            if (metricsContext != null) {
                kuw = this.f25816b.mo14826a(this, metricsContext);
                if (this.f25821g.add(Integer.valueOf(metricsContext.mo7953a()))) {
                    bnsl bnsl2 = (bnsl) f25813a.mo68388c();
                    bnsl2.mo68432a("lcx", "onSaveRequest", 477, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Pending save request while another request in the same session was triggered.");
                }
            } else {
                bnsl bnsl3 = (bnsl) f25813a.mo68388c();
                bnsl3.mo68432a("lcx", "onSaveRequest", 481, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Received null metrics context for save request");
                kuw = this.f25816b.mo14825a(this);
            }
            bqga.m112781a(kuw.mo14865c().mo15069a(a2, lgv), new lcw(this, saveCallback), bqfb.INSTANCE);
            return;
        }
        bnsl bnsl4 = (bnsl) f25813a.mo68390d();
        bnsl4.mo68432a("lcx", "onSaveRequest", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("Autofill is not enabled");
        mo14988a(saveCallback);
    }

    /* renamed from: a */
    public static void m18936a(lan lan, bmxv bmxv, kwu kwu) {
        bxvd bxvd = (bxvd) lan.mo74142c(5);
        bxvd.mo73625a((bxvk) lan);
        if (bmxv.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) bmxv.mo66814b();
            bxvd da = kzz.f25505d.mo74144da();
            kzx b = metricsContext.mo7956b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((kzz) da.f164949b).f25508b = b;
            lbh c = metricsContext.mo7957c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            c.getClass();
            ((kzz) da.f164949b).f25509c = c;
            int a = metricsContext.mo7953a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((kzz) da.f164949b).f25507a = a;
            kzz kzz = (kzz) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lan lan2 = lan.f25571j;
            kzz.getClass();
            ((lan) bxvd.f164949b).f25573a = kzz;
        }
        bxvd.getClass();
        kwu.mo14908i(new lct(bxvd));
    }

    /* renamed from: a */
    public final void mo14985a() {
        kwe a = kwe.m18646a(getApplicationContext());
        long currentTimeMillis = System.currentTimeMillis();
        bxvd bxvd = a.f25250c;
        kwk kwk = (kwk) a.f25252e.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        kwk.getClass();
        ((kwq) bxvd.f164949b).f25316j = kwk;
        bxvd bxvd2 = a.f25250c;
        kwp kwp = (kwp) a.f25253f.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        kwp.getClass();
        ((kwq) bxvd2.f164949b).f25317k = kwp;
        bxvd da = kwh.f25261c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kwh) da.f164949b).f25264b = currentTimeMillis;
        kwq kwq2 = (kwq) a.f25250c.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kwq2.getClass();
        ((kwh) da.f164949b).f25263a = kwq2;
        bxvd bxvd3 = a.f25251d;
        kwh kwh = (kwh) da.mo74062i();
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        kwi kwi = (kwi) bxvd3.f164949b;
        kwi kwi2 = kwi.f25265b;
        kwh.getClass();
        kwi.mo14897a();
        kwi.f25267a.add(0, kwh);
        if (((kwi) a.f25251d.f164949b).f25267a.size() > 5) {
            bxvd bxvd4 = a.f25251d;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            kwi kwi3 = (kwi) bxvd4.f164949b;
            kwi3.mo14897a();
            kwi3.f25267a.remove(5);
        }
        kwf kwf = a.f25248a;
        try {
            kwf.f25255b.mo60643a(kwf.f25256c, behv.m95070a(((kwi) a.f25251d.mo74062i()).mo73642k()), new beer[0]);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) kwf.f25254a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kwf", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load and write file.");
        }
        kwe a2 = kwe.m18646a(getApplicationContext());
        bxvd bxvd5 = a2.f25250c;
        bxvd5.f164949b = (bxvk) bxvd5.f164949b.mo74142c(4);
        bxvd bxvd6 = a2.f25253f;
        bxvd6.f164949b = (bxvk) bxvd6.f164949b.mo74142c(4);
        bxvd bxvd7 = a2.f25252e;
        bxvd7.f164949b = (bxvk) bxvd7.f164949b.mo74142c(4);
        a2.f25249b.clear();
    }

    /* renamed from: a */
    public final void mo14986a(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: a */
    public final void mo14987a(FillCallback fillCallback, bmxv bmxv, boolean z, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4) {
        ldb ldb;
        bqgg bqgg;
        bqgg bqgg2;
        bqgg bqgg3;
        bqgg bqgg4;
        this.f25817c.set(false);
        if (bmxv4.mo66813a()) {
            this.f25820f.remove(Integer.valueOf(((MetricsContext) bmxv4.mo66814b()).mo7953a()));
        }
        boolean a = bmxv2.mo66813a();
        boolean z2 = a && !((String) bmxv2.mo66814b()).equals(f25814h);
        boolean a2 = bmxv3.mo66813a();
        boolean z3 = a2 && !f25815i.equals(((kcv) bmxv3.mo66814b()).f23841b);
        if (ccjc.m130016b()) {
            int i = Build.VERSION.SDK_INT;
            if (z && (ldb = this.f25819e) != null && (z2 || z3)) {
                bnsl bnsl = (bnsl) ldb.f25832a.mo68390d();
                bnsl.mo68432a("ldb", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Sending user data to AutofillManager");
                kre a3 = krc.m18382a(this);
                kuw a4 = a3.mo14825a(this);
                bmxv g = a4.mo14869g();
                bmxv h = a4.mo14870h();
                bmxv f = a4.mo14868f();
                bmxv e = a4.mo14867e();
                kyq k = a3.mo14836k();
                UserFieldTypeManager r = a3.mo14843r();
                kck kck = null;
                if (bmxv2.mo66813a()) {
                    try {
                        kck = a3.mo14833h().mo14765b((String) bmxv2.mo66814b());
                    } catch (kpi e2) {
                    }
                }
                if (g.mo66813a()) {
                    bqgg = ((khu) g.mo66814b()).mo14431a(ldb.f25833b);
                } else {
                    bqgg = bqga.m112775a((Object) bnon.f131923a);
                }
                if (h.mo66813a()) {
                    bqgg2 = ((kid) h.mo66814b()).mo14499b(ldb.f25833b);
                } else {
                    bqgg2 = bqga.m112775a((Object) bnon.f131923a);
                }
                if (f.mo66813a() && kck != null) {
                    bqgg3 = bqdx.m112674a(((kfx) f.mo66814b()).mo14429a(new kej(new kel(ldb.f25833b, kck, bmxv3.mo66813a() ? bnic.m109489a((kcv) bmxv3.mo66814b()) : bnon.f131923a, bmxv4), Credential.class)), lcz.f25823a, ldb.f25833b);
                } else {
                    bqgg3 = bqga.m112775a((Object) bnon.f131923a);
                }
                if (e.mo66813a()) {
                    khd khd = (khd) e.mo66814b();
                    bqgj bqgj = ldb.f25833b;
                    khf b = khl.m17863b();
                    b.mo14470a(bqgj);
                    b.mo14469a(bmvz.f131120a);
                    b.mo14473b(bmvz.f131120a);
                    b.mo14472a(khd.f24125f);
                    b.mo14471a(khd);
                    bqgg4 = b.mo14468a().mo14467a();
                } else {
                    bqgg4 = bqga.m112775a((Object) bnon.f131923a);
                }
                bqga.m112783b(bqgg, bqgg2, bqgg3, bqgg4).mo69214a(new lda(bqgg, bqgg2, bqgg3, bqgg4, r, k), ldb.f25833b);
                if (a) {
                    f25814h = (String) bmxv2.mo66814b();
                }
                if (a2) {
                    f25815i = ((kcv) bmxv3.mo66814b()).f23841b;
                }
            }
        }
        fillCallback.onSuccess((FillResponse) bmxv.mo66815c());
        this.f25816b.mo14846u().mo14434a();
        kym t = this.f25816b.mo14845t();
        bmxv s = this.f25816b.mo14844s();
        if (!lrb.m19569b()) {
            if (s.mo66813a()) {
                ((kyi) s.mo66814b()).mo14943d();
            }
            bnre i2 = t.f25425h.listIterator();
            while (i2.hasNext()) {
                ((kyo) i2.next()).mo14940b();
            }
        } else if (s.mo66813a()) {
            ((kyi) s.mo66814b()).mo14942c();
        }
    }

    /* renamed from: a */
    public final void mo14988a(SaveCallback saveCallback) {
        this.f25818d.set(false);
        saveCallback.onSuccess();
        this.f25821g.clear();
    }
}
