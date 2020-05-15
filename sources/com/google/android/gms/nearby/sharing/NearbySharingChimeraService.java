package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.SpannedString;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbySharingChimeraService extends zzx {

    /* renamed from: a */
    public static final Charset f80888a = Charset.forName("UTF-8");

    /* renamed from: A */
    private boolean f80889A = false;

    /* renamed from: B */
    private boolean f80890B = false;

    /* renamed from: C */
    private boolean f80891C = false;

    /* renamed from: D */
    private boolean f80892D;

    /* renamed from: E */
    private boolean f80893E;

    /* renamed from: F */
    private boolean f80894F;

    /* renamed from: G */
    private ScheduledExecutorService f80895G;

    /* renamed from: H */
    private BroadcastReceiver f80896H;

    /* renamed from: I */
    private BroadcastReceiver f80897I;

    /* renamed from: b */
    public akcd f80898b;

    /* renamed from: k */
    public akbu f80899k;

    /* renamed from: l */
    public final Map f80900l = new C1223np();

    /* renamed from: m */
    public final Map f80901m = new C1223np();

    /* renamed from: n */
    public boolean f80902n = false;

    /* renamed from: o */
    public ajwo f80903o;

    /* renamed from: p */
    public ajna f80904p;

    /* renamed from: q */
    public final Context f80905q = new C1416ut(this, 2132018138);

    /* renamed from: r */
    public ajvg f80906r = new ajvg();

    /* renamed from: s */
    public long f80907s;

    /* renamed from: t */
    public C1240of f80908t;

    /* renamed from: u */
    public C1240of f80909u;

    /* renamed from: v */
    public volatile soa f80910v;

    /* renamed from: w */
    public final ajmw f80911w = new ajmw();

    /* renamed from: x */
    private boolean f80912x;

    /* renamed from: y */
    private akcc f80913y;

    /* renamed from: z */
    private int f80914z = -1;

    public NearbySharingChimeraService() {
        super(194, "com.google.android.gms.nearby.sharing.START_SERVICE", Collections.emptySet(), 3, 9);
    }

    /* renamed from: A */
    private final boolean m67470A() {
        return !this.f80900l.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: B */
    private final boolean m67471B() {
        for (Map.Entry entry : this.f80901m.entrySet()) {
            int i = ((ajmx) entry.getValue()).f70945b;
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return true;
            }
            while (r0.hasNext()) {
            }
        }
        return false;
    }

    /* renamed from: C */
    private final void m67472C() {
        this.f80903o.mo39006f();
        this.f80902n = false;
        this.f80891C = false;
        this.f80904p.mo38809a();
        airz.m57841a().mo37921a("NearbySharing", (PendingIntent) null);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Fast Initiation Scanning has stopped");
    }

    /* renamed from: a */
    private static String m67473a(Account account, String str) {
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: x */
    private final bngx m67475x() {
        return this.f80911w.mo38799a();
    }

    /* renamed from: y */
    private final bngx m67476y() {
        return this.f80911w.mo38806b();
    }

    /* renamed from: z */
    private final void m67477z() {
        this.f80889A = true;
        if (cfov.m142026B()) {
            mo44441f();
            return;
        }
        mo44442g();
        if (cfov.m142059l()) {
            mo44443h();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: b */
    public final int mo44429b(ShareTarget shareTarget) {
        int d = mo44420a(shareTarget).mo38792d(shareTarget);
        this.f80908t = null;
        soa soa = this.f80910v;
        if (soa != null) {
            soa.interrupt();
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68422a("Client cancelled file with %s, result: %s", (Object) shareTarget, d);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final akcd mo44435c() {
        akcd b = this.f80911w.mo38805b("INTERNAL_PROVIDER_ID");
        if (b == null) {
            if (cfov.f185185a.mo6606a().mo82372bt()) {
                b = new akhg();
            } else if (!mo44446k()) {
                b = new akcx(this, this.f80899k, this.f80906r);
            } else {
                b = new akgy(this, this.f80899k, this.f80906r);
            }
            this.f80911w.mo38801a(b, new ajmv("INTERNAL_PROVIDER_ID", getPackageName()));
        }
        return b;
    }

    /* renamed from: d */
    public final int mo44438d(boolean z) {
        int i;
        if (mo44446k() == z) {
            return 35500;
        }
        String str = "enabled";
        mo44439d().edit().putBoolean(str, z).apply();
        if (!z) {
            mo44458w();
            mo44455t();
            m67472C();
            this.f80898b.mo38797h();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Shut down SharingProvider");
            ahhd.m55766a(this.f80905q, this.f80896H);
            ahhd.m55766a(this.f80905q, this.f80897I);
            aeat.m51532a(this.f80905q).mo33986a("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
        }
        this.f80911w.mo38803a("INTERNAL_PROVIDER_ID");
        this.f80898b = mo44435c();
        if (z) {
            ajna.m58862c();
            mo44422a();
        }
        this.f80898b.mo38782a(mo44448m());
        if (cfov.m142026B()) {
            mo44441f();
        } else {
            mo44442g();
        }
        mo44457v();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        if (!z) {
            str = "disabled";
        }
        bnsl.mo68420a("NearbySharing was %s", str);
        ajvg ajvg = this.f80906r;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bxvd d = ajvh.m59107d(3);
        bxvd da = bvfh.f155864c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfh bvfh = (bvfh) da.f164949b;
        bvfh.f155867b = i - 1;
        bvfh.f155866a |= 1;
        bvfh bvfh2 = (bvfh) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfh2.getClass();
        bvgd.f155967d = bvfh2;
        bvgd.f155964a |= 8;
        ajvg.mo38958a(new ajvb((bvgd) d.mo74062i()));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.write("\n");
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.NearbySharingService"));
        printWriter.write(String.format("  Version: %s\n", cfov.m142047W()));
        printWriter.write(String.format("  Device Type: %s\n", cfov.m142060m()));
        printWriter.write(String.format("  Account Type: %s\n", cfov.m142049b()));
        printWriter.write(String.format("  Device name: %s\n", mo44439d().getString("device_name", "null")));
        printWriter.write(String.format("  isOptedIn: %s\n", Boolean.valueOf(mo44445j())));
        printWriter.write(String.format("  isEnabled: %s\n", Boolean.valueOf(mo44446k())));
        printWriter.write(String.format("  isAdvertising: %s\n", Boolean.valueOf(mo44454s())));
        printWriter.write(String.format("  isScanning: %s\n", Boolean.valueOf(this.f80912x)));
        printWriter.write(String.format("  isTransferringFiles: %s\n", Boolean.valueOf(this.f80889A)));
        printWriter.write(String.format("  isScreenUnlocked: %s\n", Boolean.valueOf(this.f80892D)));
        printWriter.write(String.format("  isBluetoothEnabled: %s\n", Boolean.valueOf(this.f80894F)));
        printWriter.write(String.format("  isLocationEnabled: %s\n", Boolean.valueOf(this.f80893E)));
        Object[] objArr = new Object[1];
        int m = mo44448m();
        if (m == 0) {
            str = "NO_ONE";
        } else if (m == 1) {
            str = "ALL_CONTACTS";
        } else if (m != 2) {
            int m2 = mo44448m();
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN[");
            sb.append(m2);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "SELECTED_CONTACTS";
        }
        objArr[0] = str;
        printWriter.write(String.format("  Visibility: %s\n", objArr));
        printWriter.write(String.format("  Data Usage Preference: %s\n", mo44436c(mo44447l())));
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Integer num : this.f80900l.values()) {
            int intValue = num.intValue();
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            if (intValue == 0) {
                sb2.append("ReceiveSurfaceState.BACKGROUND");
            } else if (intValue != 1) {
                sb2.append("SendSurfaceState.UNKNOWN");
            } else {
                sb2.append("ReceiveSurfaceState.FOREGROUND");
            }
        }
        sb2.append("]");
        objArr2[0] = sb2.toString();
        printWriter.write(String.format("  Registered receive surfaces: %s\n", objArr2));
        Object[] objArr3 = new Object[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[");
        for (ajmx ajmx : this.f80901m.values()) {
            if (sb3.length() > 1) {
                sb3.append(", ");
            }
            int i = ajmx.f70945b;
            if (i == 0) {
                sb3.append("SendSurfaceState.BACKGROUND");
            } else if (i == 1) {
                sb3.append("SendSurfaceState.FOREGROUND");
            } else if (i != 2) {
                sb3.append("SendSurfaceState.UNKNOWN");
            } else {
                sb3.append("SendSurfaceState.DIRECT_SHARE_SERVICE");
            }
        }
        sb3.append("]");
        objArr3[0] = sb3.toString();
        printWriter.write(String.format("  Registered send surfaces: %s\n", objArr3));
        printWriter.write(String.format("  isFastInitAdvertising: %s\n", Boolean.valueOf(this.f80903o.mo39003c())));
        printWriter.write(String.format("  isFastInitScanning: %s\n", Boolean.valueOf(this.f80903o.mo39005e())));
        ajwo ajwo = this.f80903o;
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.discovery.FastInitiation"));
        printWriter.write(String.format("  Scan mode: %s\n", ajwo.m59132c(ajwo.f71438b)));
        printWriter.write(String.format("  Current advertising fast init type: %s\n", ajwo.m59134d(ajwo.f71441e)));
        printWriter.write(String.format("  Reported BLE meta data: %s\n", ajwo.f71440d));
        printWriter.write(String.format("  %s\n", "Sighted BLE peripherals"));
        bnrd a = bnhe.m109413a(ajwo.f71439c).entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            printWriter.write(String.format("    %s -> %s\n", entry.getKey(), entry.getValue()));
        }
        printWriter.flush();
        this.f80899k.mo39168a(printWriter);
        this.f80898b.mo38784a(printWriter);
        printWriter.flush();
    }

    /* renamed from: e */
    public final void mo44440e() {
        Object obj;
        aucb c = akhu.m59736c(this);
        try {
            aucu.m76782a(c);
            obj = c.mo50386d();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the task.", "getSupportedAccounts");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            obj = null;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            mo44418a((Account) null);
            return;
        }
        String string = mo44439d().getString("account", "");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) arrayList.get(i);
            i++;
            if (string.equals(account.name)) {
                mo44418a(account);
                return;
            }
        }
        mo44418a((Account) arrayList.get(0));
    }

    /* renamed from: f */
    public final void mo44441f() {
        mo44443h();
        mo44442g();
    }

    /* renamed from: g */
    public final void mo44442g() {
        mo44444i();
        if (!this.f80892D) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because the screen is locked.");
            m67472C();
        } else if (!this.f80893E) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because location is disabled.");
        } else if (!this.f80894F && !this.f80903o.mo39002b()) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because Bluetooth is disabled.");
        } else if (mo44446k() && mo44451p()) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because we're visible to everyone already.");
        } else if (this.f80912x) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because we're scanning for other devices.");
        } else if (this.f80889A) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because we're currently in the midst of a transfer.");
        } else if (mo44445j() && !mo44446k()) {
            m67472C();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init because we're disabled.");
        } else if (!this.f80892D) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan for fast initiation because the user's screen is locked.");
        } else if (!this.f80893E) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan for fast initiation because location is disabled.");
        } else {
            boolean k = mo44446k();
            if (mo44456u()) {
                if (k != this.f80891C) {
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Restarting scanning for fast initiation with isHighPowerAllowed=%s", Boolean.valueOf(k));
                    m67472C();
                } else {
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Failed to scan for fast initiation because we're already scanning with isHighPowerAllowed=%s.", Boolean.valueOf(this.f80891C));
                    return;
                }
            }
            airz.m57841a().mo37921a("NearbySharing", PendingIntent.getActivity(this, 0, new Intent().setClassName(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT), JGCastService.FLAG_PRIVATE_DISPLAY));
            if (!this.f80894F && !this.f80903o.mo39002b()) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan for fast initiation because Bluetooth is disabled.");
            } else if (this.f80903o.mo38999a(k, new ajjf(this))) {
                this.f80891C = k;
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Fast Initiation Scanning has started");
            } else {
                this.f80891C = false;
            }
        }
    }

    /* renamed from: h */
    public final void mo44443h() {
        if (!this.f80892D) {
            mo44458w();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping discovery because the screen is locked.");
        } else if (!this.f80894F) {
            mo44458w();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping discovery because Bluetooth is disabled.");
        } else if (!mo44446k()) {
            mo44458w();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping discovery because Nearby Sharing is disabled.");
        } else if (this.f80889A || this.f80890B) {
            mo44458w();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping discovery because we're currently in the midst of a transfer.");
        } else if (!m67471B()) {
            mo44458w();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping discovery because no scanning surface has been registered.");
        } else if (!mo44446k()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan because we're not enabled.");
        } else if (!this.f80892D) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan because the user's screen is locked.");
        } else if (!this.f80894F) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan because Bluetooth is off.");
        } else if (this.f80912x) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan because we're currently scanning.");
        } else if (!m67471B()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to scan because there's no scanning send surface registered.");
        } else {
            this.f80907s = SystemClock.elapsedRealtime();
            this.f80912x = true;
            mo44442g();
            int i = this.f80914z;
            if (i == -1) {
                i = mo44447l();
            }
            ajkd ajkd = new ajkd(this);
            akby akby = new akby();
            akby.f71571a = i;
            ajvd ajvd = new ajvd();
            int i2 = 2;
            if (!mo44428a(1)) {
                if (!mo44428a(3)) {
                    if (!mo44428a(2)) {
                        i2 = 0;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 1;
            }
            ajvd.f71347a = i2;
            akby.f71572b = ajvd.mo38955a();
            akbz akbz = new akbz(akby.f71571a, akby.f71572b);
            if (m67475x().isEmpty()) {
                ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Failed to scan since no provider has been registered");
            } else {
                this.f80898b.mo38783a(ajkd, akbz);
                bnre i3 = m67476y().listIterator();
                while (i3.hasNext()) {
                    ((akcd) i3.next()).mo38783a(ajkd, akbz);
                }
                mo44443h();
                mo44452q();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Scanning has started");
            }
        }
        if (!this.f80894F) {
            this.f80903o.mo39004d();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init advertisement because Bluetooth is off.");
        } else if (!this.f80912x && !this.f80890B) {
            this.f80903o.mo39004d();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping Fast Init advertisement because we're not scanning.");
        } else {
            if (this.f80903o.mo38998a(true ^ mo44428a(new Integer[]{1}) ? 1 : 0)) {
                ajvg ajvg = this.f80906r;
                bxvd d = ajvh.m59107d(10);
                bvfv bvfv = bvfv.f155927a;
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                bvgd bvgd = (bvgd) d.f164949b;
                bvgd bvgd2 = bvgd.f155960B;
                bvfv.getClass();
                bvgd.f155974k = bvfv;
                bvgd.f155964a |= 1024;
                ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
            }
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Starting Fast Init advertisement because we're currently scanning/connecting.");
        }
    }

    /* renamed from: i */
    public final void mo44444i() {
        akcc akcc;
        if (!this.f80892D) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because the screen is locked.");
        } else if (!this.f80894F) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because Bluetooth is disabled.");
        } else if (!mo44446k()) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because Nearby Sharing is disabled.");
        } else if (this.f80912x) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because we're scanning for other devices.");
        } else if (this.f80889A) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because we're currently in the midst of a transfer.");
        } else if (!m67470A()) {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because no receive surface is registered.");
        } else if (mo44448m() != 0 || mo44451p()) {
            if (mo44451p()) {
                akcc = akcc.HIGH_POWER;
            } else if (this.f80902n) {
                akcc = akcc.MEDIUM_POWER;
            } else {
                akcc akcc2 = akcc.LOW_POWER;
                mo44455t();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Stopping advertising with power level %s, since there's no scanning phone nearby and no receiver surface in foreground.", akcc2);
                return;
            }
            String n = mo44451p() ? mo44449n() : null;
            if (!mo44446k()) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to advertise because we're not enabled.");
            } else if (this.f80912x) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to advertise because we're currently scanning for other devices.");
            } else if (!m67470A()) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to advertise because there's no receive surface registered.");
            } else if (!this.f80892D) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to advertise because the user's screen is locked.");
            } else if (!this.f80894F) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to advertise because Bluetooth is off.");
            } else {
                int l = mo44447l();
                if (mo44454s()) {
                    if (akcc.equals(this.f80913y) && l == this.f80914z) {
                        ((bnsl) ajvp.f71371a.mo68390d()).mo68424a("Failed to advertise because we're already advertising with power level %s and data usage preference %s", this.f80913y, mo44436c(this.f80914z));
                        return;
                    } else {
                        mo44455t();
                        ((bnsl) ajvp.f71371a.mo68390d()).mo68424a("Restart advertising with power level %s and data usage preference %s", akcc, mo44436c(l));
                    }
                }
                ajju ajju = new ajju(this);
                akbv akbv = new akbv();
                akbv.f71566a = akcc;
                akbw akbw = new akbw(akbv.f71566a, l);
                this.f80898b.mo38785a(n, ajju, akbw);
                if (cfov.m142064q() && akcc == akcc.HIGH_POWER) {
                    bnre i = m67476y().listIterator();
                    while (i.hasNext()) {
                        ((akcd) i.next()).mo38785a(n, ajju, akbw);
                    }
                }
                mo44452q();
                this.f80913y = akcc;
                this.f80914z = l;
                ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Advertising has started with power level %s", akcc);
            }
        } else {
            mo44455t();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Stopping advertising because no high power receive surface is registered and device is visible to NO_ONE.");
        }
    }

    /* renamed from: j */
    public final boolean mo44445j() {
        return mo44439d().getBoolean("opt_in", false);
    }

    /* renamed from: k */
    public final boolean mo44446k() {
        if (cfov.m142066s()) {
            return mo44439d().getBoolean("enabled", false);
        }
        return false;
    }

    /* renamed from: l */
    public final int mo44447l() {
        return mo44439d().getInt("data_usage", 2);
    }

    /* renamed from: m */
    public final int mo44448m() {
        Account r = mo44453r();
        if (r == null) {
            return 0;
        }
        int i = mo44439d().getInt("visibility", 1);
        return cfov.m142038N() ? mo44439d().getInt(m67473a(r, "visibility"), i) : i;
    }

    /* renamed from: n */
    public final String mo44449n() {
        String str;
        int i;
        String str2;
        String string = mo44439d().getString("device_name", "");
        if (TextUtils.isEmpty(string)) {
            Context context = this.f80905q;
            Account r = mo44453r();
            String str3 = null;
            if (!Locale.ENGLISH.getDisplayLanguage().equals(Locale.getDefault().getDisplayLanguage())) {
                str = null;
            } else {
                if (r != null) {
                    try {
                        str = ((akht) aucu.m76782a(akhu.m59733b(context, r))).mo39462b();
                    } catch (InterruptedException | ExecutionException e) {
                    }
                }
                Cursor a = ahgk.m55686a(context, ContactsContract.Profile.CONTENT_URI);
                if (a != null) {
                    try {
                        str2 = ahgk.m55691a(a, "display_name");
                    } finally {
                        a.close();
                    }
                } else {
                    str2 = null;
                }
                str = !TextUtils.isEmpty(str2) ? (String) bnjd.m109588b(bmyx.m108644b("\\s+").mo66918a((CharSequence) str2), 0) : null;
            }
            if (TextUtils.isEmpty(str) || bmwb.m108443a("null", str)) {
                string = akis.m59851b(context);
            } else {
                C1416ut utVar = (C1416ut) context;
                Resources a2 = utVar.mo16091a();
                if (!akim.m59832d(context)) {
                    i = C0126R.string.sharing_device_type_phone;
                } else {
                    i = C0126R.string.sharing_device_type_tablet;
                }
                CharSequence text = a2.getText(i);
                int integer = utVar.mo16091a().getInteger(C0126R.integer.sharing_max_name_length_bytes);
                int a3 = akid.m59786a(context.getString(C0126R.string.sharing_default_device_name, "", text));
                if (a3 >= integer) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68432a("akis", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Device type string is longer than char limit.");
                } else {
                    str3 = akiq.m59845a(str, integer - a3);
                }
                if (TextUtils.isEmpty(str3)) {
                    string = akis.m59851b(context);
                } else {
                    string = context.getString(C0126R.string.sharing_default_device_name, str3, text);
                }
            }
            CharSequence filter = new butm(getResources().getInteger(C0126R.integer.sharing_max_name_length_bytes)).filter(string, 0, string.length(), new SpannedString(""), 0, 0);
            if (filter != null) {
                string = filter.toString();
            }
            this.f80899k.mo39174c(string);
        }
        return string;
    }

    /* renamed from: o */
    public final void mo44450o() {
        this.f80889A = false;
        if (cfov.m142026B()) {
            mo44425a(new ajjo(this), cfov.m142043S());
            return;
        }
        mo44425a(new ajjp(this), cfov.m142043S());
        if (cfov.m142059l()) {
            mo44425a(new ajjq(this), cfov.m142043S());
        }
    }

    public final void onCreate() {
        if (this.f80895G == null) {
            this.f80895G = ahhr.m55804a();
        }
        if (this.f80899k == null) {
            Context context = this.f80905q;
            String string = mo44439d().getString("device_id", null);
            if (string == null) {
                SecureRandom secureRandom = new SecureRandom();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
                }
                string = sb.toString();
                mo44439d().edit().putString("device_id", string).apply();
            }
            this.f80899k = new akbu(context, string);
        }
        if (this.f80898b == null) {
            this.f80898b = mo44435c();
        }
        ajna a = ajna.m58860a(this.f80905q);
        this.f80904p = a;
        a.mo38816b();
        this.f80903o = new ajwo(this);
        final PowerManager powerManager = (PowerManager) getSystemService("power");
        final KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        C16122 r3 = new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16122 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjv ajjv = new ajjv(this, powerManager, keyguardManager);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjv);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(r3, intentFilter);
        mo44424a(new ajjk(this, powerManager, keyguardManager));
        registerReceiver(new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16133 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjw ajjw = new ajjw(this, context);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjw);
            }
        }, new IntentFilter("android.location.MODE_CHANGED"));
        mo44424a(new ajjl(this));
        registerReceiver(new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16144 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjx ajjx = new ajjx(this);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjx);
            }
        }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        mo44424a(new ajjm(this));
        C16111 r0 = new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16111 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjr ajjr = new ajjr(this, intent);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjr);
            }
        };
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        registerReceiver(r0, intentFilter2, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", null);
        mo44424a(new ajjc(this));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("NearbySharingService created");
    }

    public final void onDestroy() {
        mo44424a(new ajjj(this));
        ahhr.m55805a(this.f80895G, "NearbySharingServiceExecutor");
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("NearbySharingService destroyed");
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }

    /* renamed from: p */
    public final boolean mo44451p() {
        return this.f80900l.containsValue(1);
    }

    /* renamed from: q */
    public final void mo44452q() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!mo44439d().contains("privacy_notification")) {
            mo44439d().edit().putLong("privacy_notification", currentTimeMillis).apply();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Timestamp saved in shared preference for the first time");
            return;
        }
        long j = mo44439d().getLong("privacy_notification", currentTimeMillis);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("Timestamp for last notification is %d", j);
        if (currentTimeMillis - j > cfov.m142030F() * TimeUnit.DAYS.toMillis(1)) {
            ajna ajna = this.f80904p;
            ahgl ahgl = new ahgl(ajna.f70952a, "nearby_sharing_privacy");
            ahgl.mo36442i();
            ahgl.mo36429b(akia.m59783b(C1133kh.m17836a(ajna.f70952a, (int) C0126R.C0127drawable.sharing_ic_launcher)));
            ahgl.mo36440g(ajna.f70952a.getText(C0126R.string.sharing_notification_privacy_title));
            ahgl.mo36438f(ajna.f70952a.getText(C0126R.string.sharing_notification_privacy_description));
            ahgl.f22254f = PendingIntent.getActivity(ajna.f70952a, 1001, new Intent().setClassName(ajna.f70952a, "com.google.android.gms.nearby.sharing.SettingsActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT), 134217728);
            ahgl.mo36439g();
            ahgl.f22258j = 0;
            ahgl.f22269u = "msg";
            ahgl.mo36435d(true);
            ahgl.f22271w = akim.m59827a(ajna.f70952a);
            ahgl.f22266r = "nearby_sharing";
            ahgl.mo36427a(ajna.f70952a.getString(C0126R.string.sharing_product_name));
            ajna.mo38810a(ahgl);
            ajna.mo38814a("nearby_sharing", 4, ahgl.mo13629b());
            mo44439d().edit().putLong("privacy_notification", currentTimeMillis).apply();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("Sharing enabled and have at least one preferred visibility. %d days since last notification. Privacy notification displayed. Timestamp updated.", cfov.m142030F());
        }
    }

    /* renamed from: r */
    public final Account mo44453r() {
        return this.f80899k.mo39171b();
    }

    /* renamed from: s */
    public final boolean mo44454s() {
        return this.f80913y != null;
    }

    /* renamed from: t */
    public final void mo44455t() {
        if (!mo44454s()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to stop advertising because we weren't advertising.");
            return;
        }
        this.f80898b.mo38789b();
        if (cfov.m142064q() && this.f80913y == akcc.HIGH_POWER) {
            bnre i = m67476y().listIterator();
            while (i.hasNext()) {
                ((akcd) i.next()).mo38789b();
            }
        }
        this.f80914z = -1;
        this.f80913y = null;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Advertising has stopped");
    }

    /* renamed from: u */
    public final boolean mo44456u() {
        return this.f80903o.mo39005e();
    }

    /* renamed from: v */
    public final void mo44457v() {
        ahhd.m55769a(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Broadcasting NearbySharing state change.");
    }

    /* renamed from: w */
    public final void mo44458w() {
        if (!this.f80912x) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to stop scanning because weren't scanning.");
            return;
        }
        bnre i = m67475x().listIterator();
        while (i.hasNext()) {
            ((akcd) i.next()).mo38781a();
        }
        this.f80912x = false;
        mo44425a(new ajjn(this), cfov.m142043S());
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Scanning has stopped.");
    }

    /* renamed from: a */
    public static void m67474a(String str, String str2, rnt rnt, Callable callable) {
        String str3;
        int i = 13;
        if (cfov.m142066s()) {
            try {
                i = ((Integer) callable.call()).intValue();
            } catch (Exception e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68424a("Exception while executing NearbySharingService call %s for calling package %s.", str2, str);
            }
        }
        Status status = new Status(i);
        if (!status.mo17710c()) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            switch (i) {
                case 35500:
                    str3 = "STATUS_ALREADY_IN_DESIRED_STATE";
                    break;
                case 35501:
                    str3 = "STATUS_DISABLED";
                    break;
                case 35502:
                    str3 = "STATUS_ALREADY_STOPPED";
                    break;
                case 35503:
                    str3 = "STATUS_RESET";
                    break;
                case 35504:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_RECEIVE_SURFACE_ALLOWED";
                    break;
                case 35505:
                    str3 = "STATUS_ACCOUNT_NOT_LOGGED_IN";
                    break;
                case 35506:
                    str3 = "STATUS_DISK_IO_ERROR";
                    break;
                case 35507:
                    str3 = "STATUS_CONTACT_ALREADY_EXISTS";
                    break;
                case 35508:
                    str3 = "STATUS_CONTACT_DOES_NOT_EXIST";
                    break;
                case 35509:
                    str3 = "STATUS_ACTIVITY_NOT_FOUND";
                    break;
                case 35510:
                    str3 = "STATUS_NETWORK_IO_ERROR";
                    break;
                case 35511:
                    str3 = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 35512:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_SEND_SURFACE_ALLOWED";
                    break;
                case 35513:
                    str3 = "STATUS_ACCESS_DENIED";
                    break;
                default:
                    str3 = rjs.m33677c(i);
                    break;
            }
            bnsl2.mo68425a("NearbySharingService call %s returned nonzero status code for calling package %s: %s", str2, str, str3);
        }
        try {
            rnt.mo11797a(status);
        } catch (RemoteException e2) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68405a("Failed to invoke IStatusCallback.");
        }
    }

    /* renamed from: b */
    public final List mo44430b(int i) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f80900l.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add((ajud) entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo44431b(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        bnic a = bnic.m109496a((Object[]) numArr);
        for (Map.Entry entry : this.f80901m.entrySet()) {
            if (a.contains(Integer.valueOf(((ajmx) entry.getValue()).f70945b))) {
                arrayList.add(new C1240of((ajud) entry.getKey(), ((ajmx) entry.getValue()).f70944a));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo44432b() {
        this.f80898b.mo38796g();
        if (!mo44445j()) {
            return;
        }
        if (this.f80899k.mo39171b() == null) {
            mo44416a(0);
        } else if (cfov.m142031G()) {
            new ajvw(this.f80905q).mo38980a(this.f80899k.mo39171b()).mo50373a(new ajji(this));
        }
    }

    /* renamed from: a */
    public final int mo44416a(int i) {
        Account r = mo44453r();
        if (cfov.m142038N() && r == null) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Cannot change device visibility without an account.");
            return 13;
        }
        int m = mo44448m();
        if (m == i) {
            if (mo44439d().contains("visibility")) {
                return 35500;
            }
            if (cfov.m142038N() && mo44439d().contains(m67473a(r, "visibility"))) {
                return 35500;
            }
            this.f80906r.mo38958a(ajvh.m59102a(i, i));
            return 35500;
        } else if (i == 0 || i == 1 || i == 2) {
            if (cfov.m142038N()) {
                mo44439d().edit().putInt(m67473a(r, "visibility"), i).apply();
            } else {
                mo44439d().edit().putInt("visibility", i).apply();
            }
            this.f80898b.mo38782a(i);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68409a("Visibility mode changed to %d", i);
            this.f80906r.mo38958a(ajvh.m59102a(m, i));
            if (mo44454s()) {
                mo44455t();
            }
            mo44442g();
            mo44457v();
            return 0;
        } else {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Invalid visibility. Refer to SharingClient to see all valid cases.");
            return 13;
        }
    }

    /* renamed from: c */
    public final String mo44436c(int i) {
        if (i == 1) {
            return "OFFLINE";
        }
        if (i == 2) {
            return "ONLINE";
        }
        if (i == 3) {
            return "WIFI_ONLY";
        }
        int l = mo44447l();
        StringBuilder sb = new StringBuilder(20);
        sb.append("UNKNOWN[");
        sb.append(l);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo44437c(boolean z) {
        this.f80894F = z;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Bluetooth is %s", !z ? "disabled" : "enabled");
        mo44441f();
    }

    /* renamed from: b */
    public final void mo44433b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!transferMetadata.f81056e) {
            int i = transferMetadata.f81052a;
            if (i == 12) {
                this.f80890B = false;
                m67477z();
            } else if (i == 2) {
                this.f80890B = false;
                m67477z();
            }
        } else {
            this.f80890B = false;
            mo44450o();
        }
        List b = mo44431b(1, 3);
        if (b.isEmpty()) {
            b = mo44431b(0);
        }
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ajud) ((C1240of) b.get(i2)).f26798a).mo38711a(shareTarget, transferMetadata);
        }
        if (!mo44428a(1, 3) || !transferMetadata.f81056e) {
            ajub a = ajub.m59030a(transferMetadata);
            a.mo38918b();
            this.f80909u = new C1240of(shareTarget, a.mo38916a());
        } else {
            this.f80909u = null;
        }
        if (!cfov.m142059l()) {
            mo44443h();
        }
    }

    /* renamed from: b */
    public final void mo44434b(boolean z) {
        String str;
        this.f80893E = z;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        if (!z) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        bnsl.mo68420a("Location is %s", str);
        if (cfov.m142026B()) {
            mo44441f();
        } else {
            mo44442g();
        }
    }

    /* renamed from: a */
    public final int mo44417a(ajud ajud, ajsn ajsn, int i) {
        C1240of ofVar;
        if (!cfov.m142035K()) {
            if (mo44428a(1, 3) && (i == 1 || i == 3)) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Only one foreground send surface allowed.");
                return 35512;
            }
        }
        if ((i == 1 || i == 3) && (ofVar = this.f80909u) != null) {
            ajsn.mo38707a((ShareTarget) ofVar.f26798a);
            C1240of ofVar2 = this.f80909u;
            ajud.mo38711a((ShareTarget) ofVar2.f26798a, (TransferMetadata) ofVar2.f26799b);
            if (!cfov.m142035K() && ((TransferMetadata) this.f80909u.f26799b).f81056e) {
                this.f80909u = null;
            }
        }
        this.f80901m.put(ajud, new ajmx(ajsn, i));
        for (ShareTarget shareTarget : this.f80898b.mo38795f()) {
            ajsn.mo38707a(shareTarget);
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("A share sheet has been registered");
        mo44443h();
        mo44457v();
        return 0;
    }

    /* renamed from: d */
    public final SharedPreferences mo44439d() {
        return getSharedPreferences("nearbysharing:service:state", 0);
    }

    /* renamed from: a */
    public final int mo44418a(Account account) {
        if (!this.f80899k.mo39170a(account)) {
            return 13;
        }
        if (account != null) {
            mo44439d().edit().putString("account", account.name).apply();
            this.f80906r.mo38959a(this, account);
        } else {
            mo44439d().edit().remove("account").apply();
            this.f80906r.mo38959a(this, (Account) null);
        }
        mo44457v();
        mo44432b();
        return 0;
    }

    /* renamed from: a */
    public final int mo44419a(ShareTarget shareTarget, Intent intent) {
        PendingIntent pendingIntent;
        if (!this.f80912x) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to send file to remote ShareTarget. Not scanning.");
            return 13;
        } else if (this.f80901m.isEmpty()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to send file to remote ShareTarget. No registered share sheet.");
            return 13;
        } else if (this.f80889A) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to send file to remote ShareTarget. Already transferring a file.");
            mo44433b(shareTarget, new ajub(7).mo38916a());
            return 13;
        } else {
            if (shareTarget.mo44499b().isEmpty()) {
                bqgy c = bqgy.m112818c();
                ajke ajke = new ajke(this, shareTarget, c);
                bqgy c2 = bqgy.m112818c();
                new soa(9, new ajjd(this, c2, intent)).start();
                this.f80910v = new soa(9, new ajje(this, ajke, c2));
                this.f80910v.start();
                if (ahhf.m55770a("downloadAttachments", c) != 0) {
                    ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Failed to send file to remote ShareTarget. No attachment found.");
                    mo44433b(shareTarget, new ajub(11).mo38916a());
                    return 13;
                }
            }
            ajvg ajvg = this.f80906r;
            List b = shareTarget.mo44499b();
            bxvd d = ajvh.m59107d(5);
            bxvd da = bvff.f155855c.mo74144da();
            bvfe a = ajvh.m59104a(b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvff bvff = (bvff) da.f164949b;
            a.getClass();
            bvff.f155858b = a;
            bvff.f155857a |= 1;
            bvff bvff2 = (bvff) da.mo74062i();
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            bvgd bvgd = (bvgd) d.f164949b;
            bvgd bvgd2 = bvgd.f155960B;
            bvff2.getClass();
            bvgd.f155969f = bvff2;
            bvgd.f155964a |= 32;
            ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
            if (intent.hasExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE")) {
                shareTarget.f81032e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", intent.getStringExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE"));
            }
            m67477z();
            this.f80890B = true;
            mo44443h();
            if (!cfov.m142065r() || (pendingIntent = shareTarget.f81040m) == null) {
                mo44420a(shareTarget).mo38786a(mo44449n(), shareTarget, new ajkg(this));
                return 0;
            }
            String a2 = this.f80911w.mo38800a(shareTarget);
            if (!TextUtils.isEmpty(a2)) {
                List list = shareTarget.f81034g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    mo44426a(a2, ((FileAttachment) list.get(i)).f80884d);
                }
                try {
                    pendingIntent.send(this, 0, intent);
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68425a("Sent to %s by action %s for package %s", shareTarget, pendingIntent, a2);
                } catch (PendingIntent.CanceledException e) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68425a("Failed to send to %s by action %s for package %s", shareTarget, pendingIntent, a2);
                }
                mo44433b(shareTarget, new ajub(15).mo38916a());
                return 0;
            }
            mo44433b(shareTarget, new ajub(7).mo38916a());
            ((bnsl) ajvp.f71371a.mo68390d()).mo68424a("Unable to send to %s by action %s due to missing package name", shareTarget, pendingIntent);
            return 13;
        }
    }

    /* renamed from: a */
    public final akcd mo44420a(ShareTarget shareTarget) {
        akcd b = this.f80911w.mo38804b(shareTarget);
        if (b != null) {
            return b;
        }
        ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Failed to fetch provider for %s", shareTarget);
        return new akcw();
    }

    /* renamed from: a */
    public final List mo44421a(int i, int i2, ContactFilter contactFilter) {
        List<Contact> c = this.f80898b.mo38791c();
        if (contactFilter != null) {
            Boolean bool = contactFilter.f80852a;
            Boolean bool2 = contactFilter.f80853b;
            Boolean bool3 = contactFilter.f80854c;
            String str = contactFilter.f80855d;
            ArrayList arrayList = new ArrayList();
            for (Contact contact : c) {
                if ((bool == null || contact.f80848e == bool.booleanValue()) && ((bool2 == null || contact.f80850g == bool2.booleanValue()) && (bool3 == null || contact.f80851h == bool3.booleanValue()))) {
                    if (str != null) {
                        String a = bmwb.m108442a(str);
                        if (!bmwb.m108442a(contact.f80846c).contains(a) && !bmwb.m108442a(contact.f80849f.f80857b).contains(a)) {
                        }
                    }
                    arrayList.add(contact);
                }
            }
            c = arrayList;
        }
        Collections.sort(c);
        if (i >= c.size()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68409a("Offset %d >= valid contact list size. Return empty list", i);
            return new ArrayList();
        }
        if (i2 == 0) {
            i2 = c.size();
        }
        return c.subList(i, Math.min(i2 + i, c.size()));
    }

    /* renamed from: a */
    public final void mo44422a() {
        this.f80896H = new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16155 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjy ajjy = new ajjy(this);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjy);
            }
        };
        this.f80897I = new aacn("nearby") {
            /* class com.google.android.gms.nearby.sharing.NearbySharingChimeraService.C16166 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ajjz ajjz = new ajjz(this);
                Charset charset = NearbySharingChimeraService.f80888a;
                nearbySharingChimeraService.mo44424a(ajjz);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        ahhd.m55767a(this, this.f80896H, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        ahhd.m55767a(this, this.f80897I, intentFilter2);
        aeat a = aeat.m51532a(this.f80905q);
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.nearby.sharing.SharingSyncService";
        aebl.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebl.mo34023a(0);
        aebl.f63099k = "SharingServerSync";
        aebl.f63070a = cfov.f185185a.mo6606a().mo82368bp();
        aebl.f63071b = cfov.f185185a.mo6606a().mo82367bo();
        aebm a2 = aebl.mo33974b();
        try {
            a.mo33986a("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
            a.mo33984a(a2);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Scheduled SharingSyncChimeraService periodic task.");
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to schedule server sync task.");
        }
        mo44432b();
        this.f80898b.mo38794e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        int i;
        String str = getServiceRequest.f30230d;
        if (cfov.f185185a.mo6606a().mo82298aG() || spn.m35869b()) {
            i = 2;
        } else {
            if (cfov.m142036L()) {
                if (rfz.m33557a(this.f80905q).mo24610b(str) || ahgv.f67192a.mo36457a(this.f80905q, str)) {
                    i = 3;
                } else if (ahgv.f67193b.mo36457a(this.f80905q, str)) {
                    i = 4;
                }
            }
            i = 1;
        }
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2) {
            aaac.mo16652a(new ajmt(this, str));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("A new client has bound to the NearbySharingService ClientBridge for calling package %s", str);
        } else if (i2 != 3) {
            aaac.mo16650a(35513, (Bundle) null);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("A new client failed to bind to the NearbySharingService for calling package %s", str);
        } else {
            aaac.mo16652a(new ajmu(this, str));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("A new client has bound to the NearbySharingService ExternalClientBridge for calling package %s", str);
        }
    }

    /* renamed from: a */
    public final void mo44423a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int i = transferMetadata.f81052a;
        if (i == 9 || i == 8) {
            this.f80908t = null;
        } else {
            ajub a = ajub.m59030a(transferMetadata);
            a.mo38918b();
            this.f80908t = new C1240of(shareTarget, a.mo38916a());
        }
        if (transferMetadata.f81056e) {
            mo44450o();
        } else if (transferMetadata.f81052a == 2) {
            if (!shareTarget.f81041n && this.f80911w.mo38804b(shareTarget) == null) {
                this.f80911w.mo38802a(shareTarget, "INTERNAL_PROVIDER_ID");
            }
            m67477z();
        }
        List b = mo44430b(mo44451p() ? 1 : 0);
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ajud) b.get(i2)).mo38711a(shareTarget, transferMetadata);
        }
    }

    /* renamed from: a */
    public final void mo44424a(Runnable runnable) {
        this.f80895G.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44425a(Runnable runnable, long j) {
        this.f80895G.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo44426a(String str, Uri uri) {
        this.f80905q.grantUriPermission(str, uri, 1);
        srn srn = ajvp.f71371a;
    }

    /* renamed from: a */
    public final void mo44427a(boolean z) {
        String str;
        this.f80892D = z;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        if (!z) {
            str = "locked";
        } else {
            str = "unlocked";
        }
        bnsl.mo68420a("Screen is %s", str);
        if (cfov.m142026B()) {
            mo44441f();
        } else {
            mo44442g();
        }
    }

    /* renamed from: a */
    public final boolean mo44428a(Integer... numArr) {
        bnic a = bnic.m109496a((Object[]) numArr);
        for (Map.Entry entry : this.f80901m.entrySet()) {
            if (a.contains(Integer.valueOf(((ajmx) entry.getValue()).f70945b))) {
                return true;
            }
        }
        return false;
    }
}
