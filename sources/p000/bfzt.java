package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.location.geofencer.service.GeofencerStateMachine$AlarmListener;
import com.google.android.location.geofencer.service.GeofencerStateMachine$Receiver;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bfzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfzt extends bgan implements PendingIntent.OnFinished, bfwi, bfwv {

    /* renamed from: A */
    static volatile bfzt f115787A;

    /* renamed from: E */
    public static final /* synthetic */ int f115788E = 0;

    /* renamed from: B */
    public final bfyt f115789B;

    /* renamed from: C */
    public final bxvd f115790C;

    /* renamed from: D */
    public final bxvd f115791D;

    /* renamed from: M */
    private final bfzn f115792M;

    /* renamed from: N */
    private final GeofencerStateMachine$AlarmListener f115793N;

    /* renamed from: O */
    private final spx f115794O;

    /* renamed from: P */
    private final bhcl f115795P;

    /* renamed from: a */
    public final bfzm f115796a;

    /* renamed from: b */
    public final bfzh f115797b;

    /* renamed from: c */
    public final bfzk f115798c;

    /* renamed from: d */
    public final bfzq f115799d;

    /* renamed from: e */
    public final bfzr f115800e;

    /* renamed from: f */
    public final bfzo f115801f;

    /* renamed from: g */
    public final bfzs f115802g;

    /* renamed from: h */
    public final bfzi f115803h;

    /* renamed from: i */
    public final bfzb f115804i;

    /* renamed from: j */
    public final bfzg f115805j;

    /* renamed from: k */
    public final Object f115806k;

    /* renamed from: l */
    public final Context f115807l;

    /* renamed from: m */
    public final bfyy f115808m;

    /* renamed from: n */
    public final ssh f115809n;

    /* renamed from: o */
    public final spf f115810o;

    /* renamed from: p */
    public long f115811p;

    /* renamed from: q */
    public final bfww f115812q;

    /* renamed from: r */
    public final ArrayDeque f115813r;

    /* renamed from: s */
    public final IntentFilter f115814s;

    /* renamed from: t */
    final BroadcastReceiver f115815t;

    /* renamed from: u */
    public volatile boolean f115816u;

    /* renamed from: v */
    public volatile boolean f115817v;

    /* renamed from: w */
    public final List f115818w;

    /* renamed from: x */
    public final bfzx f115819x;

    /* renamed from: y */
    public boolean f115820y;

    /* renamed from: z */
    public final bgnu f115821z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public bfzt(Context context, ayte ayte) {
        super("GeofencerStateMachine", r13);
        bfww bfww;
        sgf sgf;
        Context context2 = context;
        bhcl bhcl = new bhcl(context2);
        bxvd da = bpmw.f138362d.mo74144da();
        boolean h = soz.m35811h(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmw bpmw = (bpmw) da.f164949b;
        bpmw.f138364a |= 1;
        bpmw.f138365b = h;
        boolean f = spn.m35887f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmw bpmw2 = (bpmw) da.f164949b;
        bpmw2.f138364a |= 2;
        bpmw2.f138366c = f;
        if (context2 != null) {
            asfb asfb = new asfb(context, 1, "Wakeful StateMachine: GeofencerStateMachine", null, "com.google.android.gms", "LOCATION");
            asfb.mo49115a(false);
            this.f115806k = new Object();
            this.f115811p = -1;
            this.f115813r = new ArrayDeque();
            this.f115816u = false;
            this.f115817v = true;
            this.f115818w = new ArrayList();
            this.f115820y = false;
            this.f115807l = context2;
            this.f115809n = ssh.m36213a(context);
            sgf sgf2 = null;
            if (cexe.f183489a.mo6606a().enableClearCutLogs()) {
                this.f115790C = m98352e();
                this.f115791D = m98352e();
                bfww = new bfww(context, this.f115790C, this.f115791D, da, this);
            } else {
                this.f115790C = null;
                this.f115791D = null;
                bfww = null;
            }
            this.f115812q = bfww;
            this.f115808m = new bfyy(ayte, context, this.f115905K, this, "com.google.android.location.internal.GoogleLocationManagerService", this, bfww);
            this.f115792M = new bfzn(this, this.f115808m);
            this.f115797b = new bfzh(this, this.f115808m);
            this.f115796a = new bfzm(this, this.f115808m);
            this.f115798c = new bfzk(this, this.f115808m);
            this.f115799d = new bfzq(this, this.f115808m);
            this.f115800e = new bfzr(this, this.f115808m);
            this.f115801f = new bfzo(this, this.f115808m);
            this.f115802g = new bfzs(this, this.f115808m);
            this.f115803h = new bfzi(this, this.f115808m);
            this.f115804i = new bfzb(this, this.f115808m);
            this.f115805j = new bfzg(this, this.f115808m);
            this.f115810o = spf.m35821a(context);
            this.f115793N = new GeofencerStateMachine$AlarmListener(this);
            boolean z = bfxc.f115575a;
            bgal bgal = this.f115905K;
            if (bgal != null) {
                bgal.f115882a = false;
            }
            boolean z2 = bfxc.f115575a;
            this.f115905K.f115883c.mo62536d();
            this.f115815t = new GeofencerStateMachine$Receiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.f115814s = intentFilter;
            mo62543a(this.f115792M);
            mo62543a(this.f115797b);
            mo62543a(this.f115796a);
            mo62543a(this.f115798c);
            mo62543a(this.f115799d);
            mo62543a(this.f115800e);
            mo62543a(this.f115801f);
            mo62543a(this.f115802g);
            mo62543a(this.f115803h);
            mo62543a(this.f115804i);
            mo62543a(this.f115805j);
            bfzn bfzn = this.f115792M;
            bgal bgal2 = this.f115905K;
            boolean z3 = bgal2.f115882a;
            bgal2.f115890k = bfzn;
            PackageManager packageManager = context.getPackageManager();
            bfzx bfzx = new bfzx(context2, new bfyz(this, "location", "GeofencerStateMachine", new adzt()));
            bxvd bxvd = this.f115790C;
            if (!(bxvd == null || this.f115791D == null)) {
                boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.location.gps");
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpmn bpmn = (bpmn) bxvd.f164949b;
                bpmn bpmn2 = bpmn.f138303g;
                bpmn.f138305a |= 1;
                bpmn.f138306b = hasSystemFeature;
                bxvd bxvd2 = this.f115790C;
                boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.location.network");
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpmn bpmn3 = (bpmn) bxvd2.f164949b;
                bpmn3.f138305a |= 2;
                bpmn3.f138307c = hasSystemFeature2;
                bxvd bxvd3 = this.f115791D;
                boolean b = bfzx.mo62523b();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bpmn bpmn4 = (bpmn) bxvd3.f164949b;
                bpmn4.f138305a |= 1;
                bpmn4.f138306b = b;
                bxvd bxvd4 = this.f115791D;
                boolean a = bfzx.mo62522a();
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bpmn bpmn5 = (bpmn) bxvd4.f164949b;
                bpmn5.f138305a |= 2;
                bpmn5.f138307c = a;
            }
            this.f115819x = bfzx;
            this.f115795P = bhcl;
            int i = Build.VERSION.SDK_INT;
            bgod bgod = new bgod((SensorManager) context2.getSystemService("sensor"), cese.m138166o());
            bxvd bxvd5 = this.f115790C;
            if (!(bxvd5 == null || this.f115791D == null)) {
                boolean z4 = bgod.f116902d;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bpmn bpmn6 = (bpmn) bxvd5.f164949b;
                bpmn bpmn7 = bpmn.f138303g;
                bpmn6.f138305a |= 4;
                bpmn6.f138308d = z4;
                bxvd bxvd6 = this.f115791D;
                boolean b2 = bgod.mo63026b();
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bpmn bpmn8 = (bpmn) bxvd6.f164949b;
                bpmn8.f138305a |= 4;
                bpmn8.f138308d = b2;
            }
            this.f115821z = bgod;
            this.f115794O = spx.m35925a(context);
            if (cexk.m138389b()) {
                int geofencerSpecialEventBurstEvents = (int) cexk.f183493a.mo6606a().geofencerSpecialEventBurstEvents();
                sgf = new sgf((int) cexk.f183493a.mo6606a().geofencerSpecialEventIntervalSeconds(), geofencerSpecialEventBurstEvents, geofencerSpecialEventBurstEvents);
            } else {
                sgf = null;
            }
            if (cexk.m138389b()) {
                int geofencerUpdateDetectorBurstEvents = (int) cexk.f183493a.mo6606a().geofencerUpdateDetectorBurstEvents();
                sgf2 = new sgf((int) cexk.f183493a.mo6606a().geofencerUpdateDetectorIntervalSeconds(), geofencerUpdateDetectorBurstEvents, geofencerUpdateDetectorBurstEvents);
            }
            this.f115789B = new bfyt(sgf, sgf2);
            return;
        }
        throw new IllegalStateException("Context can not be null in a wakeful state machine.");
    }

    /* renamed from: a */
    public static int m98350a(bgez bgez) {
        bgez bgez2 = bgez.UNAVAILABLE;
        int ordinal = bgez.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 2 : 6;
        }
        return 5;
    }

    /* renamed from: e */
    private static final bxvd m98352e() {
        bxvd da = bpmn.f138303g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmn bpmn = (bpmn) da.f164949b;
        int i = bpmn.f138305a | 1;
        bpmn.f138305a = i;
        bpmn.f138306b = false;
        int i2 = i | 2;
        bpmn.f138305a = i2;
        bpmn.f138307c = false;
        int i3 = i2 | 4;
        bpmn.f138305a = i3;
        bpmn.f138308d = false;
        int i4 = i3 | 8;
        bpmn.f138305a = i4;
        bpmn.f138309e = false;
        bpmn.f138305a = i4 | 16;
        bpmn.f138310f = false;
        return da;
    }

    /* renamed from: b */
    public final void mo62514b(bfwc bfwc, Location location) {
        bfwc bfwc2 = bfwc;
        Location location2 = location;
        ((bfze) mo62550c()).mo62497a(bfwc2);
        if (this.f115813r.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f115811p == -1 || cexn.m138393b() == 0 || elapsedRealtime - this.f115811p > cexn.m138393b()) {
                this.f115811p = elapsedRealtime;
                mo62510a(bfwc, location);
                return;
            }
            long j = this.f115811p;
            long b = cexn.m138393b();
            this.f115813r.add(new bfzp(bfwc2, location2));
            this.f115810o.mo25930a("GeofencerStateMachine", 2, j + b, this.f115793N, this.f115905K, (WorkSource) null);
            return;
        }
        this.f115813r.add(new bfzp(bfwc2, location2));
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        this.f115808m.mo62467f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02eb  */
    /* renamed from: a */
    private final void m98351a(List list, int i, Location location) {
        Iterator it;
        PendingIntent pendingIntent;
        Intent intent;
        Iterator it2;
        PendingIntent pendingIntent2;
        Pair a;
        Intent intent2;
        int i2;
        int i3 = i;
        Location location2 = location;
        if (this.f115809n.mo26039a()) {
            HashMap hashMap = new HashMap();
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                bfwf bfwf = (bfwf) list.get(i5);
                PendingIntent pendingIntent3 = bfwf.f115484b;
                ArrayList arrayList = (ArrayList) hashMap.get(pendingIntent3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(pendingIntent3, arrayList);
                }
                arrayList.add(bfwf);
            }
            this.f115807l.getPackageManager();
            Iterator it3 = hashMap.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                PendingIntent pendingIntent4 = (PendingIntent) entry.getKey();
                String a2 = bhcb.m100621a(pendingIntent4);
                if (svr.m36484b(this.f115807l).mo26171a("android.permission.ACCESS_FINE_LOCATION", a2) == -1) {
                    boolean z = bfxc.f115575a;
                } else {
                    try {
                        if (this.f115794O.mo25960c("android:fine_location", svr.m36484b(this.f115807l).mo26172a(a2, i4).uid, a2) == 0) {
                            ArrayList arrayList2 = (ArrayList) entry.getValue();
                            if (cexh.m138383b()) {
                                bfxb bfxb = bfxa.f115569a;
                                bfxb.mo62417a(new bfxf(arrayList2, location2, bfxb.f115570a, bfxb.f115571b));
                            } else {
                                bfxa.f115569a.mo62416a(new bfwr(arrayList2, i3, location2));
                            }
                            Intent intent3 = new Intent();
                            intent3.putExtra("com.google.android.location.intent.extra.transition", i3);
                            ArrayList arrayList3 = new ArrayList(arrayList2.size());
                            int size2 = arrayList2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                arrayList3.add(((bfwf) arrayList2.get(i6)).f115483a);
                            }
                            ArrayList arrayList4 = new ArrayList(arrayList3.size());
                            int size3 = arrayList3.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                Parcel obtain = Parcel.obtain();
                                aekp.m52067a((ParcelableGeofence) arrayList3.get(i7), obtain);
                                byte[] marshall = obtain.marshall();
                                obtain.recycle();
                                arrayList4.add(marshall);
                            }
                            intent3.putExtra("com.google.android.location.intent.extra.geofence_list", arrayList4);
                            if (location2 != null && this.f115795P.mo63552a(a2) >= 5000000) {
                                intent3.putExtra("com.google.android.location.intent.extra.triggering_location", bfro.m97633a(location2, aeim.m51907k(location)));
                            }
                            if (this.f115812q == null) {
                                it2 = it3;
                                pendingIntent = pendingIntent4;
                                intent = intent3;
                            } else {
                                int size4 = arrayList2.size();
                                int i8 = 0;
                                while (i8 < size4) {
                                    bfwf bfwf2 = (bfwf) arrayList2.get(i8);
                                    float[] fArr = new float[1];
                                    ParcelableGeofence parcelableGeofence = bfwf2.f115483a;
                                    PendingIntent pendingIntent5 = pendingIntent4;
                                    ArrayList arrayList5 = arrayList2;
                                    Location.distanceBetween(parcelableGeofence.f79441d, parcelableGeofence.f79442e, location.getLatitude(), location.getLongitude(), fArr);
                                    bfww bfww = this.f115812q;
                                    String str = bfwf2.f115485c;
                                    bpms a3 = ((bfze) mo62550c()).mo62472a();
                                    float f = parcelableGeofence.f79443f;
                                    float accuracy = location.getAccuracy();
                                    float f2 = fArr[0];
                                    Iterator it4 = it3;
                                    if (bfww.mo62407d()) {
                                        bxvd e = bfww.mo62408e();
                                        bxvd da = bpmj.f138268h.mo74144da();
                                        String a4 = bfww.m98097a(a2, str);
                                        i2 = size4;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bpmj bpmj = (bpmj) da.f164949b;
                                        a4.getClass();
                                        intent2 = intent3;
                                        int i9 = bpmj.f138270a | 1;
                                        bpmj.f138270a = i9;
                                        bpmj.f138271b = a4;
                                        bpmj.f138272c = a3.f138340m;
                                        int i10 = i9 | 2;
                                        bpmj.f138270a = i10;
                                        int i11 = i10 | 4;
                                        bpmj.f138270a = i11;
                                        bpmj.f138273d = i3;
                                        int i12 = i11 | 8;
                                        bpmj.f138270a = i12;
                                        bpmj.f138274e = f;
                                        int i13 = i12 | 16;
                                        bpmj.f138270a = i13;
                                        bpmj.f138275f = accuracy;
                                        bpmj.f138270a = i13 | 32;
                                        bpmj.f138276g = f2;
                                        bpmj bpmj2 = (bpmj) da.mo74062i();
                                        if (e.f164950c) {
                                            e.mo74035c();
                                            e.f164950c = false;
                                        }
                                        bpmt bpmt = (bpmt) e.f164949b;
                                        bpmt bpmt2 = bpmt.f138341m;
                                        bpmj2.getClass();
                                        bpmt.f138354l = bpmj2;
                                        bpmt.f138343a |= 1024;
                                        bfww.f115542a.mo62394a((bpmt) e.mo74062i());
                                    } else {
                                        intent2 = intent3;
                                        i2 = size4;
                                    }
                                    bfww bfww2 = this.f115812q;
                                    String str2 = bfwf2.f115485c;
                                    bfww2.mo62397a();
                                    bxvd bxvd = bfww2.mo62395a(bfww.m98097a(a2, str2)).f115541b;
                                    if (i3 == 1) {
                                        int i14 = ((bpml) bxvd.f164949b).f138289e + 1;
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bpml bpml = (bpml) bxvd.f164949b;
                                        bpml bpml2 = bpml.f138283j;
                                        bpml.f138285a |= 8;
                                        bpml.f138289e = i14;
                                    } else if (i3 == 2) {
                                        int i15 = ((bpml) bxvd.f164949b).f138290f + 1;
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bpml bpml3 = (bpml) bxvd.f164949b;
                                        bpml bpml4 = bpml.f138283j;
                                        bpml3.f138285a |= 16;
                                        bpml3.f138290f = i15;
                                    } else if (i3 == 4) {
                                        int i16 = ((bpml) bxvd.f164949b).f138291g + 1;
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bpml bpml5 = (bpml) bxvd.f164949b;
                                        bpml bpml6 = bpml.f138283j;
                                        bpml5.f138285a |= 32;
                                        bpml5.f138291g = i16;
                                    }
                                    i8++;
                                    it3 = it4;
                                    size4 = i2;
                                    intent3 = intent2;
                                    pendingIntent4 = pendingIntent5;
                                    arrayList2 = arrayList5;
                                }
                                it2 = it3;
                                pendingIntent = pendingIntent4;
                                intent = intent3;
                            }
                            bfyy bfyy = this.f115808m;
                            String a5 = bhcb.m100621a(pendingIntent);
                            try {
                                i4 = 0;
                                try {
                                    ApplicationInfo a6 = svr.m36484b(bfyy.f115754l).mo26172a(a5, 0);
                                    if (stx.m36339a(bfyy.f115754l)) {
                                        bfyy.f115749g.mo49121c(stx.m36334a(a6.uid, a5));
                                    }
                                } catch (PackageManager.NameNotFoundException e2) {
                                }
                            } catch (PackageManager.NameNotFoundException e3) {
                                i4 = 0;
                            }
                            bfyy.f115749g.mo49111a(10000);
                            try {
                                pendingIntent2 = pendingIntent;
                                try {
                                    sse.m36203a(pendingIntent2, this.f115807l, intent, this, "android.permission.ACCESS_FINE_LOCATION");
                                    location2 = location;
                                    it3 = it2;
                                } catch (PendingIntent.CanceledException e4) {
                                    boolean z2 = bfxc.f115575a;
                                    a = this.f115808m.mo62453a(new bgae(3, bhcb.m100621a(pendingIntent2), null, RemoveGeofencingRequest.m66873a(pendingIntent2)));
                                    if (a != null) {
                                        ((bfze) mo62550c()).mo62501a(bhcb.m100621a(pendingIntent2), (List) a.second);
                                    }
                                    this.f115808m.mo62467f();
                                    location2 = location;
                                    it3 = it2;
                                }
                            } catch (PendingIntent.CanceledException e5) {
                                pendingIntent2 = pendingIntent;
                                boolean z22 = bfxc.f115575a;
                                a = this.f115808m.mo62453a(new bgae(3, bhcb.m100621a(pendingIntent2), null, RemoveGeofencingRequest.m66873a(pendingIntent2)));
                                if (a != null) {
                                }
                                this.f115808m.mo62467f();
                                location2 = location;
                                it3 = it2;
                            }
                        } else {
                            it = it3;
                            try {
                                boolean z3 = bfxc.f115575a;
                                location2 = location;
                                it3 = it;
                            } catch (PackageManager.NameNotFoundException e6) {
                                if (!Log.isLoggable("GeofencerStateMachine", 6)) {
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e7) {
                        it = it3;
                        if (!Log.isLoggable("GeofencerStateMachine", 6)) {
                            String valueOf = String.valueOf(a2);
                            bfxc.m98133b("GeofencerStateMachine", valueOf.length() == 0 ? new String("Failed to retrieve Uid for package: ") : "Failed to retrieve Uid for package: ".concat(valueOf));
                            location2 = location;
                            it3 = it;
                        } else {
                            location2 = location;
                            it3 = it;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62515b(boolean z) {
        synchronized (this.f115806k) {
            boolean z2 = bfxc.f115575a;
            mo62545b((int) MfiClientException.TYPE_MFICLIENT_STARTED, Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62506a(int i) {
        if (i == 97) {
            return "SM_LOCATION_AVAILABILITY_CHANGED";
        }
        if (i == 98) {
            return "SM_SEND_AND_WAIT_FOR_TEST_CMD";
        }
        switch (i) {
            case 1:
                return "SM_QUERY_LOCATION_OPT_IN_CMD";
            case 2:
                return "SM_INITIALIZE_CMD";
            case 3:
                return "SM_STOP_CMD";
            case 4:
                return "SM_ADD_GEOFENCE_LIST_CMD";
            case 5:
                return "SM_REMOVE_GEOFENCE_CMD";
            case 6:
                return "SM_LOCATION_CMD";
            case 7:
                return "SM_ACTIVITY_CMD";
            case 8:
                return "SM_UPDATE_DETECTOR_REQUIREMENT_CMD";
            case 9:
                return "SM_SYSTEM_EVENT_CMD";
            case 10:
                return "SM_SAVE_ACTIVITY_STATE_CMD";
            case 11:
                return "SM_USER_SWITCH_CMD";
            case 12:
                return "SM_HARDWARE_GEOFENCE_CHANGED_CMD";
            case 13:
                return "SM_HARDWARE_GEFOENCE_AVAILABILITY_CMD";
            case 14:
                return "SM_AR_DEEP_STILL_MODE";
            case 15:
                return "SM_SIGNIFICANT_MOTION_CMD";
            case 16:
                return "SM_REGISTERED_GEOFENCES_CHANGED_CMD";
            default:
                switch (i) {
                    case 101:
                        return "SM_WIFI_CONNECTIVITY_CHANGED";
                    case 102:
                        return "SM_DUMP_NON_CHRE_CMD";
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return "SM_DUMP_CHRE_CMD";
                    default:
                        switch (i) {
                            case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                                return "SM_SEND_GEOFENCE_REQUEST";
                            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                                return "SM_PROCESS_TRANSITION";
                            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                                return "SM_PROCESS_RESPONSE";
                            case MfiClientException.TYPE_MFICLIENT_STARTED:
                                return "SM_CHRE_GEOFENCE_AVAILABILITY_CMD";
                            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                                return "SM_CHRE_RESTARTED";
                            default:
                                StringBuilder sb = new StringBuilder(50);
                                sb.append(i);
                                sb.append(" (Message not named in getWhatToString)");
                                return sb.toString();
                        }
                }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62507a() {
        boolean z = bfxc.f115575a;
        bfzx bfzx = this.f115819x;
        bfzx.f115842a.getContentResolver().unregisterContentObserver(bfzx.f115843b);
        this.f115807l.getApplicationContext().unregisterReceiver(this.f115815t);
    }

    /* renamed from: a */
    public final void mo62508a(Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
            boolean z = bfxc.f115575a;
            mo62511a(bgae.m98381a(schemeSpecificPart, null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo62509a(Location location, Map map, boolean z) {
        synchronized (this.f115806k) {
            if (location.getLatitude() <= 90.0d) {
                if (location.getLatitude() >= -90.0d && location.getLongitude() <= 180.0d && location.getLongitude() >= -180.0d) {
                    if (!cexh.m138383b()) {
                        bfxa.f115569a.mo62416a(new bfwy(-321842505, location, "Received a new transition"));
                    } else {
                        bfxa.f115569a.mo62412a(-305592401, location, 4);
                    }
                    if (Log.isLoggable("GeofencerStateMachine", 4)) {
                        bfxc.m98132a("GeofencerStateMachine", "sendNewTransitions called.");
                    }
                    mo62545b(6, new bfzl(SystemClock.elapsedRealtime(), location, map, z));
                    return;
                }
            }
            if (Log.isLoggable("GeofencerStateMachine", 5)) {
                String valueOf = String.valueOf(location);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Invalid location dropped: ");
                sb.append(valueOf);
                bfxc.m98134c("GeofencerStateMachine", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo62510a(bfwc bfwc, Location location) {
        ArrayList arrayList = bfwc.f115477a;
        if (arrayList != null) {
            m98351a(arrayList, 1, location);
        }
        ArrayList arrayList2 = bfwc.f115478b;
        if (arrayList2 != null) {
            m98351a(arrayList2, 2, location);
        }
        ArrayList arrayList3 = bfwc.f115479c;
        if (arrayList3 != null) {
            m98351a(arrayList3, 4, location);
        }
    }

    /* renamed from: a */
    public final void mo62511a(bgae bgae) {
        synchronized (this.f115806k) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                String valueOf = String.valueOf(bgae);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("removeGeofences: removeRequest=");
                sb.append(valueOf);
                bfxc.m98132a("GeofencerStateMachine", sb.toString());
            }
            if (!this.f115816u) {
                boolean z = bfxc.f115575a;
                this.f115818w.add(bgae);
            } else {
                bgae.mo62448a((bgan) this);
            }
        }
    }

    /* renamed from: a */
    public final void mo62512a(LocationAvailability locationAvailability) {
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            String valueOf = String.valueOf(locationAvailability);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("sendNewLocationAvailability: availability=");
            sb.append(valueOf);
            bfxc.m98132a("GeofencerStateMachine", sb.toString());
        }
        mo62545b(97, locationAvailability);
    }

    /* renamed from: a */
    public final void mo62513a(boolean z) {
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("sendWifiConnectivityChanged: connectivity=");
            sb.append(z);
            bfxc.m98132a("GeofencerStateMachine", sb.toString());
        }
        mo62545b(101, Boolean.valueOf(z));
    }
}
