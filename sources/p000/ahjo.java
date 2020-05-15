package p000;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ahjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahjo extends aigk {

    /* renamed from: a */
    public final ahki f67280a;

    /* renamed from: b */
    public final ahkv f67281b;

    /* renamed from: c */
    private final IBinder.DeathRecipient f67282c = new ahjl(this);

    /* renamed from: d */
    private final ScheduledExecutorService f67283d;

    /* renamed from: e */
    private ahfi f67284e;

    /* renamed from: f */
    private ahfi f67285f;

    /* renamed from: g */
    private ahjj f67286g;

    /* renamed from: h */
    private final ahjq f67287h;

    public ahjo(Context context, String str, String str2, Long l, ahkx ahkx, ahki ahki, ahfx ahfx, ahjq ahjq) {
        ScheduledExecutorService a = ahhr.m55804a();
        this.f67280a = ahki;
        this.f67281b = new ahkv(context, str, str2, l, ahkx, ahfx, this.f67282c);
        this.f67287h = ahjq;
        this.f67283d = a;
    }

    /* renamed from: a */
    private static void m55880a(ahfi ahfi) {
        if (ahfi != null) {
            ahfi.mo36396b();
        }
    }

    /* renamed from: h */
    private static void m55883h(long j) {
        boolean z = true;
        if (j != 0 && j <= 0) {
            z = false;
        }
        sdo.m34975b(z, "durationMillis must be positive or Connections.DURATION_INDEFINITE");
    }

    /* renamed from: i */
    private final void m55884i(long j) {
        this.f67281b.mo36687a(j);
    }

    /* renamed from: b */
    public final void mo36606b(long j) {
        m55884i(j);
        mo36601a(new aiiq().f68919a);
    }

    /* renamed from: c */
    public final void mo36609c(long j) {
        m55884i(j);
        mo36592a(new aidk().f68799a);
    }

    /* renamed from: d */
    public final String mo36610d(long j) {
        m55884i(j);
        ahkv ahkv = this.f67281b;
        String a = ahhg.m55779a();
        long b = ahkv.mo36706b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 21);
        sb.append(a);
        sb.append(":");
        sb.append(b);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        this.f67281b.mo36689a(printWriter);
        printWriter.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo36612e(long j) {
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjo", "e", 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68417a("Timing out discovery for client %s after %d ms", this.f67281b.mo36706b(), j);
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        new aiis();
        ahki.mo36642d(ahkv, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo36613f(long j) {
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjo", "f", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68417a("Timing out advertising for client %s after %d ms", this.f67281b.mo36706b(), j);
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        new aiio();
        ahki.mo36641c(ahkv, true);
    }

    /* renamed from: g */
    public final void mo36614g(long j) {
        m55884i(j);
        mo36602a(new aiis().f68920a);
    }

    /* renamed from: a */
    private static void m55881a(Object obj, String str) {
        sdo.checkIfNull(obj, str.concat(" requires a non-null callback object"));
    }

    /* renamed from: b */
    public final void mo36607b(aigi aigi, String str, long j, long j2) {
        m55884i(j2);
        aiik aiik = new aiik();
        aiik.mo37537a(new ahje(aigi));
        aiik.mo37535a(new ahjd(aigi));
        aiik.mo37539a(str);
        aiik.mo37540b("__LEGACY_SERVICE_ID__");
        aiik.f68916a.f80632e = j;
        ahht ahht = new ahht();
        ahht.mo36508a(Strategy.f80480a);
        aiik.mo37538a(ahht.f67222a);
        mo36598a(aiik.f68916a);
    }

    /* renamed from: a */
    private static void m55882a(byte[] bArr, int i) {
        boolean z = true;
        if (bArr != null && bArr.length > i) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Payload cannot be longer than ");
        sb.append(i);
        sb.append(" bytes");
        sdo.m34975b(z, sb.toString());
    }

    /* renamed from: a */
    public final String mo36584a() {
        return ahhg.m55779a();
    }

    /* renamed from: a */
    public final void mo36585a(long j) {
        m55884i(j);
        mo36600a(new aiio().f68918a);
    }

    /* renamed from: a */
    public final void mo36586a(aigi aigi, String str, long j) {
        m55884i(j);
        aiie aiie = new aiie();
        aiie.mo37517a(new ahix(aigi));
        aiie.mo37518a(str);
        mo36595a(aiie.f68913a);
    }

    /* renamed from: b */
    public final void mo36608b(String[] strArr, byte[] bArr, long j) {
        m55884i(j);
        m55882a(bArr, 1168);
        aiii aiii = new aiii();
        aiii.mo37529a(ahjk.m55879a());
        aiii.mo37532a(strArr);
        aiii.mo37530a(ahko.m55984a(bArr));
        aiii.mo37531a(false);
        mo36597a(aiii.f68915a);
    }

    /* renamed from: a */
    public final void mo36587a(aigi aigi, String str, long j, long j2) {
        m55884i(j2);
        aiim aiim = new aiim();
        aiim.mo37545a(new ahjh(aigi));
        aiim.mo37543a(new ahjf(aigi));
        aiim.mo37547a(str);
        aiim.f68917a.f80639d = j;
        ahik ahik = new ahik();
        ahik.mo36534a(Strategy.f80480a);
        aiim.mo37546a(ahik.f67244a);
        mo36599a(aiim.f68917a);
    }

    /* renamed from: a */
    public final void mo36588a(aigi aigi, String str, String str2, byte[] bArr, long j) {
        m55884i(j);
        aiig aiig = new aiig();
        aiig.mo37524a(new ahiv(aigi));
        aiig.mo37521a(ahjk.m55878a(aigi));
        aiig.mo37523a(new aiga(aigi));
        aiig.mo37525a(str);
        aiig.mo37526b(str2);
        SendConnectionRequestParams sendConnectionRequestParams = aiig.f68914a;
        sendConnectionRequestParams.f80620f = bArr;
        mo36596a(sendConnectionRequestParams);
    }

    /* renamed from: a */
    public final void mo36589a(aigi aigi, String str, byte[] bArr, long j) {
        m55884i(j);
        aidg aidg = new aidg();
        aidg.mo37444a(new ahiw(aigi));
        aidg.mo37442a(ahjk.m55878a(aigi));
        aidg.mo37445a(str);
        AcceptConnectionRequestParams acceptConnectionRequestParams = aidg.f68797a;
        acceptConnectionRequestParams.f80561d = bArr;
        mo36590a(acceptConnectionRequestParams);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36590a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
        if (acceptConnectionRequestParams.f80562e == null) {
            sdo.checkIfNull(acceptConnectionRequestParams.f80559b, "AcceptConnection requires either a ConnectionEventListener or PayloadListener but neither was found.");
            aigr aigr = acceptConnectionRequestParams.f80558a;
            ahjj ahjj = this.f67286g;
            if (ahjj != null) {
                ahjj.f67273b = aigr;
                ahjj.f67272a = acceptConnectionRequestParams.f80559b;
                aigr = new ahji(ahjj, acceptConnectionRequestParams);
            }
            aidg aidg = new aidg(acceptConnectionRequestParams);
            aidg.mo37444a(aigr);
            aidg.mo37442a((aifv) null);
            aidg.mo37443a(new ahjc(acceptConnectionRequestParams.f80559b));
            acceptConnectionRequestParams = aidg.f68797a;
        }
        m55881a(acceptConnectionRequestParams.f80558a, "acceptConnectionRequest()");
        m55881a(acceptConnectionRequestParams.f80562e, "acceptConnectionRequest()");
        sdo.m34969a(acceptConnectionRequestParams.f80560c, (Object) "remoteEndpointId cannot be empty");
        m55882a(acceptConnectionRequestParams.f80561d, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        ahki ahki = this.f67280a;
        ahki.mo36637a(acceptConnectionRequestParams.f80558a, new ahke(ahki, acceptConnectionRequestParams, this.f67281b));
    }

    /* renamed from: a */
    public final void mo36591a(CancelPayloadParams cancelPayloadParams) {
        m55881a(cancelPayloadParams.f80563a, "cancelPayload()");
        sdo.checkIfNull(Long.valueOf(cancelPayloadParams.f80564b), "Must specify a Payload to cancel.");
        ahki ahki = this.f67280a;
        ahki.mo36637a(cancelPayloadParams.f80563a, new ahjt(ahki, this.f67281b, cancelPayloadParams));
    }

    /* renamed from: a */
    public final void mo36592a(ClientDisconnectingParams clientDisconnectingParams) {
        mo36604a(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36593a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
        sdo.m34969a(disconnectFromEndpointParams.f80565a, (Object) "remoteEndpointId cannot be empty");
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        ahkv.mo36741r(disconnectFromEndpointParams.f80565a);
        ahki.mo36638a(new ahju(ahki, disconnectFromEndpointParams, ahkv));
    }

    /* renamed from: a */
    public final void mo36594a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        ahkv ahkv = this.f67281b;
        sdo.m34970a(ahkp.m55987a(ahkv.f67387c, ahkv.f67388d, ahkv.f67389e));
        ahki ahki = this.f67280a;
        ahki.mo36637a(initiateBandwidthUpgradeParams.f80566a, new ahkg(ahki, this.f67281b, initiateBandwidthUpgradeParams));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36595a(RejectConnectionRequestParams rejectConnectionRequestParams) {
        m55881a(rejectConnectionRequestParams.f80613a, "rejectConnectionRequest()");
        sdo.m34969a(rejectConnectionRequestParams.f80614b, (Object) "remoteEndpointId cannot be empty");
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        ahkv.mo36741r(rejectConnectionRequestParams.f80614b);
        ahki.mo36637a(rejectConnectionRequestParams.f80613a, new ahkf(ahki, rejectConnectionRequestParams, ahkv));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36596a(SendConnectionRequestParams sendConnectionRequestParams) {
        if (sendConnectionRequestParams.f80621g == null) {
            sdo.checkIfNull(sendConnectionRequestParams.f80616b, "SendConnectionRequest requires either a ConnectionEventListener or ConnectionLifecycleListener but neither was found.");
            sdo.checkIfNull(sendConnectionRequestParams.f80617c, "SendConnectionRequest requires either a ConnectionResponseListener or ConnectionLifecycleListener but neither was found.");
            aiig aiig = new aiig(sendConnectionRequestParams);
            aiig.mo37521a((aifv) null);
            aiig.mo37523a((aigb) null);
            aiig.mo37522a(new ahjb(this, sendConnectionRequestParams.f80616b, sendConnectionRequestParams.f80617c));
            sendConnectionRequestParams = aiig.f68914a;
        }
        m55881a(sendConnectionRequestParams.f80615a, "sendConnectionRequest()");
        m55881a(sendConnectionRequestParams.f80621g, "sendConnectionRequest()");
        sdo.m34969a(sendConnectionRequestParams.f80619e, (Object) "remoteEndpointId cannot be empty");
        ConnectionOptions connectionOptions = sendConnectionRequestParams.f80623i;
        if (connectionOptions != null) {
            byte[] bArr = connectionOptions.f80465i;
            boolean z = false;
            if (!connectionOptions.f80458b || !connectionOptions.f80459c || !connectionOptions.f80460d || !connectionOptions.f80463g || !connectionOptions.f80464h || !connectionOptions.f80462f || bArr != null || connectionOptions.f80466j) {
                ahkv ahkv = this.f67281b;
                sdo.m34971a(ahkp.m55987a(ahkv.f67387c, ahkv.f67388d, ahkv.f67389e), (Object) String.format("Invalid connection options for non-exempt client %s: %s", this.f67281b.f67388d, connectionOptions));
            }
            if (bArr == null || bArr.length == 6) {
                z = true;
            }
            sdo.m34975b(z, "sendConnectionRequest() requires either empty or valid Bluetooth MAC address.");
        }
        m55882a(sendConnectionRequestParams.f80620f, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        ahki ahki = this.f67280a;
        ahkv ahkv2 = this.f67281b;
        ahkv2.mo36737p(sendConnectionRequestParams.f80619e);
        ahki.mo36637a(sendConnectionRequestParams.f80615a, new ahkd(ahki, sendConnectionRequestParams, ahkv2));
    }

    /* renamed from: a */
    public final void mo36597a(SendPayloadParams sendPayloadParams) {
        boolean z;
        m55881a(sendPayloadParams.f80624a, "sendPayload()");
        if (sendPayloadParams.f80625b.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "remoteEndpointIds cannot be empty");
        ParcelablePayload parcelablePayload = sendPayloadParams.f80626c;
        sdo.checkIfNull(parcelablePayload, "Payload cannot be null");
        if (parcelablePayload.f80606b == 1) {
            sdo.checkIfNull(parcelablePayload.f80607c, "Payload bytes cannot be null");
            m55882a(parcelablePayload.f80607c, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        }
        ahki ahki = this.f67280a;
        ahki.mo36637a(sendPayloadParams.f80624a, new ahkh(ahki, this.f67281b, sendPayloadParams));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36598a(StartAdvertisingParams startAdvertisingParams) {
        boolean z;
        if ("__LEGACY_SERVICE_ID__".equals(startAdvertisingParams.f80631d)) {
            sdo.m34969a(this.f67281b.f67386b, (Object) "You must provide a service ID in the application tag of your manifest with a metadata tag with the name com.google.android.gms.nearby.connection.SERVICE_ID");
            aiik aiik = new aiik(startAdvertisingParams);
            aiik.mo37540b(this.f67281b.f67386b);
            startAdvertisingParams = aiik.f68916a;
        } else {
            sdo.m34969a(startAdvertisingParams.f80631d, (Object) "You must provide a non-empty service ID for advertising");
        }
        if (startAdvertisingParams.f80634g == null) {
            sdo.checkIfNull(startAdvertisingParams.f80629b, "StartAdvertising requires either an AdvertisingCallback or ConnectionLifecycleListener but neither was found.");
            this.f67286g = new ahjj(startAdvertisingParams.f80629b);
            aiik aiik2 = new aiik(startAdvertisingParams);
            aiik2.mo37535a((aifs) null);
            aiik2.mo37536a(this.f67286g);
            startAdvertisingParams = aiik2.f68916a;
        }
        AdvertisingOptions advertisingOptions = startAdvertisingParams.f80633f;
        if (advertisingOptions != null) {
            Strategy strategy = advertisingOptions.f80442a;
            if (!Strategy.f80480a.equals(strategy) && !Strategy.f80481b.equals(strategy) && !Strategy.f80482c.equals(strategy)) {
                srn srn = ahkm.f67363a;
                aiik aiik3 = new aiik(startAdvertisingParams);
                ahht ahht = new ahht(advertisingOptions);
                ahht.mo36508a(Strategy.f80480a);
                aiik3.mo37538a(ahht.f67222a);
                startAdvertisingParams = aiik3.f68916a;
            }
        }
        if (startAdvertisingParams.f80633f.f80449h != null) {
            String str = startAdvertisingParams.f80630c;
            byte[] bArr = startAdvertisingParams.f80635h;
            if (str != null) {
                bArr = str.getBytes();
            }
            sdo.checkIfNull(bArr, "Either endpoint name or info must not be null");
            int length = bArr.length;
            if (length <= 17) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34975b(z, String.format(Locale.US, "Invalid endpoint name or info length: %d", Integer.valueOf(length)));
        }
        AdvertisingOptions advertisingOptions2 = startAdvertisingParams.f80633f;
        if (advertisingOptions2 != null && (!advertisingOptions2.f80443b || !advertisingOptions2.f80444c || !advertisingOptions2.f80445d || !advertisingOptions2.f80446e || advertisingOptions2.f80447f != null || advertisingOptions2.f80449h != null || !advertisingOptions2.f80450i || !advertisingOptions2.f80451j || !advertisingOptions2.f80452k || advertisingOptions2.f80453l || advertisingOptions2.f80454m)) {
            ahkv ahkv = this.f67281b;
            sdo.m34971a(ahkp.m55987a(ahkv.f67387c, ahkv.f67388d, ahkv.f67389e), (Object) String.format("Invalid advertising options for non-exempt client %s: %s", this.f67281b.f67388d, advertisingOptions2));
        }
        m55881a(startAdvertisingParams.f80628a, "startAdvertising()");
        m55881a(startAdvertisingParams.f80634g, "startAdvertising()");
        long j = startAdvertisingParams.f80632e;
        m55883h(j);
        m55880a(this.f67284e);
        ahki ahki = this.f67280a;
        ahkv ahkv2 = this.f67281b;
        aigu aigu = startAdvertisingParams.f80628a;
        ahki.f67339b.execute(new ahjy(new ahjz(ahki, ahkv2, startAdvertisingParams), aigu));
        if (j != 0) {
            srn srn2 = ahkm.f67363a;
            this.f67284e = ahfi.m55635b(new ahjm(this, j), j, this.f67283d);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo36599a(StartDiscoveryParams startDiscoveryParams) {
        if (startDiscoveryParams.f80641f == null) {
            sdo.checkIfNull(startDiscoveryParams.f80637b, "StartDiscovery requires either an DiscoveryCallback or DiscoveryListener but neither was found.");
            aiim aiim = new aiim(startDiscoveryParams);
            aiim.mo37543a((aige) null);
            aiim.mo37544a(new ahiz(startDiscoveryParams.f80637b));
            startDiscoveryParams = aiim.f68917a;
        }
        DiscoveryOptions discoveryOptions = startDiscoveryParams.f80640e;
        if (discoveryOptions != null) {
            Strategy strategy = discoveryOptions.f80467a;
            if (!Strategy.f80480a.equals(strategy) && !Strategy.f80481b.equals(strategy) && !Strategy.f80482c.equals(strategy)) {
                srn srn = ahkm.f67363a;
                aiim aiim2 = new aiim(startDiscoveryParams);
                ahik ahik = new ahik(discoveryOptions);
                ahik.mo36534a(Strategy.f80480a);
                aiim2.mo37546a(ahik.f67244a);
                startDiscoveryParams = aiim2.f68917a;
            }
        }
        DiscoveryOptions discoveryOptions2 = startDiscoveryParams.f80640e;
        if (discoveryOptions2 != null && (discoveryOptions2.f80468b || !discoveryOptions2.f80469c || !discoveryOptions2.f80470d || discoveryOptions2.f80472f != null || !discoveryOptions2.f80473g || !discoveryOptions2.f80474h || !discoveryOptions2.f80475i)) {
            ahkv ahkv = this.f67281b;
            sdo.m34971a(ahkp.m55987a(ahkv.f67387c, ahkv.f67388d, ahkv.f67389e), (Object) String.format("Invalid discovery options for non-exempt client %s: %s", this.f67281b.f67388d, discoveryOptions2));
        }
        m55881a(startDiscoveryParams.f80636a, "startDiscovery()");
        m55881a(startDiscoveryParams.f80641f, "startDiscovery()");
        sdo.m34969a(startDiscoveryParams.f80638c, (Object) "serviceId must not be empty");
        long j = startDiscoveryParams.f80639d;
        m55883h(j);
        m55880a(this.f67285f);
        ahki ahki = this.f67280a;
        ahki.mo36637a(startDiscoveryParams.f80636a, new ahkb(ahki, this.f67281b, startDiscoveryParams));
        if (j != 0) {
            srn srn2 = ahkm.f67363a;
            this.f67285f = ahfi.m55635b(new ahjn(this, j), j, this.f67283d);
        }
    }

    /* renamed from: a */
    public final void mo36600a(StopAdvertisingParams stopAdvertisingParams) {
        m55880a(this.f67284e);
        this.f67280a.mo36641c(this.f67281b, false);
    }

    /* renamed from: a */
    public final void mo36601a(StopAllEndpointsParams stopAllEndpointsParams) {
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        ahkv.mo36745u();
        ahki.mo36638a(new ahjv(ahki, ahkv));
    }

    /* renamed from: a */
    public final void mo36602a(StopDiscoveryParams stopDiscoveryParams) {
        m55880a(this.f67285f);
        this.f67280a.mo36642d(this.f67281b, false);
    }

    /* renamed from: a */
    public final void mo36603a(String str, long j) {
        m55884i(j);
        aifo aifo = new aifo();
        aifo.mo37463a(str);
        mo36593a(aifo.f68879a);
    }

    /* renamed from: a */
    public final void mo36604a(boolean z) {
        srn srn = ahkm.f67363a;
        String str = this.f67281b.f67388d;
        m55880a(this.f67284e);
        m55880a(this.f67285f);
        ahhr.m55805a(this.f67283d, "ClientBridge.alarmExecutor");
        ahki ahki = this.f67280a;
        ahkv ahkv = this.f67281b;
        ahkv.mo36745u();
        ahki.mo36638a(new ahjw(ahki, ahkv));
        ahjq ahjq = this.f67287h;
        ahjr ahjr = ahjq.f67289a;
        ahjr.f67294h.remove(ahjq.f67290b);
    }

    /* renamed from: a */
    public final void mo36605a(String[] strArr, byte[] bArr, long j) {
        m55884i(j);
        m55882a(bArr, 4096);
        aiii aiii = new aiii();
        aiii.mo37529a(ahjk.m55879a());
        aiii.mo37532a(strArr);
        aiii.mo37530a(ahko.m55984a(bArr));
        aiii.mo37531a(true);
        mo36597a(aiii.f68915a);
    }
}
