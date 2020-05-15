package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bglo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglo implements SharedPreferences.OnSharedPreferenceChangeListener, bgmw, bglk {

    /* renamed from: a */
    public final bfor f116775a;

    /* renamed from: b */
    public final List f116776b = new ArrayList();

    /* renamed from: c */
    public boolean f116777c = false;

    /* renamed from: d */
    public int f116778d = Integer.MAX_VALUE;

    /* renamed from: e */
    public Map f116779e;

    /* renamed from: f */
    public bucq f116780f;

    /* renamed from: g */
    public boolean f116781g = false;

    /* renamed from: h */
    public final bmxe f116782h = new bgln();

    /* renamed from: i */
    public final Context f116783i;

    /* renamed from: j */
    public final bgll f116784j;

    /* renamed from: k */
    public final bgle f116785k;

    /* renamed from: l */
    public final bglf f116786l;

    /* renamed from: m */
    public bglp f116787m;

    /* renamed from: p */
    private final bgns f116788p;

    public bglo(Context context, bgns bgns, bgll bgll, bgle bgle, bglf bglf, bfor bfor) {
        this.f116783i = context;
        this.f116788p = bgns;
        this.f116784j = bgll;
        this.f116785k = bgle;
        this.f116786l = bglf;
        this.f116775a = bfor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        return null;
     */
    /* renamed from: a */
    public static synchronized bglo m99248a(bugp bugp, Context context, bgns bgns, bfor bfor) {
        bugn a;
        synchronized (bglo.class) {
            if (cety.m138242c() && (a = bugp.mo62634a(context)) != null) {
                bgll bgll = new bgll(a, bgns, bfor);
                bglo bglo = new bglo(context, bgns, bgll, new bgle(bgll), new bglf(), bfor);
                bgll.f116768d = bglo;
                bgll.f116766b = new sns("AR_CHRE_Handler", 9);
                bgll.f116766b.start();
                bgll.f116767c = new snr(bgll.f116766b);
                bgll.f116765a.mo72629a(5147455389092024331L, bgll, bgll.f116767c);
                SharedPreferences sharedPreferences = context.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(bglo);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo62858b() {
        if (!cety.m138242c()) {
            return false;
        }
        boolean a = this.f116785k.mo62973a();
        StringBuilder sb = new StringBuilder(25);
        sb.append("areAllSupported() = ");
        sb.append(a);
        sb.toString();
        return this.f116785k.mo62973a();
    }

    /* renamed from: c */
    public final void mo62859c() {
        if (cety.m138241b()) {
            boolean b = cety.m138241b();
            StringBuilder sb = new StringBuilder(76);
            sb.append("Ignore CHRE Disable as it is not allowed. chreArDisallowDisable flag = ");
            sb.append(b);
            sb.toString();
            return;
        }
        mo62986h();
        this.f116784j.mo62982a(bgld.m99231a(bubs.DISABLE));
    }

    /* renamed from: d */
    public final boolean mo62860d() {
        boolean z = this.f116777c;
        StringBuilder sb = new StringBuilder(17);
        sb.append("isEnabled()=");
        sb.append(z);
        sb.toString();
        if (cety.m138242c()) {
            return this.f116777c;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo62861e() {
        return false;
    }

    /* renamed from: f */
    public final int mo62862f() {
        return this.f116784j.mo62983b();
    }

    /* renamed from: g */
    public final void mo62863g() {
        if (SystemClock.elapsedRealtime() - this.f116786l.f116757c > cety.f183431a.mo6606a().chreArClockCheckTimeoutMs()) {
            this.f116784j.mo62982a(bgld.m99231a(bubs.QUERY));
        }
        this.f116781g = this.f116784j.mo62982a(bgld.m99231a(bubs.FLUSH));
    }

    /* renamed from: h */
    public final void mo62986h() {
        this.f116777c = false;
        this.f116781g = false;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        bgns bgns;
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("onSharedPreferenceChanged, key=");
        } else {
            "onSharedPreferenceChanged, key=".concat(valueOf);
        }
        if (str != null && TextUtils.equals(str, "arAccuracyModePref") && (bgns = this.f116788p) != null) {
            bgns.mo62921a((Runnable) new bglm(this));
        }
    }

    /* renamed from: a */
    public final void mo62985a() {
        int i;
        SharedPreferences sharedPreferences;
        bfor bfor = this.f116775a;
        int ordinal = bubs.CONFIG.ordinal();
        bfor.mo62047a(new bgfr(bfos.CHRE_AR_REQUEST, bfor.mo62055b(), ordinal, ordinal));
        int max = Math.max(Math.min((int) cety.f183431a.mo6606a().chreArModel(), bucq.values().length - 1), 0);
        if (this.f116783i == null || !cesk.m138180c() || (sharedPreferences = this.f116783i.getSharedPreferences("activityRecognitionAccuracyModeName", 0)) == null || sharedPreferences.getInt("arAccuracyModePref", 0) != 1) {
            i = 2;
        } else {
            i = 3;
        }
        bfor bfor2 = this.f116775a;
        int i2 = i - 1;
        bfor2.mo62047a(new bgfs(bfos.CHRE_AR_MODE, bfor2.mo62055b(), i2, i2));
        bgll bgll = this.f116784j;
        bucq bucq = bucq.values()[max];
        boolean chreArDebugLogEnabled = cety.f183431a.mo6606a().chreArDebugLogEnabled();
        long chreArAccelIntervalNs = cety.f183431a.mo6606a().chreArAccelIntervalNs();
        int numConsecutiveStillsToIdle = (int) cety.f183431a.mo6606a().numConsecutiveStillsToIdle();
        bxvd da = bubq.f153257h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bubq bubq = (bubq) da.f164949b;
        bucq.getClass();
        if (!bubq.f153260b.mo73666a()) {
            bubq.f153260b = bxvk.m124019a(bubq.f153260b);
        }
        bubq.f153260b.mo74153d(bucq.f153402g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bubq bubq2 = (bubq) da.f164949b;
        int i3 = bubq2.f153259a | 1;
        bubq2.f153259a = i3;
        bubq2.f153261c = chreArDebugLogEnabled;
        bubq2.f153262d = i2;
        int i4 = i3 | 2;
        bubq2.f153259a = i4;
        int i5 = i4 | 8;
        bubq2.f153259a = i5;
        bubq2.f153264f = chreArAccelIntervalNs;
        bubq2.f153259a = i5 | 16;
        bubq2.f153265g = numConsecutiveStillsToIdle;
        if (cesk.m138180c()) {
            bxvd da2 = buck.f153350D.mo74144da();
            int chreArAudioMinContinuousAudioClassificationsCar = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousAudioClassificationsCar();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck = (buck) da2.f164949b;
            buck.f153355a |= 1;
            buck.f153356b = chreArAudioMinContinuousAudioClassificationsCar;
            int chreArAudioMinContinuousAudioClassificationsNoncar = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousAudioClassificationsNoncar();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck2 = (buck) da2.f164949b;
            buck2.f153355a = 2 | buck2.f153355a;
            buck2.f153357c = chreArAudioMinContinuousAudioClassificationsNoncar;
            int chreArAudioMinContinuousMotionClassificationsOnfoot = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousMotionClassificationsOnfoot();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck3 = (buck) da2.f164949b;
            buck3.f153355a |= 4;
            buck3.f153358d = chreArAudioMinContinuousMotionClassificationsOnfoot;
            int chreArAudioMinContinuousMotionClassificationsStill = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousMotionClassificationsStill();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck4 = (buck) da2.f164949b;
            buck4.f153355a |= 16;
            buck4.f153360f = chreArAudioMinContinuousMotionClassificationsStill;
            int chreArAudioMinContinuousMotionClassificationsCar = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousMotionClassificationsCar();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck5 = (buck) da2.f164949b;
            buck5.f153355a |= 64;
            buck5.f153362h = chreArAudioMinContinuousMotionClassificationsCar;
            int chreArAudioMinBufferedMotionClassificationsOnfoot = (int) cesk.f183403a.mo6606a().chreArAudioMinBufferedMotionClassificationsOnfoot();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck6 = (buck) da2.f164949b;
            buck6.f153355a |= 8;
            buck6.f153359e = chreArAudioMinBufferedMotionClassificationsOnfoot;
            int chreArAudioMinBufferedMotionClassificationsStill = (int) cesk.f183403a.mo6606a().chreArAudioMinBufferedMotionClassificationsStill();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck7 = (buck) da2.f164949b;
            buck7.f153355a |= 32;
            buck7.f153361g = chreArAudioMinBufferedMotionClassificationsStill;
            int chreArAudioMinBufferedMotionClassificationsCar = (int) cesk.f183403a.mo6606a().chreArAudioMinBufferedMotionClassificationsCar();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck8 = (buck) da2.f164949b;
            buck8.f153355a |= 128;
            buck8.f153363i = chreArAudioMinBufferedMotionClassificationsCar;
            float chreArAudioMinAudioCarClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinAudioCarClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck9 = (buck) da2.f164949b;
            buck9.f153355a |= 512;
            buck9.f153365k = chreArAudioMinAudioCarClassificationConfidence;
            float chreArAudioMinAudioNoncarClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinAudioNoncarClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck10 = (buck) da2.f164949b;
            buck10.f153355a |= 1024;
            buck10.f153366l = chreArAudioMinAudioNoncarClassificationConfidence;
            float chreArAudioMinMotionOnfootClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinMotionOnfootClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck11 = (buck) da2.f164949b;
            buck11.f153355a |= 4096;
            buck11.f153368n = chreArAudioMinMotionOnfootClassificationConfidence;
            float chreArAudioMinMotionStillClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinMotionStillClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck12 = (buck) da2.f164949b;
            buck12.f153355a |= 8192;
            buck12.f153369o = chreArAudioMinMotionStillClassificationConfidence;
            float chreArAudioMinMotionCarClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinMotionCarClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck13 = (buck) da2.f164949b;
            buck13.f153355a |= 2048;
            buck13.f153367m = chreArAudioMinMotionCarClassificationConfidence;
            boolean b = cesk.m138179b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck14 = (buck) da2.f164949b;
            buck14.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            buck14.f153375u = b;
            boolean d = cesk.m138181d();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck15 = (buck) da2.f164949b;
            buck15.f153355a |= 1048576;
            buck15.f153376v = d;
            long chreArAudioTimeIntervalThresholdForPressurePeakMillis = cesk.f183403a.mo6606a().chreArAudioTimeIntervalThresholdForPressurePeakMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck16 = (buck) da2.f164949b;
            buck16.f153355a |= 2097152;
            buck16.f153377w = chreArAudioTimeIntervalThresholdForPressurePeakMillis;
            float chreArAudioMinPressurePeakSpikeThreshold = (float) cesk.f183403a.mo6606a().chreArAudioMinPressurePeakSpikeThreshold();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck17 = (buck) da2.f164949b;
            buck17.f153355a |= 4194304;
            buck17.f153378x = chreArAudioMinPressurePeakSpikeThreshold;
            float chreArAudioMinPressurePeakSpikeBackDelta = (float) cesk.f183403a.mo6606a().chreArAudioMinPressurePeakSpikeBackDelta();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck18 = (buck) da2.f164949b;
            buck18.f153355a |= 8388608;
            buck18.f153379y = chreArAudioMinPressurePeakSpikeBackDelta;
            long chreArOnfootRecencyTimeIntervalMillis = cesk.f183403a.mo6606a().chreArOnfootRecencyTimeIntervalMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck19 = (buck) da2.f164949b;
            buck19.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            buck19.f153371q = chreArOnfootRecencyTimeIntervalMillis;
            long chreArMaxLastVehicleDetectionIntervalForAllStillMillis = cesk.f183403a.mo6606a().chreArMaxLastVehicleDetectionIntervalForAllStillMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck20 = (buck) da2.f164949b;
            buck20.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            buck20.f153372r = chreArMaxLastVehicleDetectionIntervalForAllStillMillis;
            long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis = cesk.f183403a.mo6606a().chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck21 = (buck) da2.f164949b;
            buck21.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            buck21.f153373s = chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis;
            long chreArDeepStillIntervalExitMillis = cesk.f183403a.mo6606a().chreArDeepStillIntervalExitMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck22 = (buck) da2.f164949b;
            buck22.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            buck22.f153374t = chreArDeepStillIntervalExitMillis;
            boolean enableCarExitOnIdle = cesk.f183403a.mo6606a().enableCarExitOnIdle();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck23 = (buck) da2.f164949b;
            buck23.f153355a |= 16777216;
            buck23.f153380z = enableCarExitOnIdle;
            int chreArAudioMinContinuousMotionClassificationsBicycle = (int) cesk.f183403a.mo6606a().chreArAudioMinContinuousMotionClassificationsBicycle();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck24 = (buck) da2.f164949b;
            buck24.f153355a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            buck24.f153364j = chreArAudioMinContinuousMotionClassificationsBicycle;
            float chreArAudioMinMotionBicycleClassificationConfidence = (float) cesk.f183403a.mo6606a().chreArAudioMinMotionBicycleClassificationConfidence();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck25 = (buck) da2.f164949b;
            buck25.f153355a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            buck25.f153370p = chreArAudioMinMotionBicycleClassificationConfidence;
            boolean enableAudioChreWifiFiltering = cesk.f183403a.mo6606a().enableAudioChreWifiFiltering();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck26 = (buck) da2.f164949b;
            buck26.f153355a |= 33554432;
            buck26.f153352A = enableAudioChreWifiFiltering;
            int flexAudioFusion = (int) cesk.f183403a.mo6606a().flexAudioFusion();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck27 = (buck) da2.f164949b;
            buck27.f153355a |= 67108864;
            buck27.f153353B = flexAudioFusion;
            boolean chreArEnableMultimodalModelBasedExitTransition = cesk.f183403a.mo6606a().chreArEnableMultimodalModelBasedExitTransition();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buck buck28 = (buck) da2.f164949b;
            buck28.f153355a |= 134217728;
            buck28.f153354C = chreArEnableMultimodalModelBasedExitTransition;
            buck buck29 = (buck) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bubq bubq3 = (bubq) da.f164949b;
            buck29.getClass();
            bubq3.f153263e = buck29;
            bubq3.f153259a |= 4;
        }
        bxvd da3 = bubt.f153275g.mo74144da();
        bubs bubs = bubs.CONFIG;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bubt bubt = (bubt) da3.f164949b;
        bubt.f153278b = bubs.f153274g;
        bubt.f153277a |= 1;
        bubq bubq4 = (bubq) da.mo74062i();
        bubq4.getClass();
        bubt.f153281e = bubq4;
        bubt.f153277a |= 4;
        bgll.mo62982a((bubt) da3.mo74062i());
    }

    /* renamed from: a */
    public final void mo62855a(bgmq bgmq) {
        if (!this.f116776b.contains(bgmq)) {
            this.f116776b.add(bgmq);
        }
    }

    /* renamed from: a */
    public final void mo62856a(Boolean bool, Boolean bool2) {
        String valueOf = String.valueOf(bool);
        String valueOf2 = String.valueOf(bool2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("signal(), vehicleBluetoothConnected=");
        sb.append(valueOf);
        sb.append(", wifi=");
        sb.append(valueOf2);
        sb.toString();
        bxvd da = buco.f153389d.mo74144da();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buco buco = (buco) da.f164949b;
            buco.f153391a |= 1;
            buco.f153392b = booleanValue;
        }
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buco buco2 = (buco) da.f164949b;
            buco2.f153391a |= 2;
            buco2.f153393c = booleanValue2;
        }
        bxvd da2 = bubt.f153275g.mo74144da();
        bubs bubs = bubs.CONTEXT_SIGNAL;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bubt bubt = (bubt) da2.f164949b;
        bubt.f153278b = bubs.f153274g;
        bubt.f153277a |= 1;
        buco buco3 = (buco) da.mo74062i();
        buco3.getClass();
        bubt.f153282f = buco3;
        bubt.f153277a |= 8;
        this.f116784j.mo62982a((bubt) da2.mo74062i());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo62857a(bgmr bgmr) {
        if (!cety.m138242c() || !this.f116785k.mo62973a()) {
            return false;
        }
        bubt a = bgld.m99230a(Integer.MAX_VALUE, bgmr.f116820a);
        bubs a2 = bubs.m119302a(a.f153278b);
        if (a2 == null) {
            a2 = bubs.DISABLE;
        }
        String valueOf = String.valueOf(a2);
        int i = a.f153279c;
        int size = a.f153280d.size();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
        sb.append("ActivityRequest: command=");
        sb.append(valueOf);
        sb.append(", maxReportLatencyMs=");
        sb.append(i);
        sb.append(", transitionCount=");
        sb.append(size);
        sb.toString();
        for (int i2 = 0; i2 < a.f153280d.size(); i2++) {
            buce a3 = buce.m119318a(((bucb) a.f153280d.get(i2)).f153319b);
            if (a3 == null) {
                a3 = buce.INVALID_ACTIVITY;
            }
            String valueOf2 = String.valueOf(a3);
            bucs a4 = bucs.m119336a(((bucb) a.f153280d.get(i2)).f153320c);
            if (a4 == null) {
                a4 = bucs.INVALID_TRANSITION;
            }
            String valueOf3 = String.valueOf(a4);
            int i3 = ((bucb) a.f153280d.get(i2)).f153321d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 82 + String.valueOf(valueOf3).length());
            sb2.append("transition ");
            sb2.append(i2);
            sb2.append(": activity=");
            sb2.append(valueOf2);
            sb2.append(", transitionType=");
            sb2.append(valueOf3);
            sb2.append(", maxReportLatencyMs=");
            sb2.append(i3);
            sb2.toString();
        }
        this.f116777c = this.f116784j.mo62982a(a);
        bfor bfor = this.f116775a;
        int size2 = bgmr.f116820a.size();
        bfor.mo62047a(new bgft(bfos.CHRE_AR_REQUEST, bfor.mo62055b(), size2, size2));
        if (this.f116777c) {
            this.f116778d = Integer.MAX_VALUE;
            this.f116779e = bgmr.f116820a;
            bglf bglf = this.f116786l;
            int[] e = this.f116785k.mo62977e();
            bgle bgle = this.f116785k;
            bgle.f116750a.lock();
            try {
                bgle.mo62974b();
                List list = bgle.f116753d;
                bgle.f116750a.unlock();
                this.f116787m = new bglp(bglf, e, list);
            } catch (Throwable th) {
                bgle.f116750a.unlock();
                throw th;
            }
        }
        return this.f116777c;
    }
}
