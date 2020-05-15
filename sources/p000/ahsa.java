package p000;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsa {

    /* renamed from: a */
    public final aibm f67911a;

    /* renamed from: b */
    public final buqh f67912b;

    /* renamed from: c */
    public final buqn f67913c = new ahrr(this, "processBackgroundSubscribeQueue");

    /* renamed from: d */
    public final aixf f67914d = new ahrx(this);

    /* renamed from: e */
    public final Object f67915e = new Object();

    /* renamed from: f */
    public final Queue f67916f = new ArrayDeque();

    /* renamed from: g */
    private final Context f67917g;

    /* renamed from: h */
    private final burh f67918h;

    /* renamed from: i */
    private final aixg f67919i;

    public ahsa(Context context) {
        this.f67917g = context;
        this.f67912b = (buqh) ahgz.m55754a(context, buqh.class);
        this.f67911a = (aibm) ahgz.m55754a(context, aibm.class);
        this.f67918h = (burh) ahgz.m55754a(context, burh.class);
        aixh aixh = new aixh();
        aixh.mo38209a("0p:discoverer");
        aixh.f69979d = 2;
        this.f67919i = ahcb.m55440a(context, aixh.mo38208a());
    }

    /* renamed from: a */
    private static aubt m56448a(String str) {
        return new ahrq(str);
    }

    /* renamed from: b */
    public final void mo37007b() {
        srn srn = ahsd.f67925a;
        aucb e = this.f67919i.mo38207e(DiscoveryChimeraService.m67338b(this.f67917g));
        e.mo50372a(m56448a("DiscoveryNearbyMessagesManager failed to background unsubscribe"));
        try {
            aucu.m76783a(e, 1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68405a("DiscoveryNearbyMessagesManager failed to background unsubscribe");
        }
    }

    /* renamed from: a */
    public final void mo37006a() {
        Strategy strategy = Strategy.f80689b;
        aiyl aiyl = new aiyl();
        aiyl.f70073d = 59;
        burh burh = this.f67918h;
        String language = burl.m120299d().getLanguage();
        if (burh.mo73036a()) {
            language = String.valueOf(language).concat("-debug");
        }
        aixd aixd = new aixd();
        aizt aizt = new aizt();
        aizt.f70184a = ahsy.f67973a;
        aixd.mo38200a(aizt.mo38343a());
        aizt aizt2 = new aizt();
        aizt2.f70185b = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD;
        aizt2.f70186c = new byte[]{0, 0, 0};
        aizt2.f70187d = new byte[]{0, 0, -1};
        aixd.mo38200a(aizt2.mo38343a());
        aixd.mo38201a("com.google.nearby.discoverer", language);
        if (this.f67918h.mo73036a() && cfoj.m141574x()) {
            aixd.mo38201a("com.google.nearby.discoverer", (String) bnjd.m109588b(bmyx.m108640a('-').mo66918a((CharSequence) language), 0));
        }
        aiyl.f70071b = aixd.mo38199a();
        aiyl.f70070a = strategy;
        ahry ahry = new ahry();
        sdo.m34959a(ahry);
        aiyl.f70072c = ahry;
        aiym a = aiyl.mo38273a();
        srn srn = ahsd.f67925a;
        aucb a2 = this.f67919i.mo38206a(DiscoveryChimeraService.m67338b(this.f67917g), a);
        a2.mo50372a(m56448a("DiscoveryNearbyMessagesManager failed to background subscribe"));
        try {
            aucu.m76783a(a2, 1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("DiscoveryNearbyMessagesManager failed to background subscribe");
        }
    }
}
