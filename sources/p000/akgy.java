package p000;

import android.accounts.Account;
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: akgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class akgy implements akcd, akds, akdr {

    /* renamed from: A */
    public int f71927A;

    /* renamed from: B */
    private final Map f71928B = new ConcurrentHashMap();

    /* renamed from: C */
    private final ScheduledExecutorService f71929C;

    /* renamed from: D */
    private final akbu f71930D;

    /* renamed from: E */
    private final WifiManager f71931E;

    /* renamed from: F */
    private volatile akgo f71932F;

    /* renamed from: G */
    private volatile ScheduledFuture f71933G;

    /* renamed from: a */
    public final Map f71934a = new C1223np();

    /* renamed from: b */
    public final Map f71935b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map f71936c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ScheduledExecutorService f71937d = ahhr.m55804a();

    /* renamed from: e */
    public final akgn f71938e = new akgn(this.f71937d, "mutual acceptance timeout");

    /* renamed from: f */
    public final Context f71939f;

    /* renamed from: g */
    public akdw f71940g;

    /* renamed from: h */
    public ajsn f71941h;

    /* renamed from: i */
    public ajud f71942i;

    /* renamed from: j */
    public akcc f71943j;

    /* renamed from: k */
    public int f71944k = 2;

    /* renamed from: l */
    public final ConcurrentMap f71945l = new ConcurrentHashMap();

    /* renamed from: m */
    public final akcl f71946m;

    /* renamed from: n */
    public final akcm f71947n;

    /* renamed from: o */
    public final ajvg f71948o;

    /* renamed from: p */
    final akhl f71949p;

    /* renamed from: q */
    public final akda f71950q;

    /* renamed from: r */
    public long f71951r;

    /* renamed from: s */
    public long f71952s;

    /* renamed from: t */
    public long f71953t;

    /* renamed from: u */
    public long f71954u;

    /* renamed from: v */
    public long f71955v;

    /* renamed from: w */
    public long f71956w;

    /* renamed from: x */
    public volatile int f71957x;

    /* renamed from: y */
    public volatile ScheduledFuture f71958y;

    /* renamed from: z */
    public BroadcastReceiver f71959z;

    public akgy(Context context, akbu akbu, ajvg ajvg) {
        bxtx bxtx;
        this.f71957x = 0;
        this.f71927A = 0;
        this.f71939f = context;
        this.f71930D = akbu;
        this.f71948o = ajvg;
        this.f71940g = new akdw(context);
        this.f71949p = new akhl(context, akbu, ajvg);
        akhl akhl = this.f71949p;
        akhf akhf = new akhf();
        String address = BluetoothAdapter.getDefaultAdapter().getAddress();
        byte[] bArr = null;
        if (!TextUtils.isEmpty(address)) {
            byte[] bArr2 = new byte[6];
            List c = bmyx.m108640a(':').mo66925c((CharSequence) address);
            if (c.size() == 6) {
                for (int i = 0; i < 6; i++) {
                    String valueOf = String.valueOf((String) c.get(i));
                    bArr2[i] = Integer.decode(valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf)).byteValue();
                }
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            bxtx = bxtx.f164797b;
        } else {
            bxtx = bxtx.m123261a(bArr);
        }
        akcl akcl = new akcl(context, akbu, akhf, akhl, bxtx);
        this.f71946m = akcl;
        akhl akhl2 = this.f71949p;
        akhb akhb = new akhb(context, new akhc(context));
        this.f71947n = new akcm(akhb, new akcv(context, akbu, akhb, akcl, akhl2, new ajvw(context), srb.f45012a, ahhr.m55807c()), akbu);
        this.f71950q = new akda();
        if (cfov.m142061n() && sre.m36082b(context)) {
            this.f71949p.mo39448a();
        }
        this.f71949p.mo39449a(new akdx(akbu));
        this.f71929C = ahhr.m55804a();
        this.f71931E = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    private final int m59541a(Intent intent) {
        try {
            this.f71939f.startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akgy", "a", 3584, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to find any activity to start %s", intent);
            return 35509;
        }
    }

    /* renamed from: b */
    private final ajnw m59556b(akdd akdd, ajnv ajnv) {
        ajnw a = m59543a(akdd);
        if (a == null) {
            return null;
        }
        ajnv a2 = ajnv.m58896a(a.f71025b);
        if (a2 == null) {
            a2 = ajnv.UNKNOWN_FRAME_TYPE;
        }
        if (!ajnv.equals(a2)) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "b", 4187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String name = ajnv.name();
            ajnv a3 = ajnv.m58896a(a.f71025b);
            if (a3 == null) {
                a3 = ajnv.UNKNOWN_FRAME_TYPE;
            }
            bnsl.mo68424a("Failed to read %s frame, but got %s. Cached for later.", name, a3.name());
            ConcurrentMap concurrentMap = this.f71945l;
            ajnv a4 = ajnv.m58896a(a.f71025b);
            if (a4 == null) {
                a4 = ajnv.UNKNOWN_FRAME_TYPE;
            }
            concurrentMap.put(a4, a);
            return null;
        }
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl2.mo68432a("akgy", "b", 4194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Successfully read %s frame", ajnv.name());
        return a;
    }

    /* renamed from: c */
    private final void m59561c(ShareTarget shareTarget, String str) {
        ajnz ajnz;
        int i;
        ahiq[] ahiqArr;
        ajud ajud;
        String str2;
        int i2;
        ShareTarget shareTarget2 = shareTarget;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        String str3 = "akgy";
        bnsl.mo68432a(str3, "c", 1732, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Preparing to send introduction to %s", shareTarget2);
        akdd o = mo39422o(shareTarget);
        if (o == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a(str3, "c", 1736, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("No NearbyConnection tied to %s. Disconnecting.", shareTarget2);
            return;
        }
        ajud n = mo39420n(shareTarget);
        if (n == null) {
            o.mo39253b();
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a(str3, "c", 1743, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("No TransferUpdateCallback tied to %s. Disconnecting.", shareTarget2);
            return;
        }
        ahiq[] q = mo39427q(shareTarget);
        ahiq[] p = mo39425p(shareTarget);
        ahiq[] r = mo39428r(shareTarget);
        if (q.length == 0 && p.length == 0 && r.length == 0) {
            n.mo38711a(shareTarget2, new ajub(7).mo38916a());
            o.mo39253b();
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl4.mo68432a(str3, "c", 1755, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("No payloads tied to %s. Disconnecting.", shareTarget2);
            return;
        }
        bxvd da = ajnl.f70979f.mo74144da();
        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl5.mo68432a(str3, "c", 1762, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68420a("Sending attachments to %s", shareTarget2.f81029b);
        int i3 = 0;
        while (i3 < q.length) {
            FileAttachment fileAttachment = (FileAttachment) shareTarget2.f81034g.get(i3);
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl6.mo68432a(str3, "c", 1767, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Preparing file attachment %s", fileAttachment.f80881a);
            if (q[i3] != null) {
                bxvd da2 = ajnh.f70965g.mo74144da();
                String str4 = fileAttachment.f80881a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ajnh ajnh = (ajnh) da2.f164949b;
                str4.getClass();
                ajud = n;
                int i4 = ajnh.f70967a | 1;
                ajnh.f70967a = i4;
                ajnh.f70968b = str4;
                ahiqArr = q;
                long j = q[i3].f67251a;
                int i5 = i4 | 4;
                ajnh.f70967a = i5;
                ajnh.f70970d = j;
                int i6 = fileAttachment.f80882b;
                if (i6 != 1) {
                    i2 = i6 != 2 ? i6 != 3 ? i6 != 4 ? 1 : 5 : 4 : 3;
                } else {
                    i2 = 2;
                }
                ajnh.f70969c = i2 - 1;
                int i7 = i5 | 2;
                ajnh.f70967a = i7;
                String str5 = fileAttachment.f80886f;
                str5.getClass();
                int i8 = i7 | 16;
                ajnh.f70967a = i8;
                ajnh.f70972f = str5;
                str2 = str3;
                long j2 = fileAttachment.f80883c;
                ajnh.f70967a = i8 | 8;
                ajnh.f70971e = j2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ajnl ajnl = (ajnl) da.f164949b;
                ajnh ajnh2 = (ajnh) da2.mo74062i();
                ajnh2.getClass();
                if (!ajnl.f70982b.mo73666a()) {
                    ajnl.f70982b = bxvk.m124021a(ajnl.f70982b);
                }
                ajnl.f70982b.add(ajnh2);
            } else {
                ahiqArr = q;
                ajud = n;
                str2 = str3;
            }
            i3++;
            str3 = str2;
            n = ajud;
            q = ahiqArr;
        }
        ajud ajud2 = n;
        String str6 = str3;
        for (int i9 = 0; i9 < p.length; i9++) {
            TextAttachment textAttachment = (TextAttachment) shareTarget2.f81033f.get(i9);
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a(str6, "c", 1784, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68420a("Preparing text attachment %s", textAttachment.f81048a);
            bxvd da3 = ajnt.f71007e.mo74144da();
            String str7 = textAttachment.f81048a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ajnt ajnt = (ajnt) da3.f164949b;
            str7.getClass();
            int i10 = ajnt.f71009a | 1;
            ajnt.f71009a = i10;
            ajnt.f71010b = str7;
            int i11 = textAttachment.f81049b;
            if (i11 != 0) {
                i = i11 != 1 ? i11 != 2 ? i11 != 3 ? 1 : 5 : 4 : 3;
            } else {
                i = 1;
            }
            ajnt.f71011c = i - 1;
            int i12 = i10 | 2;
            ajnt.f71009a = i12;
            long j3 = p[i9].f67251a;
            ajnt.f71009a = i12 | 4;
            ajnt.f71012d = j3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnl ajnl2 = (ajnl) da.f164949b;
            ajnt ajnt2 = (ajnt) da3.mo74062i();
            ajnt2.getClass();
            if (!ajnl2.f70983c.mo73666a()) {
                ajnl2.f70983c = bxvk.m124021a(ajnl2.f70983c);
            }
            ajnl2.f70983c.add(ajnt2);
        }
        for (int i13 = 0; i13 < r.length; i13++) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) shareTarget2.f81035h.get(i13);
            bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl8.mo68432a(str6, "c", 1796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68420a("Preparing wifi credentials attachment for %s.", wifiCredentialsAttachment.f81057a);
            bxvd da4 = ajoa.f71043e.mo74144da();
            String str8 = wifiCredentialsAttachment.f81057a;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ajoa ajoa = (ajoa) da4.f164949b;
            str8.getClass();
            int i14 = ajoa.f71045a | 1;
            ajoa.f71045a = i14;
            ajoa.f71046b = str8;
            long j4 = r[i13].f67251a;
            ajoa.f71045a = i14 | 4;
            ajoa.f71048d = j4;
            int i15 = wifiCredentialsAttachment.f81058b;
            if (i15 == 0) {
                ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            } else if (i15 == 1) {
                ajnz = ajnz.OPEN;
            } else if (i15 == 2) {
                ajnz = ajnz.WPA_PSK;
            } else if (i15 != 3) {
                ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            } else {
                ajnz = ajnz.WEP;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ajoa ajoa2 = (ajoa) da4.f164949b;
            ajoa2.f71047c = ajnz.f71042e;
            ajoa2.f71045a |= 2;
            ajoa ajoa3 = (ajoa) da4.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnl ajnl3 = (ajnl) da.f164949b;
            ajoa3.getClass();
            if (!ajnl3.f70985e.mo73666a()) {
                ajnl3.f70985e = bxvk.m124021a(ajnl3.f70985e);
            }
            ajnl3.f70985e.add(ajoa3);
        }
        String string = shareTarget2.f81032e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        if (string != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnl ajnl4 = (ajnl) da.f164949b;
            string.getClass();
            ajnl4.f70981a |= 1;
            ajnl4.f70984d = string;
        }
        try {
            ajnl ajnl5 = (ajnl) da.mo74062i();
            bxvd da5 = ajnk.f70974d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ajnk ajnk = (ajnk) da5.f164949b;
            ajnk.f70977b = 1;
            ajnk.f70976a |= 1;
            bxvd da6 = ajnw.f71022h.mo74144da();
            ajnv ajnv = ajnv.INTRODUCTION;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            ajnw ajnw = (ajnw) da6.f164949b;
            ajnw.f71025b = ajnv.f71021g;
            int i16 = ajnw.f71024a | 1;
            ajnw.f71024a = i16;
            ajnl5.getClass();
            ajnw.f71026c = ajnl5;
            ajnw.f71024a = i16 | 2;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ajnk ajnk2 = (ajnk) da5.f164949b;
            ajnw ajnw2 = (ajnw) da6.mo74062i();
            ajnw2.getClass();
            ajnk2.f70978c = ajnw2;
            ajnk2.f70976a |= 2;
            o.mo39251a(((ajnk) da5.mo74062i()).mo73642k());
            try {
                ajvg ajvg = this.f71948o;
                long j5 = this.f71953t;
                int i17 = !shareTarget2.f81038k ? 4 : 3;
                bxvd d = ajvh.m59107d(13);
                bxvd da7 = bvfw.f155929d.mo74144da();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bvfw bvfw = (bvfw) da7.f164949b;
                bvfw.f155931a |= 2;
                bvfw.f155933c = j5;
                bvga b = ajvh.m59105b(i17);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bvfw bvfw2 = (bvfw) da7.f164949b;
                b.getClass();
                bvfw2.f155932b = b;
                bvfw2.f155931a |= 1;
                bvfw bvfw3 = (bvfw) da7.mo74062i();
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                bvgd bvgd = (bvgd) d.f164949b;
                bvgd bvgd2 = bvgd.f155960B;
                bvfw3.getClass();
                bvgd.f155977n = bvfw3;
                bvgd.f155964a |= 8192;
                ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
                bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl9.mo68432a(str6, "c", 1832, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl9.mo68405a("Successfully wrote the introduction frame");
                this.f71938e.mo39360a(shareTarget, o, ajud2, cfov.m142032H());
                ajub ajub = new ajub(2);
                ajub.f71284a = str;
                ajud2.mo38711a(shareTarget2, ajub.mo38916a());
            } catch (IOException e) {
                e = e;
                bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl10.mo68437a(e);
                bnsl10.mo68432a(str6, "c", 1824, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl10.mo68405a("Failed to write the introduction frame. Disconnecting.");
                ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
                o.mo39253b();
            }
        } catch (IOException e2) {
            e = e2;
            bnsl bnsl102 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl102.mo68437a(e);
            bnsl102.mo68432a(str6, "c", 1824, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl102.mo68405a("Failed to write the introduction frame. Disconnecting.");
            ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
            o.mo39253b();
        }
    }

    /* renamed from: d */
    private static List m59563d(List list) {
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = cfov.f185185a.mo6606a().mo82389m().f165797a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (!bxwc.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            }
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "d", 2930, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("NearbySharingProvider removed blacklisted packages: %s", bxwc);
        return arrayList;
    }

    /* renamed from: l */
    public static void m59565l() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Nearby");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgy", "l", 2371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Not deleting the Nearby folder because there are still files remaining");
                return;
            }
            file.delete();
        }
    }

    /* renamed from: u */
    private final TransferMetadata m59566u(ShareTarget shareTarget) {
        String str;
        if (shareTarget.f81036i) {
            str = mo39410h(shareTarget).f71894f;
        } else {
            str = mo39417l(shareTarget).f71899f;
        }
        if (str == null) {
            return new ajub(3).mo38916a();
        }
        ajub ajub = new ajub(3);
        ajub.f71284a = str;
        return ajub.mo38916a();
    }

    /* renamed from: v */
    private final boolean m59567v(ShareTarget shareTarget) {
        if (!cfov.m142053f()) {
            int i = Build.VERSION.SDK_INT;
            WifiManager wifiManager = this.f71931E;
            if (wifiManager != null && !wifiManager.isWifiEnabled()) {
                return false;
            }
        }
        return m59553a(shareTarget.mo44499b(), cfov.f185185a.mo6606a().mo82369bq());
    }

    /* renamed from: w */
    private final boolean m59568w(ShareTarget shareTarget) {
        ShareTarget shareTarget2 = shareTarget;
        boolean z = true;
        if (mo39427q(shareTarget).length > 0 || mo39425p(shareTarget).length > 0 || mo39428r(shareTarget).length > 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "w", 1972, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Skipping payload creation for ShareTarget %s. Payloads already created.", shareTarget2);
            return true;
        }
        boolean z2 = false;
        try {
            List list = shareTarget2.f81034g;
            int size = list.size();
            ahiq[] ahiqArr = new ahiq[size];
            int i = 0;
            while (i < list.size()) {
                FileAttachment fileAttachment = (FileAttachment) list.get(i);
                Uri uri = fileAttachment.f80884d;
                if (uri != null) {
                    ahiq a = ahiq.m55837a(ahio.m55834a(akif.m59796a(this.f71939f, uri)), ahiq.m55836a());
                    ahiqArr[i] = a;
                    mo39382a(fileAttachment, a.f67251a);
                }
                i++;
                z2 = false;
            }
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 2013, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("Created file payloads of length %d", size);
            mo39417l(shareTarget).f71902i = ahiqArr;
            List list2 = shareTarget2.f81033f;
            int size2 = list2.size();
            ahiq[] ahiqArr2 = new ahiq[size2];
            int i2 = 0;
            while (i2 < list2.size()) {
                TextAttachment textAttachment = (TextAttachment) list2.get(i2);
                ahiq a2 = ahiq.m55840a(textAttachment.f81048a.getBytes());
                ahiqArr2[i2] = a2;
                mo39382a(textAttachment, a2.f67251a);
                i2++;
                z2 = false;
            }
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "b", 2025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68409a("Created text payloads of length %d", size2);
            mo39417l(shareTarget).f71901h = ahiqArr2;
            List list3 = shareTarget2.f81035h;
            int size3 = list3.size();
            ahiq[] ahiqArr3 = new ahiq[size3];
            int i3 = 0;
            while (i3 < list3.size()) {
                WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list3.get(i3);
                bxvd da = ajnx.f71031d.mo74144da();
                String str = wifiCredentialsAttachment.f81060d;
                if (str != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z2;
                    }
                    ajnx ajnx = (ajnx) da.f164949b;
                    str.getClass();
                    ajnx.f71033a |= 1;
                    ajnx.f71034b = str;
                }
                boolean z3 = wifiCredentialsAttachment.f81061e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ajnx ajnx2 = (ajnx) da.f164949b;
                ajnx2.f71033a |= 2;
                ajnx2.f71035c = z3;
                ahiq a3 = ahiq.m55840a(((ajnx) da.mo74062i()).mo73642k());
                ahiqArr3[i3] = a3;
                mo39382a(wifiCredentialsAttachment, a3.f67251a);
                i3++;
                z2 = false;
            }
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl4.mo68432a("akgy", "c", 2048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68409a("Created wifi payloads of length %d", size3);
            mo39417l(shareTarget).f71903j = ahiqArr3;
            if (mo39427q(shareTarget).length <= 0 && mo39425p(shareTarget).length <= 0 && mo39428r(shareTarget).length <= 0) {
                z = false;
            }
            if (z) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "w", 1988, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68424a("Created %s payloads for ShareTarget %s.", shareTarget.mo44499b(), shareTarget2);
            } else {
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl6.mo68432a("akgy", "w", 1991, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68420a("Failed to create any payloads for ShareTarget %s.", shareTarget2);
            }
            return z;
        } catch (IOException e) {
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl7.mo68437a(e);
            bnsl7.mo68432a("akgy", "w", 1995, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Failed to create file payloads for the given attachments. Disconnecting.");
            return false;
        }
    }

    /* renamed from: x */
    private final Intent m59569x(ShareTarget shareTarget) {
        String str;
        ajnx ajnx;
        aucb aucb;
        Uri uri;
        ShareTarget shareTarget2 = shareTarget;
        PackageManager packageManager = this.f71939f.getPackageManager();
        List b = shareTarget.mo44499b();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        String string = shareTarget2.f81032e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        if (string != null) {
            try {
                this.f71939f.getPackageManager().getPackageInfo(string, 0);
                intent.setPackage(string);
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgy", "x", 2778, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Required package is installed on receiver device.");
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "x", 2768, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Required package is missing on receiver device.");
                intent.setPackage("com.android.vending").setAction("android.intent.action.VIEW").setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s&launch=true", string)));
                return intent;
            }
        }
        if (b.size() > 1) {
            int[] iArr = {1, 2};
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                Attachment attachment = (Attachment) b.get(i);
                if (attachment.mo44385c()) {
                    FileAttachment fileAttachment = (FileAttachment) attachment;
                    int i2 = fileAttachment.f80882b;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            break;
                        } else if (i2 == iArr[i3]) {
                            arrayList.add(fileAttachment);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (arrayList.size() != b.size()) {
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                return intent;
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            return intent;
        }
        Attachment attachment2 = (Attachment) b.get(0);
        String str2 = null;
        if (attachment2.mo44386d()) {
            akgk akgk = (akgk) this.f71935b.get(attachment2);
            if (akgk != null) {
                str2 = akgk.f71878d;
            }
            if (TextUtils.isEmpty(str2)) {
                return intent;
            }
            int i4 = ((TextAttachment) shareTarget2.f81033f.get(0)).f81049b;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (str2.startsWith("https://") || str2.startsWith("http://")) {
                        str = str2;
                    } else {
                        String valueOf = String.valueOf(str2);
                        str = valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
                    }
                    intent.setAction("android.intent.action.VIEW").setData(Uri.parse(str));
                } else if (i4 == 2) {
                    Intent action = intent.setAction("android.intent.action.VIEW");
                    String valueOf2 = String.valueOf(Uri.encode(str2));
                    action.setData(Uri.parse(valueOf2.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf2)));
                } else if (i4 == 3) {
                    Intent action2 = intent.setAction("android.intent.action.DIAL");
                    String valueOf3 = String.valueOf(str2);
                    action2.setData(Uri.parse(valueOf3.length() == 0 ? new String("tel:") : "tel:".concat(valueOf3)));
                }
            } else if (bmxx.m108577a(string)) {
                intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f71939f.getPackageName()).putExtra("android.intent.extra.TEXT", str2).setType("text/plain");
            } else {
                intent.setAction("android.intent.action.VIEW").putExtra("android.intent.extra.TEXT", str2).setType("text/plain");
            }
            if (intent.resolveActivity(packageManager) == null) {
                intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f71939f.getPackageName()).setType("text/plain").putExtra("android.intent.extra.TEXT", str2);
                return intent;
            }
        } else if (attachment2.mo44385c()) {
            FileAttachment fileAttachment2 = (FileAttachment) attachment2;
            akgk akgk2 = (akgk) this.f71935b.get(fileAttachment2);
            if (akgk2 != null) {
                uri = akgk2.f71875a;
            } else {
                uri = null;
            }
            if (uri != null) {
                intent.addFlags(1);
                intent.setDataAndType(uri, fileAttachment2.f80886f);
                intent.setAction("android.intent.action.VIEW");
                List<ResolveInfo> queryIntentActivities = this.f71939f.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
                ArrayList arrayList2 = new ArrayList();
                bxwc bxwc = cfov.f185185a.mo6606a().mo82389m().f165797a;
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (!bxwc.contains(resolveInfo.activityInfo.packageName)) {
                        arrayList2.add(resolveInfo);
                    }
                }
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", "d", 2930, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("NearbySharingProvider removed blacklisted packages: %s", bxwc);
                if (arrayList2.isEmpty()) {
                    intent.setDataAndType(null, null);
                    intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                }
            } else {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68432a("akgy", "a", 2892, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to open file attachment with unknown destination.");
            }
        } else if (attachment2.mo44387e()) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) attachment2;
            String str3 = wifiCredentialsAttachment.f81057a;
            mo39376a(1, (int) C0126R.string.sharing_toast_wifi_connecting, str3);
            int i5 = wifiCredentialsAttachment.f81058b;
            akgk akgk3 = (akgk) this.f71935b.get(wifiCredentialsAttachment);
            if (akgk3 != null) {
                ajnx = akgk3.f71876b;
            } else {
                ajnx = null;
            }
            if (ajnx == null) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl5.mo68432a("akgy", "b", 2869, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
            } else {
                String str4 = ajnx.f71034b;
                boolean z = ajnx.f71035c;
                Context context = this.f71939f;
                if (i5 == 1) {
                    str2 = "Open";
                } else if (i5 == 2) {
                    str2 = "PSK";
                } else if (i5 == 3) {
                    str2 = "WEP";
                }
                if (str2 == null) {
                    aucb = aucu.m76777a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", str3)));
                } else {
                    asdn asdn = new asdn(context.getApplicationContext());
                    asde asde = new asde();
                    if (str4 != null) {
                        asde.f88733a.f108268c = str4;
                    }
                    ConnectToWifiNetworkRequest connectToWifiNetworkRequest = asde.f88733a;
                    connectToWifiNetworkRequest.f108266a = str3;
                    connectToWifiNetworkRequest.f108267b = str2;
                    connectToWifiNetworkRequest.f108269d = z;
                    sdo.m34959a(connectToWifiNetworkRequest);
                    aucb = asdn.mo24732b(new asdm(connectToWifiNetworkRequest));
                }
                aucb.mo50373a(new aken(this, str3));
                aucb.mo50372a(new akeo(this, str3));
            }
            intent.setAction("android.settings.WIFI_SETTINGS");
            return intent;
        } else {
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl6.mo68432a("akgy", "x", 2857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Failed to open attachment of unknown type");
        }
        return intent;
    }

    /* renamed from: y */
    private final byte[] m59570y(ShareTarget shareTarget) {
        akcj akcj = mo39417l(shareTarget).f71896b;
        if (akcj != null) {
            ajhh ajhh = akcj.f71590b;
            if ((ajhh.f70630a & 8) != 0) {
                bxtx bxtx = ajhh.f70634e;
                if (bxtx.mo73744a() == 6) {
                    return bxtx.mo73780k();
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    private final void m59571z(ShareTarget shareTarget) {
        this.f71935b.keySet().removeAll(shareTarget.mo44499b());
    }

    /* renamed from: e */
    public final int mo39404e(ShareTarget shareTarget) {
        ShareTarget shareTarget2 = shareTarget;
        this.f71938e.mo39358a();
        akdd i = mo39411i(shareTarget);
        if (i == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "e", 787, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Accept invoked for unknown share target");
            return 35511;
        }
        ajud k = mo39415k(shareTarget);
        if (k == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "e", 793, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Accept invoked for share target without TransferUpdateCallback");
            i.mo39253b();
            return 35511;
        }
        ajvg ajvg = this.f71948o;
        long j = this.f71954u;
        List b = shareTarget.mo44499b();
        bxvd d = ajvh.m59107d(18);
        bxvd da = bvfn.f155891d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfn bvfn = (bvfn) da.f164949b;
        bvfn.f155893a |= 1;
        bvfn.f155894b = j;
        bvfe a = ajvh.m59104a(b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfn bvfn2 = (bvfn) da.f164949b;
        a.getClass();
        bvfn2.f155895c = a;
        bvfn2.f155893a |= 2;
        bvfn bvfn3 = (bvfn) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfn3.getClass();
        bvgd.f155982s = bvfn3;
        bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
        i.mo39250a(new akfy(this, k, shareTarget2));
        akgf akgf = new akgf(this, shareTarget, k, i, shareTarget);
        List b2 = shareTarget.mo44499b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Attachment attachment = (Attachment) b2.get(i2);
            long b3 = mo39393b(attachment);
            if (b3 == -1) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68432a("akgy", "e", 857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to retrieve payload for: %s", attachment);
            } else {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "e", 860, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68415a("Started listening for progress on payload %d", b3);
                this.f71940g.mo39282a(b3, akgf);
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "e", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("Accepted ShareTarget %s's incoming files", shareTarget2);
            }
        }
        bxvd da2 = ajne.f70960c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ajne ajne = (ajne) da2.f164949b;
        ajne.f70963b = 1;
        ajne.f70962a |= 1;
        try {
            m59550a(i, (ajne) da2.mo74062i());
            this.f71955v = SystemClock.uptimeMillis();
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl6.mo68432a("akgy", "e", 880, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Successfully wrote the response frame");
            k.mo38711a(shareTarget2, m59566u(shareTarget));
            mo39395b(i);
            String j2 = mo39413j(shareTarget);
            if (j2 != null) {
                this.f71940g.mo39303f(j2);
                return 0;
            }
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl7.mo68432a("akgy", "e", 888, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68420a("Failed to initiate bandwidth upgrade. No endpointId found for ShareTarget %s", shareTarget2);
            return 35511;
        } catch (IOException e) {
            k.mo38711a(shareTarget2, new ajub(7).mo38916a());
            i.mo39253b();
            return 35510;
        }
    }

    /* renamed from: f */
    public final akgr mo39406f(ShareTarget shareTarget) {
        byte b;
        byte b2;
        boolean z;
        akcj akcj;
        akdd akdd;
        String str;
        ajnm ajnm;
        akgr akgr;
        ajnw ajnw;
        byte[] bArr;
        akgr akgr2;
        byte b3;
        int i;
        akgr akgr3;
        akgr akgr4;
        char c;
        akgr akgr5;
        byte[] bArr2;
        ShareTarget shareTarget2 = shareTarget;
        if (!shareTarget2.f81036i) {
            str = mo39418m(shareTarget);
            akdd = mo39422o(shareTarget);
            akcj = mo39417l(shareTarget).f71896b;
            z = false;
            b2 = 1;
            b = 2;
        } else {
            str = mo39413j(shareTarget);
            akdd = mo39411i(shareTarget);
            akcj = mo39410h(shareTarget).f71891b;
            z = this.f71943j != akcc.HIGH_POWER;
            b2 = 2;
            b = 1;
        }
        if (str == null || akdd == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "f", 1262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("No endpoint id or connection tied to %s.", shareTarget2);
            return akgr.FAIL;
        }
        byte[] d = this.f71940g.mo39300d(str);
        if (d == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "f", 1269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to read authenticationToken from connection: %s.", str);
            return akgr.FAIL;
        }
        byte[] a = this.f71946m.mo39199a(m59554a(b2, d));
        if (a == null) {
            ajnm = ajnm.f70986d;
        } else {
            if (akcj != null) {
                bArr2 = akid.m59792a(d, akcj.f71589a.f70660c.mo73780k(), 6);
            } else {
                bArr2 = akid.m59788a(6);
            }
            if (bArr2 == null) {
                bArr2 = akid.m59788a(6);
            }
            bxvd da = ajnm.f70986d.mo74144da();
            bxtx a2 = bxtx.m123261a(a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnm ajnm2 = (ajnm) da.f164949b;
            a2.getClass();
            ajnm2.f70988a |= 1;
            ajnm2.f70989b = a2;
            bxtx a3 = bxtx.m123261a(bArr2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnm ajnm3 = (ajnm) da.f164949b;
            a3.getClass();
            ajnm3.f70988a |= 2;
            ajnm3.f70990c = a3;
            ajnm = (ajnm) da.mo74062i();
        }
        try {
            bxvd da2 = ajnk.f70974d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajnk ajnk = (ajnk) da2.f164949b;
            ajnk.f70977b = 1;
            ajnk.f70976a |= 1;
            bxvd da3 = ajnw.f71022h.mo74144da();
            ajnv ajnv = ajnv.PAIRED_KEY_ENCRYPTION;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ajnw ajnw2 = (ajnw) da3.f164949b;
            ajnw2.f71025b = ajnv.f71021g;
            int i2 = ajnw2.f71024a | 1;
            ajnw2.f71024a = i2;
            ajnm.getClass();
            ajnw2.f71028e = ajnm;
            ajnw2.f71024a = i2 | 8;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajnk ajnk2 = (ajnk) da2.f164949b;
            ajnw ajnw3 = (ajnw) da3.mo74062i();
            ajnw3.getClass();
            ajnk2.f70978c = ajnw3;
            ajnk2.f70976a |= 2;
            akdd.mo39251a(((ajnk) da2.mo74062i()).mo73642k());
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "f", 1279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Wrote paired key encryption when connecting to %s.", shareTarget2);
            ajnw a4 = m59544a(akdd, ajnv.PAIRED_KEY_ENCRYPTION);
            if (a4 == null) {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "f", 1289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to read remote paired key encryption when connection to %s.", shareTarget2);
                return akgr.FAIL;
            }
            ajnm ajnm4 = a4.f71028e;
            if (ajnm4 == null) {
                ajnm4 = ajnm.f70986d;
            }
            ajhi d2 = this.f71946m.mo39207d();
            if (d2 == null) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "a", 4069, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Unable to verify remote certificate. Failed to load a valid local certificate.");
                akgr = akgr.UNABLE;
            } else if (Arrays.equals(ajnm4.f70990c.mo73780k(), akid.m59792a(d, d2.f70640d.mo73780k(), 6))) {
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl6.mo68432a("akgy", "a", 4080, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("Successfully verified remote certificate.");
                akgr = akgr.SUCCESS;
            } else {
                bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl7.mo68432a("akgy", "a", 4084, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Unable to verify remote certificate.");
                akgr = akgr.UNABLE;
            }
            if (akgr == akgr.SUCCESS) {
                List e = this.f71946m.mo39210e();
                if (e.isEmpty()) {
                    ajnw = a4;
                    akgr2 = akgr;
                    b3 = b;
                    bArr = d;
                    i = 4;
                } else if (this.f71930D.mo39173c() != null) {
                    bxvd da4 = ajnb.f70956b.mo74144da();
                    int size = e.size();
                    int i3 = 0;
                    while (i3 < size) {
                        List list = e;
                        ajhl ajhl = (ajhl) e.get(i3);
                        int i4 = size;
                        bxvd da5 = ajnq.f70996i.mo74144da();
                        akgr akgr6 = akgr;
                        bxtx bxtx = ajhl.f70659b;
                        byte b4 = b;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        ajnq ajnq = (ajnq) da5.f164949b;
                        bxtx.getClass();
                        int i5 = ajnq.f70998a | 1;
                        ajnq.f70998a = i5;
                        ajnq.f70999b = bxtx;
                        bxtx bxtx2 = ajhl.f70660c;
                        bxtx2.getClass();
                        int i6 = i5 | 2;
                        ajnq.f70998a = i6;
                        ajnq.f71000c = bxtx2;
                        bxtx bxtx3 = ajhl.f70661d;
                        bxtx3.getClass();
                        int i7 = i6 | 4;
                        ajnq.f70998a = i7;
                        ajnq.f71001d = bxtx3;
                        long j = ajhl.f70662e;
                        int i8 = i7 | 8;
                        ajnq.f70998a = i8;
                        ajnq.f71002e = j;
                        long j2 = ajhl.f70663f;
                        int i9 = i8 | 16;
                        ajnq.f70998a = i9;
                        ajnq.f71003f = j2;
                        bxtx bxtx4 = ajhl.f70664g;
                        bxtx4.getClass();
                        int i10 = i9 | 32;
                        ajnq.f70998a = i10;
                        ajnq.f71004g = bxtx4;
                        bxtx bxtx5 = ajhl.f70665h;
                        bxtx5.getClass();
                        ajnq.f70998a = i10 | 64;
                        ajnq.f71005h = bxtx5;
                        da4.mo73988a((ajnq) da5.mo74062i());
                        i3++;
                        b = b4;
                        e = list;
                        size = i4;
                        akgr = akgr6;
                        d = d;
                        a4 = a4;
                    }
                    ajnw = a4;
                    akgr2 = akgr;
                    b3 = b;
                    bArr = d;
                    i = 4;
                    try {
                        ajnb ajnb = (ajnb) da4.mo74062i();
                        bxvd da6 = ajnk.f70974d.mo74144da();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        ajnk ajnk3 = (ajnk) da6.f164949b;
                        ajnk3.f70977b = 1;
                        ajnk3.f70976a |= 1;
                        bxvd da7 = ajnw.f71022h.mo74144da();
                        ajnv ajnv2 = ajnv.CERTIFICATE_INFO;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        ajnw ajnw4 = (ajnw) da7.f164949b;
                        ajnw4.f71025b = ajnv2.f71021g;
                        int i11 = ajnw4.f71024a | 1;
                        ajnw4.f71024a = i11;
                        ajnb.getClass();
                        ajnw4.f71030g = ajnb;
                        ajnw4.f71024a = i11 | 32;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        ajnk ajnk4 = (ajnk) da6.f164949b;
                        ajnw ajnw5 = (ajnw) da7.mo74062i();
                        ajnw5.getClass();
                        ajnk4.f70978c = ajnw5;
                        ajnk4.f70976a |= 2;
                        akdd.mo39251a(((ajnk) da6.mo74062i()).mo73642k());
                    } catch (IOException e2) {
                        bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl8.mo68437a(e2);
                        bnsl8.mo68432a("akgy", "d", 3463, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl8.mo68405a("Failed to write CertificateInfoFrame.");
                    }
                } else {
                    ajnw = a4;
                    akgr2 = akgr;
                    b3 = b;
                    bArr = d;
                    i = 4;
                }
            } else {
                ajnw = a4;
                akgr2 = akgr;
                b3 = b;
                bArr = d;
                i = 4;
                if (z) {
                    bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl9.mo68432a("akgy", "f", 1302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl9.mo68420a("Rejecting connection from unknown ShareTarget %s because we're only allowing connections with contacts.", shareTarget2);
                    return akgr.FAIL;
                }
            }
            ajnm ajnm5 = ajnw.f71028e;
            if (ajnm5 == null) {
                ajnm5 = ajnm.f70986d;
            }
            if (akcj == null) {
                bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl10.mo68432a("akgy", "a", 4037, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl10.mo68405a("Unable to verify remote paired key encryption frame. Cannot locate remote certificate.");
                akgr3 = akgr.UNABLE;
            } else if (!this.f71946m.mo39197a(akcj.f71589a.f70661d.mo73780k(), m59554a(b3, bArr), ajnm5.f70989b.mo73780k())) {
                bnsl bnsl11 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl11.mo68432a("akgy", "a", 4047, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl11.mo68405a("Failed to verify remote paired key encryption frame.");
                akgr3 = akgr.FAIL;
            } else if (!shareTarget2.f81038k) {
                bnsl bnsl12 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl12.mo68432a("akgy", "a", 4052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl12.mo68405a("Unable to verify remote paired key encryption frame. Remote side is not a known share target.");
                akgr3 = akgr.UNABLE;
            } else {
                bnsl bnsl13 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl13.mo68432a("akgy", "a", 4058, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl13.mo68405a("Successfully verified remote paired key encryption frame.");
                akgr3 = akgr.SUCCESS;
            }
            try {
                bxvd da8 = ajnp.f70992c.mo74144da();
                ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
                int ordinal = akgr3.ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal == 1) {
                    i = 3;
                } else if (ordinal != 2) {
                    i = 1;
                }
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                ajnp ajnp = (ajnp) da8.f164949b;
                ajnp.f70995b = i - 1;
                ajnp.f70994a |= 1;
                ajnp ajnp2 = (ajnp) da8.mo74062i();
                bxvd da9 = ajnk.f70974d.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                ajnk ajnk5 = (ajnk) da9.f164949b;
                ajnk5.f70977b = 1;
                ajnk5.f70976a |= 1;
                bxvd da10 = ajnw.f71022h.mo74144da();
                ajnv ajnv3 = ajnv.PAIRED_KEY_RESULT;
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                ajnw ajnw6 = (ajnw) da10.f164949b;
                ajnw6.f71025b = ajnv3.f71021g;
                int i12 = ajnw6.f71024a | 1;
                ajnw6.f71024a = i12;
                ajnp2.getClass();
                ajnw6.f71029f = ajnp2;
                ajnw6.f71024a = i12 | 16;
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                ajnk ajnk6 = (ajnk) da9.f164949b;
                ajnw ajnw7 = (ajnw) da10.mo74062i();
                ajnw7.getClass();
                ajnk6.f70978c = ajnw7;
                ajnk6.f70976a |= 2;
                akdd.mo39251a(((ajnk) da9.mo74062i()).mo73642k());
                bnsl bnsl14 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl14.mo68432a("akgy", "f", 1322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl14.mo68424a("Wrote paired key verification result %s when connecting to %s.", akgr3, shareTarget2);
                ajnw a5 = m59544a(akdd, ajnv.PAIRED_KEY_RESULT);
                if (a5 == null) {
                    bnsl bnsl15 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl15.mo68432a("akgy", "f", 1333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl15.mo68420a("Failed to read paired key verification when connecting to %s.", shareTarget2);
                    return akgr.FAIL;
                }
                ajnp ajnp3 = a5.f71029f;
                if (ajnp3 == null) {
                    ajnp3 = ajnp.f70992c;
                }
                int a6 = ajno.m58889a(ajnp3.f70995b);
                if (a6 == 0) {
                    a6 = 1;
                }
                akgr[] akgrArr = new akgr[3];
                int i13 = 0;
                akgrArr[0] = akgr3;
                akgrArr[1] = akgr2;
                int i14 = a6 - 1;
                if (i14 != 1) {
                    c = 2;
                    akgr4 = i14 != 2 ? akgr.UNABLE : akgr.FAIL;
                } else {
                    c = 2;
                    akgr4 = akgr.SUCCESS;
                }
                akgrArr[c] = akgr4;
                int i15 = 0;
                while (true) {
                    if (i13 < 3) {
                        akgr akgr7 = akgrArr[i13];
                        if (akgr7 == akgr.FAIL) {
                            akgr5 = akgr.FAIL;
                            break;
                        }
                        if (akgr7 == akgr.SUCCESS) {
                            i15++;
                        }
                        i13++;
                    } else {
                        akgr5 = i15 == 3 ? akgr.SUCCESS : akgr.UNABLE;
                    }
                }
                bnsl bnsl16 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl16.mo68432a("akgy", "f", 1343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl16.mo68426a("Received local result %s, remote result %s, and remote certificate result %s. Combined, we settled on %s.", akgr3, a6 != 1 ? a6 != 2 ? a6 != 3 ? "UNABLE" : "FAIL" : "SUCCESS" : "UNKNOWN", akgr2, akgr5);
                return akgr5;
            } catch (IOException e3) {
                bnsl bnsl17 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl17.mo68437a(e3);
                bnsl17.mo68432a("akgy", "f", 1326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl17.mo68420a("Failed to read paired key verification result when connecting to %s.", shareTarget2);
                return akgr.FAIL;
            }
        } catch (IOException e4) {
            bnsl bnsl18 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl18.mo68437a(e4);
            bnsl18.mo68432a("akgy", "f", 1281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl18.mo68420a("Failed to write paired key encryption when connecting to %s.", shareTarget2);
            return akgr.FAIL;
        }
    }

    /* renamed from: g */
    public final int mo39408g(ShareTarget shareTarget) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "g", 1843, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Preparing to send payloads to %s", shareTarget);
        akdd o = mo39422o(shareTarget);
        if (o == null) {
            this.f71950q.mo39242a(shareTarget);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "g", 1850, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to send payload due to missing connection.");
            return 35511;
        }
        ajud n = mo39420n(shareTarget);
        if (n == null) {
            o.mo39253b();
            this.f71950q.mo39242a(shareTarget);
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "g", 1858, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to send payload due to missing TransferUpdateCallback. Disconnecting.");
            return 35511;
        }
        n.mo38711a(shareTarget, m59566u(shareTarget));
        String m = mo39418m(shareTarget);
        if (m == null) {
            n.mo38711a(shareTarget, new ajub(7).mo38916a());
            o.mo39253b();
            this.f71950q.mo39242a(shareTarget);
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68432a("akgy", "g", 1870, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Failed to send payload due to missing endpointId.");
            return 35511;
        }
        m59559b(new akeg(this, o, n, m, shareTarget));
        return 0;
    }

    /* renamed from: h */
    public final akgp mo39410h(ShareTarget shareTarget) {
        akgp akgp = (akgp) this.f71928B.get(shareTarget);
        if (akgp != null) {
            return akgp;
        }
        akgp akgp2 = new akgp();
        this.f71928B.put(shareTarget, akgp2);
        return akgp2;
    }

    /* renamed from: i */
    public final akdd mo39411i(ShareTarget shareTarget) {
        return mo39410h(shareTarget).f71892c;
    }

    /* renamed from: i */
    public final boolean mo39412i() {
        return this.f71941h != null;
    }

    /* renamed from: j */
    public final String mo39413j(ShareTarget shareTarget) {
        return mo39410h(shareTarget).f71890a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final ajud mo39415k(ShareTarget shareTarget) {
        return mo39410h(shareTarget).f71893d;
    }

    /* renamed from: m */
    public final String mo39418m(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71895a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final ajud mo39420n(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71898d;
    }

    /* renamed from: o */
    public final akdd mo39422o(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71897c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo39424p() {
        this.f71957x = 0;
        this.f71946m.mo39215h();
        this.f71947n.mo39218a();
        this.f71940g.mo39301e();
        this.f71950q.mo39247d();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "p", 1224, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("NearbySharingProvider has been reset");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo39426q() {
        mo39423o();
        this.f71940g.mo39297c();
        mo39419m();
        this.f71958y = mo39375a(new akfq(this), cfov.f185185a.mo6606a().mo82387k());
        this.f71941h = null;
        ajvg ajvg = this.f71948o;
        long j = this.f71951r;
        bxvd d = ajvh.m59107d(7);
        bxvd da = bvfr.f155906c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfr bvfr = (bvfr) da.f164949b;
        bvfr.f155908a |= 1;
        bvfr.f155909b = j;
        bvfr bvfr2 = (bvfr) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfr2.getClass();
        bvgd.f155971h = bvfr2;
        bvgd.f155964a |= 128;
        ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "q", 1200, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Stopped discovery");
    }

    /* renamed from: r */
    public final ahiq[] mo39428r(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71903j;
    }

    /* renamed from: s */
    public final void mo39429s(ShareTarget shareTarget) {
        if (shareTarget.f81036i) {
            this.f71928B.remove(shareTarget);
            this.f71940g.mo39299d();
        } else {
            String m = mo39418m(shareTarget);
            mo39414j();
            if (m != null) {
                mo39396b(shareTarget, m);
            }
        }
        this.f71938e.mo39358a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ Integer mo39430t(ShareTarget shareTarget) {
        akdd i = mo39411i(shareTarget);
        if (i == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "t", 2417, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Deny invoked for unknown share target");
            return 35511;
        }
        int i2 = 35510;
        if (cfov.f185185a.mo6606a().mo82305aN()) {
            srn srn = ajvp.f71371a;
            i.mo39250a(new akfc(this, ahfi.m55635b(new akfb(i), cfov.m142025A(), this.f71937d), shareTarget));
            bxvd da = ajne.f70960c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajne ajne = (ajne) da.f164949b;
            ajne.f70963b = 2;
            ajne.f70962a |= 1;
            try {
                m59550a(i, (ajne) da.mo74062i());
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "t", 2451, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("akgy", "t", 2453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to write the rejection response frame");
            }
        } else {
            i.mo39250a(new akfd(this, shareTarget));
            bxvd da2 = ajne.f70960c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajne ajne2 = (ajne) da2.f164949b;
            ajne2.f70963b = 2;
            ajne2.f70962a |= 1;
            try {
                m59550a(i, (ajne) da2.mo74062i());
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "t", 2470, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e2) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl5.mo68437a(e2);
                bnsl5.mo68432a("akgy", "t", 2472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to write the rejection response frame");
            }
            i.mo39250a(new akfg(this, ahfi.m55635b(new akff(i), cfov.m142025A(), this.f71937d), shareTarget));
        }
        ajud k = mo39415k(shareTarget);
        if (k != null) {
            k.mo38711a(shareTarget, new ajub(8).mo38916a());
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: j */
    public final void mo39414j() {
        int i;
        ArrayList arrayList = new ArrayList(this.f71936c.values());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ahiq[] ahiqArr = ((akgq) arrayList.get(i2)).f71902i;
            int length = ahiqArr.length;
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= length) {
                    break;
                }
                ahiqArr[i3].mo36539b();
                i3++;
            }
            i2 = i;
        }
        this.f71936c.clear();
    }

    /* renamed from: k */
    public final void mo39416k() {
        if (mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "k", 1206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring start background caching timeout because we're still scanning");
            return;
        }
        this.f71950q.mo39246c();
    }

    /* renamed from: m */
    public final void mo39419m() {
        ScheduledFuture scheduledFuture = this.f71933G;
        if (scheduledFuture != null) {
            this.f71933G = null;
            scheduledFuture.cancel(true);
        }
        akgo akgo = this.f71932F;
        if (akgo != null) {
            this.f71932F = null;
            akgo.run();
        }
    }

    /* renamed from: n */
    public final void mo39421n() {
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.STATE_CHANGED");
        intent.setPackage(this.f71939f.getPackageName());
        this.f71939f.sendBroadcast(intent);
        this.f71939f.startService(intent);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "n", 3594, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Broadcasting NearbySharing state change");
    }

    /* renamed from: o */
    public final void mo39423o() {
        ahhd.m55766a(this.f71939f, this.f71959z);
    }

    /* renamed from: a */
    private final int m59542a(String str, Callable callable) {
        bqgy c = bqgy.m112818c();
        mo39385a(new akew(c, callable));
        return ahhf.m55771a(str, c, cfov.m142058k());
    }

    /* renamed from: p */
    public final ahiq[] mo39425p(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71901h;
    }

    /* renamed from: h */
    public final void mo38797h() {
        mo39385a(new aket(this));
        ahhr.m55805a(this.f71929C, "NearbySharingProviderExecutor");
    }

    /* renamed from: a */
    public static ajnw m59543a(akdd akdd) {
        byte[] bArr;
        String str;
        try {
            synchronized (akdd.f71640b) {
                bArr = (byte[]) akdd.f71642d.poll();
                while (bArr == null) {
                    if (!akdd.f71643e) {
                        try {
                            akdd.f71640b.wait();
                            bArr = (byte[]) akdd.f71642d.poll();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while reading", e);
                        }
                    } else {
                        throw new IOException("Connection closed. Quit reading.");
                    }
                }
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akdd", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Read NearbyConnection message %s from %s", Arrays.toString(bArr), akdd.f71641c);
                if (Arrays.equals(akdd.f71639a, bArr)) {
                    throw new IOException("Connection closed. Quit reading.");
                }
            }
            ajnk ajnk = (ajnk) bxvk.m124014a(ajnk.f70974d, bArr);
            int a = ajnj.m58884a(ajnk.f70977b);
            if (a == 0) {
                a = 1;
            }
            if (a != 2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68432a("akgy", "a", 4210, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                int a2 = ajnj.m58884a(ajnk.f70977b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 != 1) {
                    str = "V1";
                } else {
                    str = "UNKNOWN_VERSION";
                }
                bnsl2.mo68420a("Failed to read V1 frame, but got %s", str);
                return null;
            }
            ajnw ajnw = ajnk.f70978c;
            if (ajnw == null) {
                ajnw = ajnw.f71022h;
            }
            ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
            ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            akgr akgr = akgr.SUCCESS;
            ajnv a3 = ajnv.m58896a(ajnw.f71025b);
            if (a3 == null) {
                a3 = ajnv.UNKNOWN_FRAME_TYPE;
            }
            int ordinal = a3.ordinal();
            if (ordinal == 1 ? (ajnw.f71024a & 2) == 0 : ordinal == 2 ? (ajnw.f71024a & 4) == 0 : ordinal == 3 ? (ajnw.f71024a & 8) == 0 : ordinal == 4 ? (ajnw.f71024a & 16) == 0 : ordinal != 5 || (ajnw.f71024a & 32) == 0) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68432a("akgy", "a", 4216, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                ajnw ajnw2 = ajnk.f70978c;
                if (ajnw2 == null) {
                    ajnw2 = ajnw.f71022h;
                }
                ajnv a4 = ajnv.m58896a(ajnw2.f71025b);
                if (a4 == null) {
                    a4 = ajnv.UNKNOWN_FRAME_TYPE;
                }
                bnsl3.mo68420a("Failed to read invalid %s frame", a4.name());
                return null;
            }
            ajnw ajnw3 = ajnk.f70978c;
            return ajnw3 == null ? ajnw.f71022h : ajnw3;
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: d */
    private final void m59564d(akdd akdd) {
        List e = this.f71946m.mo39210e();
        if (!e.isEmpty() && this.f71930D.mo39173c() != null) {
            bxvd da = ajnb.f70956b.mo74144da();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                ajhl ajhl = (ajhl) e.get(i);
                bxvd da2 = ajnq.f70996i.mo74144da();
                bxtx bxtx = ajhl.f70659b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ajnq ajnq = (ajnq) da2.f164949b;
                bxtx.getClass();
                int i2 = 1 | ajnq.f70998a;
                ajnq.f70998a = i2;
                ajnq.f70999b = bxtx;
                bxtx bxtx2 = ajhl.f70660c;
                bxtx2.getClass();
                int i3 = i2 | 2;
                ajnq.f70998a = i3;
                ajnq.f71000c = bxtx2;
                bxtx bxtx3 = ajhl.f70661d;
                bxtx3.getClass();
                int i4 = i3 | 4;
                ajnq.f70998a = i4;
                ajnq.f71001d = bxtx3;
                long j = ajhl.f70662e;
                int i5 = i4 | 8;
                ajnq.f70998a = i5;
                ajnq.f71002e = j;
                long j2 = ajhl.f70663f;
                int i6 = i5 | 16;
                ajnq.f70998a = i6;
                ajnq.f71003f = j2;
                bxtx bxtx4 = ajhl.f70664g;
                bxtx4.getClass();
                int i7 = i6 | 32;
                ajnq.f70998a = i7;
                ajnq.f71004g = bxtx4;
                bxtx bxtx5 = ajhl.f70665h;
                bxtx5.getClass();
                ajnq.f70998a = i7 | 64;
                ajnq.f71005h = bxtx5;
                da.mo73988a((ajnq) da2.mo74062i());
            }
            try {
                ajnb ajnb = (ajnb) da.mo74062i();
                bxvd da3 = ajnk.f70974d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ajnk ajnk = (ajnk) da3.f164949b;
                ajnk.f70977b = 1;
                ajnk.f70976a |= 1;
                bxvd da4 = ajnw.f71022h.mo74144da();
                ajnv ajnv = ajnv.CERTIFICATE_INFO;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ajnw ajnw = (ajnw) da4.f164949b;
                ajnw.f71025b = ajnv.f71021g;
                int i8 = ajnw.f71024a | 1;
                ajnw.f71024a = i8;
                ajnb.getClass();
                ajnw.f71030g = ajnb;
                ajnw.f71024a = i8 | 32;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ajnk ajnk2 = (ajnk) da3.f164949b;
                ajnw ajnw2 = (ajnw) da4.mo74062i();
                ajnw2.getClass();
                ajnk2.f70978c = ajnw2;
                ajnk2.f70976a |= 2;
                akdd.mo39251a(((ajnk) da3.mo74062i()).mo73642k());
            } catch (IOException e2) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("akgy", "d", 3463, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to write CertificateInfoFrame.");
            }
        }
    }

    /* renamed from: l */
    public final akgq mo39417l(ShareTarget shareTarget) {
        akgq akgq = (akgq) this.f71936c.get(shareTarget);
        if (akgq != null) {
            return akgq;
        }
        akgq akgq2 = new akgq();
        this.f71936c.put(shareTarget, akgq2);
        return akgq2;
    }

    /* renamed from: b */
    public static File m59557b(FileAttachment fileAttachment) {
        int i;
        String str = fileAttachment.f80881a;
        if (!cfov.f185185a.mo6606a().mo82304aM() || ((i = fileAttachment.f80882b) != 1 && i != 2)) {
            return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Nearby Sharing");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }
        return new File(file, str);
    }

    /* renamed from: g */
    public void mo38796g() {
        mo39385a(new akei(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo39409g(String str) {
        if (!mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "g", 1070, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring lost endpoint %s because we're no longer scanning", str);
            return;
        }
        ajsn ajsn = this.f71941h;
        this.f71934a.remove(str);
        ShareTarget d = mo39403d(str);
        if (d == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "g", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", str);
            return;
        }
        ajsn.mo38709b(d);
        this.f71950q.mo39242a(d);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akgy", "g", 1086, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Reported onShareTargetLost for %s", d);
    }

    /* renamed from: q */
    public final ahiq[] mo39427q(ShareTarget shareTarget) {
        return mo39417l(shareTarget).f71902i;
    }

    /* renamed from: b */
    private final void m59558b(WifiCredentialsAttachment wifiCredentialsAttachment) {
        ajnx ajnx;
        aucb aucb;
        String str = wifiCredentialsAttachment.f81057a;
        mo39376a(1, (int) C0126R.string.sharing_toast_wifi_connecting, str);
        int i = wifiCredentialsAttachment.f81058b;
        akgk akgk = (akgk) this.f71935b.get(wifiCredentialsAttachment);
        String str2 = null;
        if (akgk != null) {
            ajnx = akgk.f71876b;
        } else {
            ajnx = null;
        }
        if (ajnx == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "b", 2869, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
            return;
        }
        String str3 = ajnx.f71034b;
        boolean z = ajnx.f71035c;
        Context context = this.f71939f;
        if (i == 1) {
            str2 = "Open";
        } else if (i == 2) {
            str2 = "PSK";
        } else if (i == 3) {
            str2 = "WEP";
        }
        if (str2 == null) {
            aucb = aucu.m76777a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", str)));
        } else {
            asdn asdn = new asdn(context.getApplicationContext());
            asde asde = new asde();
            if (str3 != null) {
                asde.f88733a.f108268c = str3;
            }
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = asde.f88733a;
            connectToWifiNetworkRequest.f108266a = str;
            connectToWifiNetworkRequest.f108267b = str2;
            connectToWifiNetworkRequest.f108269d = z;
            sdo.m34959a(connectToWifiNetworkRequest);
            aucb = asdn.mo24732b(new asdm(connectToWifiNetworkRequest));
        }
        aucb.mo50373a(new aken(this, str));
        aucb.mo50372a(new akeo(this, str));
    }

    /* renamed from: a */
    private final ajnw m59544a(akdd akdd, ajnv ajnv) {
        return mo39369a(akdd, ajnv, cfov.f185185a.mo6606a().mo82300aI());
    }

    /* renamed from: a */
    private final akgr m59545a(ajnm ajnm, byte b, byte[] bArr, akcj akcj, ShareTarget shareTarget) {
        if (akcj == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 4037, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to verify remote paired key encryption frame. Cannot locate remote certificate.");
            return akgr.UNABLE;
        } else if (!this.f71946m.mo39197a(akcj.f71589a.f70661d.mo73780k(), m59554a(b, bArr), ajnm.f70989b.mo73780k())) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 4047, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to verify remote paired key encryption frame.");
            return akgr.FAIL;
        } else if (!shareTarget.f81038k) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "a", 4052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to verify remote paired key encryption frame. Remote side is not a known share target.");
            return akgr.UNABLE;
        } else {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl4.mo68432a("akgy", "a", 4058, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Successfully verified remote paired key encryption frame.");
            return akgr.SUCCESS;
        }
    }

    /* renamed from: b */
    static final void m59559b(Runnable runnable) {
        ahhr.m55806b().execute(runnable);
    }

    /* renamed from: b */
    private final ahiq[] m59560b(List list) {
        int size = list.size();
        ahiq[] ahiqArr = new ahiq[size];
        for (int i = 0; i < list.size(); i++) {
            TextAttachment textAttachment = (TextAttachment) list.get(i);
            ahiq a = ahiq.m55840a(textAttachment.f81048a.getBytes());
            ahiqArr[i] = a;
            mo39382a(textAttachment, a.f67251a);
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "b", 2025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Created text payloads of length %d", size);
        return ahiqArr;
    }

    /* renamed from: b */
    public final int mo38787b(Contact contact) {
        return m59542a("unmarkContactAsSelected", new akev(this, contact));
    }

    /* renamed from: b */
    public int mo38788b(ShareTarget shareTarget) {
        return m59542a("deny", new akek(this, shareTarget));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo39393b(Attachment attachment) {
        akgk akgk = (akgk) this.f71935b.get(attachment);
        if (akgk != null) {
            return akgk.f71877c;
        }
        return -1;
    }

    /* renamed from: a */
    private final akgr m59546a(ajnm ajnm, byte[] bArr) {
        ajhi d = this.f71946m.mo39207d();
        if (d == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 4069, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to verify remote certificate. Failed to load a valid local certificate.");
            return akgr.UNABLE;
        } else if (Arrays.equals(ajnm.f70990c.mo73780k(), akid.m59792a(bArr, d.f70640d.mo73780k(), 6))) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 4080, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Successfully verified remote certificate.");
            return akgr.SUCCESS;
        } else {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "a", 4084, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to verify remote certificate.");
            return akgr.UNABLE;
        }
    }

    /* renamed from: b */
    public void mo38789b() {
        mo39385a(new akfz(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(java.lang.String, byte[], boolean):void
     arg types: [java.lang.String, byte[], int]
     candidates:
      akgy.a(akdd, ajnv, long):ajnw
      akgy.a(java.io.File, java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(int, int, java.lang.String[]):void
      akgy.a(akbw, java.lang.String, ajud):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud, java.lang.String):void
      akgy.a(java.lang.String, ajud, akbw):void
      akgy.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akgy.a(java.lang.String, byte[], akdd):void
      akgy.a(byte[], akdd, java.lang.String):void
      akcd.a(java.lang.String, ajud, akbw):void
      akcd.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akds.a(java.lang.String, byte[], akdd):void
      akgy.a(java.lang.String, byte[], boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo39394b(ajsn ajsn, akbz akbz) {
        int i;
        mo38796g();
        this.f71950q.f71636b = new akfr(this);
        mo39414j();
        mo39419m();
        int a = this.f71940g.mo39277a(this);
        int i2 = 3;
        if (a != 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "b", 951, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to discover over Nearby Connections: %s", ahih.m55828a(a));
            i = 3;
        } else {
            this.f71934a.clear();
            NearbySharingProvider$4 nearbySharingProvider$4 = new NearbySharingProvider$4(this, "nearby");
            this.f71959z = nearbySharingProvider$4;
            ahhd.m55767a(this.f71939f, nearbySharingProvider$4, new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD"));
            this.f71941h = ajsn;
            this.f71944k = akbz.f71573a;
            ScheduledFuture scheduledFuture = this.f71958y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f71950q.mo39244b();
            List a2 = this.f71950q.mo39240a();
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                akcz akcz = (akcz) a2.get(i3);
                mo39387a(akcz.f71631a, akcz.f71632b, false);
                srn srn = ajvp.f71371a;
                String str = akcz.f71631a;
            }
            this.f71956w = SystemClock.uptimeMillis();
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "b", 948, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Successfully started discovery over Nearby Connections");
            i = 2;
        }
        this.f71948o.f71350a = ajvg.m59094a();
        long a3 = (long) ajvg.m59094a();
        this.f71951r = a3;
        ajvg ajvg = this.f71948o;
        int i4 = akbz.f71574b.f71348a;
        bxvd d = ajvh.m59107d(6);
        bxvd da = bvfs.f155910e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfs bvfs = (bvfs) da.f164949b;
        int i5 = bvfs.f155912a | 1;
        bvfs.f155912a = i5;
        bvfs.f155913b = a3;
        bvfs.f155914c = i - 1;
        bvfs.f155912a = i5 | 2;
        if (cfov.f185185a.mo6606a().mo82381e()) {
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 == 2) {
                i2 = 4;
            } else if (i4 != 3) {
                i2 = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvfs bvfs2 = (bvfs) da.f164949b;
            bvfs2.f155915d = i2 - 1;
            bvfs2.f155912a = 4 | bvfs2.f155912a;
        }
        bvfs bvfs3 = (bvfs) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfs3.getClass();
        bvgd.f155970g = bvfs3;
        bvgd.f155964a |= 64;
        ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
    }

    /* renamed from: d */
    public int mo38792d(ShareTarget shareTarget) {
        String str;
        ajud ajud;
        akdd akdd;
        if (!shareTarget.f81036i) {
            akdd = mo39422o(shareTarget);
            ajud = mo39420n(shareTarget);
            str = mo39418m(shareTarget);
            mo39419m();
        } else {
            akdd = mo39411i(shareTarget);
            ajud = mo39415k(shareTarget);
            str = mo39413j(shareTarget);
        }
        m59571z(shareTarget);
        if (ajud != null) {
            ajud.mo38711a(shareTarget, new ajub(9).mo38916a());
        }
        List b = shareTarget.mo44499b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            long b2 = mo39393b((Attachment) b.get(i));
            if (b2 != -1) {
                this.f71940g.mo39294b(b2);
            }
        }
        if (akdd != null) {
            akdd.mo39253b();
            return 0;
        } else if (str == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "d", 2672, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("No endpointId tied to %s. Failed to cancel payloads.", shareTarget);
            mo39429s(shareTarget);
            return 35511;
        } else {
            this.f71940g.mo39295b(str);
            mo39429s(shareTarget);
            return 0;
        }
    }

    /* renamed from: e */
    public final void mo38794e() {
        mo39385a(new aker(this));
    }

    /* renamed from: e */
    public final byte[] mo39405e(String str) {
        byte[] bArr;
        akck c = this.f71946m.mo39205c();
        if (str != null) {
            bArr = str.getBytes();
        } else {
            bArr = null;
        }
        byte[] a = akce.m59345a(akce.m59344a(c.f71592b, c.f71591a, bArr));
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "e", 3893, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Created endpointInfo: %s", akid.m59793b(a));
        return a;
    }

    /* renamed from: a */
    private final Intent m59547a(Intent intent, FileAttachment fileAttachment) {
        Uri uri;
        akgk akgk = (akgk) this.f71935b.get(fileAttachment);
        if (akgk != null) {
            uri = akgk.f71875a;
        } else {
            uri = null;
        }
        if (uri != null) {
            intent.addFlags(1);
            intent.setDataAndType(uri, fileAttachment.f80886f);
            intent.setAction("android.intent.action.VIEW");
            List<ResolveInfo> queryIntentActivities = this.f71939f.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = cfov.f185185a.mo6606a().mo82389m().f165797a;
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!bxwc.contains(resolveInfo.activityInfo.packageName)) {
                    arrayList.add(resolveInfo);
                }
            }
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "d", 2930, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("NearbySharingProvider removed blacklisted packages: %s", bxwc);
            if (arrayList.isEmpty()) {
                intent.setDataAndType(null, null);
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
            }
            return intent;
        }
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
        bnsl2.mo68432a("akgy", "a", 2892, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to open file attachment with unknown destination.");
        return intent;
    }

    /* renamed from: d */
    public final ShareTarget mo39403d(String str) {
        ArrayList arrayList = new ArrayList(this.f71936c.entrySet());
        int size = arrayList.size();
        ShareTarget shareTarget = null;
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            if (str.equals(((akgq) entry.getValue()).f71895a)) {
                this.f71936c.remove(entry.getKey());
                if (shareTarget == null || shareTarget.f81028a < ((ShareTarget) entry.getKey()).f81028a) {
                    shareTarget = (ShareTarget) entry.getKey();
                }
            }
        }
        return shareTarget;
    }

    /* renamed from: d */
    public final void mo38793d() {
        mo39385a(new akea(this));
    }

    /* renamed from: a */
    private final Uri m59548a(akcj akcj) {
        File file;
        if (akcj != null) {
            ajhh ajhh = akcj.f71590b;
            if ((ajhh.f70630a & 4) != 0) {
                Context context = this.f71939f;
                String str = ajhh.f70633d;
                if (TextUtils.isEmpty(str)) {
                    srn srn = ajvp.f71371a;
                    file = null;
                } else if (!akis.m59850a(str)) {
                    srn srn2 = ajvp.f71371a;
                    file = null;
                } else {
                    File a = akis.m59847a(context);
                    String a2 = akif.m59799a(akif.m59812c(context, Uri.parse(str)));
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(str.hashCode());
                    if (TextUtils.isEmpty(a2)) {
                        a2 = "jpg";
                    }
                    objArr[1] = a2;
                    file = new File(a, String.format("%s.%s", objArr));
                    if (!file.exists()) {
                        if (!akis.m59850a(str)) {
                            srn srn3 = ajvp.f71371a;
                        } else if (akif.m59813c(akif.m59812c(context, Uri.parse(str)))) {
                            int lastIndexOf = str.lastIndexOf(47);
                            if (lastIndexOf == -1) {
                                srn srn4 = ajvp.f71371a;
                            } else {
                                int a3 = akim.m59828a(context, 64);
                                int i = lastIndexOf + 1;
                                String substring = str.substring(0, i);
                                String format = String.format("s%s-c/", Integer.valueOf(a3));
                                String substring2 = str.substring(i);
                                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(format).length() + String.valueOf(substring2).length());
                                sb.append(substring);
                                sb.append(format);
                                sb.append(substring2);
                                str = sb.toString();
                                srn srn5 = ajvp.f71371a;
                            }
                        } else {
                            srn srn6 = ajvp.f71371a;
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        try {
                            new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str, new akir(file, countDownLatch), ahhr.m55807c()).build().start();
                            try {
                                countDownLatch.await(cfov.f185185a.mo6606a().mo82280P(), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                file = null;
                            }
                        } catch (IllegalStateException e2) {
                            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl.mo68437a(e2);
                            bnsl.mo68432a("akis", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("Failed to download Url %s. Cronet provider is unavailable on this device.", str);
                            file = null;
                        }
                    }
                }
                if (file == null) {
                    return null;
                }
                try {
                    return C1136kk.m17966a(this.f71939f, "com.google.android.gms.fileprovider", file);
                } catch (IllegalArgumentException e3) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68432a("akgy", "a", 2983, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Failed to get content Uri for %s", file);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo39395b(akdd akdd) {
        new soa(9, new akey(this, akdd)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39396b(ShareTarget shareTarget, String str) {
        mo39417l(shareTarget).f71895a = str;
    }

    /* renamed from: b */
    public final void mo39397b(String str) {
        if (!mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "b", 1038, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring expired endpoint %s because we're no longer scanning", str);
            return;
        }
        ajsn ajsn = this.f71941h;
        ArrayList arrayList = new ArrayList(this.f71936c.values());
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            akgq akgq = (akgq) arrayList.get(i);
            i++;
            if (str.equals(akgq.f71895a)) {
                if (akgq.f71900g) {
                    srn srn = ajvp.f71371a;
                    return;
                }
            }
        }
        ShareTarget d = mo39403d(str);
        if (d == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "b", 1055, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", str);
            return;
        }
        ajsn.mo38709b(d);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akgy", "b", 1061, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Reported expired ShareTarget %s", d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo39398b(String str, int i) {
        if (!mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "b", 1096, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring distance changed for endpoint %s because we're no longer scanning", str);
            return;
        }
        ShareTarget c = mo39400c(str);
        if (c != null) {
            this.f71941h.mo38708a(c, i);
        }
    }

    /* renamed from: b */
    public final void mo39399b(String str, ShareTarget shareTarget, ajud ajud) {
        akgo akgo = new akgo(new akec(this));
        if (this.f71940g.mo39277a(new akgh(this, shareTarget, ajud, akgo)) != 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "b", 1449, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to connect to outdated %s, because failed to start discovery.", shareTarget);
            ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
            return;
        }
        this.f71932F = akgo;
        this.f71933G = mo39375a(akgo, cfov.f185185a.mo6606a().mo82310aS());
        m59559b(new aked(this, akgo, str, shareTarget, ajud));
    }

    /* renamed from: a */
    static final /* synthetic */ void m59549a(long j, akdd akdd) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 4149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("Timing out reading from NearbyConnection after %d ms. Closing connection.", j);
        akdd.mo39253b();
    }

    /* renamed from: a */
    public static void m59550a(akdd akdd, ajne ajne) {
        bxvd da = ajnk.f70974d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ajnk ajnk = (ajnk) da.f164949b;
        ajnk.f70977b = 1;
        ajnk.f70976a |= 1;
        bxvd da2 = ajnw.f71022h.mo74144da();
        ajnv ajnv = ajnv.RESPONSE;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ajnw ajnw = (ajnw) da2.f164949b;
        ajnw.f71025b = ajnv.f71021g;
        int i = 1 | ajnw.f71024a;
        ajnw.f71024a = i;
        ajne.getClass();
        ajnw.f71027d = ajne;
        ajnw.f71024a = i | 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ajnk ajnk2 = (ajnk) da.f164949b;
        ajnw ajnw2 = (ajnw) da2.mo74062i();
        ajnw2.getClass();
        ajnk2.f70978c = ajnw2;
        ajnk2.f70976a |= 2;
        akdd.mo39251a(((ajnk) da.mo74062i()).mo73642k());
    }

    /* renamed from: c */
    private final ahiq[] m59562c(List list) {
        int size = list.size();
        ahiq[] ahiqArr = new ahiq[size];
        for (int i = 0; i < list.size(); i++) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list.get(i);
            bxvd da = ajnx.f71031d.mo74144da();
            String str = wifiCredentialsAttachment.f81060d;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ajnx ajnx = (ajnx) da.f164949b;
                str.getClass();
                ajnx.f71033a |= 1;
                ajnx.f71034b = str;
            }
            boolean z = wifiCredentialsAttachment.f81061e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajnx ajnx2 = (ajnx) da.f164949b;
            ajnx2.f71033a |= 2;
            ajnx2.f71035c = z;
            ahiq a = ahiq.m55840a(((ajnx) da.mo74062i()).mo73642k());
            ahiqArr[i] = a;
            mo39382a(wifiCredentialsAttachment, a.f67251a);
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "c", 2048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Created wifi payloads of length %d", size);
        return ahiqArr;
    }

    /* renamed from: a */
    private final void m59551a(ShareTarget shareTarget, int i) {
        int i2;
        akdd i3 = mo39411i(shareTarget);
        if (i3 == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "a", 2512, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Fail invoked for unknown share target");
            return;
        }
        srn srn = ajvp.f71371a;
        i3.mo39250a(new akem(this, ahfi.m55635b(new akel(i3), cfov.m142025A(), this.f71937d), shareTarget));
        if (i != 13) {
            i2 = i != 14 ? 1 : 5;
        } else {
            i2 = 4;
        }
        bxvd da = ajne.f70960c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ajne ajne = (ajne) da.f164949b;
        ajne.f70963b = i2 - 1;
        ajne.f70962a = 1 | ajne.f70962a;
        try {
            m59550a(i3, (ajne) da.mo74062i());
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 2553, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Successfully wrote a %s response frame", ajnd.m58877a(i2));
        } catch (IOException e) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("akgy", "a", 2555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to write the %s response frame", ajnd.m58877a(i2));
        }
        ajud k = mo39415k(shareTarget);
        if (k != null) {
            k.mo38711a(shareTarget, new ajub(i).mo38916a());
        }
    }

    /* renamed from: c */
    public int mo38790c(ShareTarget shareTarget) {
        String str;
        String stringExtra;
        String str2;
        ajnx ajnx;
        aucb aucb;
        Uri uri;
        String str3;
        int i;
        ShareTarget shareTarget2 = shareTarget;
        PackageManager packageManager = this.f71939f.getPackageManager();
        List b = shareTarget.mo44499b();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        String string = shareTarget2.f81032e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        String str4 = "android.intent.extra.TEXT";
        if (string != null) {
            try {
                this.f71939f.getPackageManager().getPackageInfo(string, 0);
                intent.setPackage(string);
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgy", "x", 2778, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Required package is installed on receiver device.");
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "x", 2768, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Required package is missing on receiver device.");
                intent.setPackage("com.android.vending").setAction("android.intent.action.VIEW").setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s&launch=true", string)));
                str = str4;
            }
        }
        if (b.size() > 1) {
            int[] iArr = {1, 2};
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            int i2 = 0;
            while (i2 < size) {
                Attachment attachment = (Attachment) b.get(i2);
                if (attachment.mo44385c()) {
                    FileAttachment fileAttachment = (FileAttachment) attachment;
                    int i3 = fileAttachment.f80882b;
                    i = size;
                    int i4 = 0;
                    while (true) {
                        str3 = str4;
                        if (i4 >= 2) {
                            break;
                        } else if (i3 == iArr[i4]) {
                            arrayList.add(fileAttachment);
                            break;
                        } else {
                            i4++;
                            str4 = str3;
                        }
                    }
                } else {
                    str3 = str4;
                    i = size;
                }
                i2++;
                size = i;
                str4 = str3;
            }
            String str5 = str4;
            if (arrayList.size() != b.size()) {
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                str = str5;
            } else {
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                str = str5;
            }
        } else {
            String str6 = str4;
            Attachment attachment2 = (Attachment) b.get(0);
            String str7 = null;
            if (attachment2.mo44386d()) {
                akgk akgk = (akgk) this.f71935b.get(attachment2);
                if (akgk != null) {
                    str7 = akgk.f71878d;
                }
                if (!TextUtils.isEmpty(str7)) {
                    int i5 = ((TextAttachment) shareTarget2.f81033f.get(0)).f81049b;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            if (str7.startsWith("https://") || str7.startsWith("http://")) {
                                str2 = str7;
                            } else {
                                String valueOf = String.valueOf(str7);
                                str2 = valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
                            }
                            intent.setAction("android.intent.action.VIEW").setData(Uri.parse(str2));
                            str = str6;
                        } else if (i5 == 2) {
                            Intent action = intent.setAction("android.intent.action.VIEW");
                            String valueOf2 = String.valueOf(Uri.encode(str7));
                            action.setData(Uri.parse(valueOf2.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf2)));
                            str = str6;
                        } else if (i5 != 3) {
                            str = str6;
                        } else {
                            Intent action2 = intent.setAction("android.intent.action.DIAL");
                            String valueOf3 = String.valueOf(str7);
                            action2.setData(Uri.parse(valueOf3.length() == 0 ? new String("tel:") : "tel:".concat(valueOf3)));
                            str = str6;
                        }
                    } else if (bmxx.m108577a(string)) {
                        str = str6;
                        intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f71939f.getPackageName()).putExtra(str, str7).setType("text/plain");
                    } else {
                        str = str6;
                        intent.setAction("android.intent.action.VIEW").putExtra(str, str7).setType("text/plain");
                    }
                    if (intent.resolveActivity(packageManager) == null) {
                        intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f71939f.getPackageName()).setType("text/plain").putExtra(str, str7);
                    }
                } else {
                    str = str6;
                }
            } else if (attachment2.mo44385c()) {
                FileAttachment fileAttachment2 = (FileAttachment) attachment2;
                akgk akgk2 = (akgk) this.f71935b.get(fileAttachment2);
                if (akgk2 != null) {
                    uri = akgk2.f71875a;
                } else {
                    uri = null;
                }
                if (uri != null) {
                    intent.addFlags(1);
                    intent.setDataAndType(uri, fileAttachment2.f80886f);
                    intent.setAction("android.intent.action.VIEW");
                    List<ResolveInfo> queryIntentActivities = this.f71939f.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
                    ArrayList arrayList2 = new ArrayList();
                    bxwc bxwc = cfov.f185185a.mo6606a().mo82389m().f165797a;
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        if (!bxwc.contains(resolveInfo.activityInfo.packageName)) {
                            arrayList2.add(resolveInfo);
                        }
                    }
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl3.mo68432a("akgy", "d", 2930, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("NearbySharingProvider removed blacklisted packages: %s", bxwc);
                    if (arrayList2.isEmpty()) {
                        intent.setDataAndType(null, null);
                        intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                        str = str6;
                    } else {
                        str = str6;
                    }
                } else {
                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl4.mo68432a("akgy", "a", 2892, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to open file attachment with unknown destination.");
                    str = str6;
                }
            } else if (attachment2.mo44387e()) {
                WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) attachment2;
                String str8 = wifiCredentialsAttachment.f81057a;
                mo39376a(1, (int) C0126R.string.sharing_toast_wifi_connecting, str8);
                int i6 = wifiCredentialsAttachment.f81058b;
                akgk akgk3 = (akgk) this.f71935b.get(wifiCredentialsAttachment);
                if (akgk3 != null) {
                    ajnx = akgk3.f71876b;
                } else {
                    ajnx = null;
                }
                if (ajnx == null) {
                    bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl5.mo68432a("akgy", "b", 2869, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
                } else {
                    String str9 = ajnx.f71034b;
                    boolean z = ajnx.f71035c;
                    Context context = this.f71939f;
                    if (i6 == 1) {
                        str7 = "Open";
                    } else if (i6 == 2) {
                        str7 = "PSK";
                    } else if (i6 == 3) {
                        str7 = "WEP";
                    }
                    if (str7 == null) {
                        aucb = aucu.m76777a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", str8)));
                    } else {
                        asdn asdn = new asdn(context.getApplicationContext());
                        asde asde = new asde();
                        if (str9 != null) {
                            asde.f88733a.f108268c = str9;
                        }
                        ConnectToWifiNetworkRequest connectToWifiNetworkRequest = asde.f88733a;
                        connectToWifiNetworkRequest.f108266a = str8;
                        connectToWifiNetworkRequest.f108267b = str7;
                        connectToWifiNetworkRequest.f108269d = z;
                        sdo.m34959a(connectToWifiNetworkRequest);
                        aucb = asdn.mo24732b(new asdm(connectToWifiNetworkRequest));
                    }
                    aucb.mo50373a(new aken(this, str8));
                    aucb.mo50372a(new akeo(this, str8));
                }
                intent.setAction("android.settings.WIFI_SETTINGS");
                str = str6;
            } else {
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl6.mo68432a("akgy", "x", 2857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("Failed to open attachment of unknown type");
                str = str6;
            }
        }
        if (!"com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(str)) == null) {
            int a = m59541a(intent);
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a("akgy", "c", 2696, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68424a("Launched an Activity for intent %s to open ShareTarget %s's attachment(s)", intent, shareTarget2);
            this.f71939f.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            m59571z(shareTarget);
            return a;
        }
        new adzt(Looper.getMainLooper()).post(new akep(this, stringExtra));
        this.f71939f.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        return 0;
    }

    /* renamed from: a */
    public static void m59552a(Map map) {
        bnre i = bngx.m109368a((Collection) map.keySet()).listIterator();
        while (i.hasNext()) {
            Object next = i.next();
            akgl akgl = (akgl) map.get(next);
            if (akgl != null && TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - akgl.f71879e) > cfov.f185185a.mo6606a().mo82392p()) {
                map.remove(next);
            }
        }
    }

    /* renamed from: f */
    public List mo38795f() {
        bqgy c = bqgy.m112818c();
        mo39385a(new akej(this, c));
        List list = (List) ahhf.m55778c("getDiscoveredShareTargets", c, cfov.m142058k());
        return list == null ? bngx.m109376e() : list;
    }

    /* renamed from: a */
    private static boolean m59553a(List list, long j) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bigDecimal = bigDecimal.add(new BigDecimal(((Attachment) list.get(i)).mo44383a()));
        }
        if (bigDecimal.compareTo(new BigDecimal(j)) >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo39407f(String str) {
        ((ClipboardManager) this.f71939f.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.f71939f.getString(C0126R.string.sharing_product_name), str));
        if (cfov.m142048X()) {
            mo39376a(0, (int) C0126R.string.sharing_toast_copied_to_clipboard, str);
        } else {
            Context context = this.f71939f;
            Toast.makeText(context, context.getString(C0126R.string.sharing_toast_copied_to_clipboard, str), 0).show();
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "f", 2954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Copied %s to clipboard", str);
    }

    /* renamed from: a */
    private static byte[] m59554a(byte b, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        bArr2[0] = b;
        System.arraycopy(bArr, 0, bArr2, 1, length);
        return bArr2;
    }

    /* renamed from: a */
    private final ahiq[] m59555a(List list) {
        int size = list.size();
        ahiq[] ahiqArr = new ahiq[size];
        for (int i = 0; i < list.size(); i++) {
            FileAttachment fileAttachment = (FileAttachment) list.get(i);
            Uri uri = fileAttachment.f80884d;
            if (uri != null) {
                ahiq a = ahiq.m55839a(akif.m59796a(this.f71939f, uri));
                ahiqArr[i] = a;
                mo39382a(fileAttachment, a.f67251a);
            }
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 2013, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Created file payloads of length %d", size);
        return ahiqArr;
    }

    /* renamed from: a */
    public final int mo38779a(Contact contact) {
        return m59542a("markContactAsSelected", new akeu(this, contact));
    }

    /* renamed from: a */
    public int mo38780a(ShareTarget shareTarget) {
        return m59542a("accept", new akeh(this, shareTarget));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ajnw mo39369a(akdd akdd, ajnv ajnv, long j) {
        ajnw ajnw;
        if (this.f71945l.containsKey(ajnv)) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 4139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Successfully read cached %s frame", ajnv);
            return (ajnw) this.f71945l.remove(ajnv);
        }
        srn srn = ajvp.f71371a;
        ahfi b = ahfi.m55635b(new akex(j, akdd), j, this.f71937d);
        do {
            ajnw = null;
            if (!akdd.mo39255c()) {
                ajnw a = m59543a(akdd);
                if (a != null) {
                    ajnv a2 = ajnv.m58896a(a.f71025b);
                    if (a2 == null) {
                        a2 = ajnv.UNKNOWN_FRAME_TYPE;
                    }
                    if (!ajnv.equals(a2)) {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl2.mo68432a("akgy", "b", 4187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        String name = ajnv.name();
                        ajnv a3 = ajnv.m58896a(a.f71025b);
                        if (a3 == null) {
                            a3 = ajnv.UNKNOWN_FRAME_TYPE;
                        }
                        bnsl2.mo68424a("Failed to read %s frame, but got %s. Cached for later.", name, a3.name());
                        ConcurrentMap concurrentMap = this.f71945l;
                        ajnv a4 = ajnv.m58896a(a.f71025b);
                        if (a4 == null) {
                            a4 = ajnv.UNKNOWN_FRAME_TYPE;
                        }
                        concurrentMap.put(a4, a);
                        continue;
                    } else {
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl3.mo68432a("akgy", "b", 4194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Successfully read %s frame", ajnv.name());
                        ajnw = a;
                        continue;
                    }
                }
            } else {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68432a("akgy", "a", 4167, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to read %s frame", ajnv.name());
                return null;
            }
        } while (ajnw == null);
        b.mo36396b();
        return ajnw;
    }

    /* renamed from: a */
    public final ajud mo39370a(ajud ajud) {
        this.f71957x = 0;
        return new akgi(this, ajud);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ajud mo39371a(ShareTarget shareTarget, ajud ajud) {
        ajud a = mo39370a(ajud);
        mo39417l(shareTarget).f71898d = a;
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final Uri mo39372a(File file, FileAttachment fileAttachment) {
        Uri uri;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", fileAttachment.f80881a);
        contentValues.put("mime_type", fileAttachment.f80886f);
        if (cfov.m142029E()) {
            Long valueOf = Long.valueOf(currentTimeMillis);
            contentValues.put("date_added", valueOf);
            contentValues.put("date_modified", valueOf);
        }
        contentValues.put("is_pending", (Integer) 1);
        if (cfov.m142029E()) {
            contentValues.put("date_expires", Long.valueOf((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1)) / 1000));
        }
        Context context = this.f71939f;
        int i = fileAttachment.f80882b;
        if (i == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i == 2) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (i != 4) {
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uri2 = (Uri) ahgk.m55689a("insert", new ahgc(context, uri, contentValues));
        if (uri2 != null) {
            OutputStream outputStream = (OutputStream) ahgk.m55689a("openOutputStream", new ahgg(this.f71939f, uri2));
            if (outputStream == null) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68432a("akgy", "a", 2299, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to open output stream for uri: %s", uri2);
                if (cfov.m142029E()) {
                    ahgk.m55694b(this.f71939f, uri2);
                }
                return null;
            }
            try {
                akif.m59802a(new FileInputStream(file), outputStream);
                if (!file.delete()) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl2.mo68432a("akgy", "a", 2309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Failed to delete file: %s", file.getAbsolutePath());
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", (Integer) 0);
                if (cfov.m142029E()) {
                    contentValues2.putNull("date_expires");
                }
                Integer num = (Integer) ahgk.m55689a("update", new ahgd(this.f71939f, uri2, contentValues2));
                if (num == null || num.intValue() != 1) {
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl3.mo68432a("akgy", "a", 2327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to update uri %s in media store.", uri2);
                    if (cfov.m142029E()) {
                        ahgk.m55694b(this.f71939f, uri2);
                    }
                    return null;
                }
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "a", 2334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Successfully created media store uri %s with access to the file.", uri2);
                return uri2;
            } catch (IOException e) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "a", 2312, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("Failed to write to uri in media store for file: %s.", fileAttachment.f80881a);
                if (cfov.m142029E()) {
                    ahgk.m55694b(this.f71939f, uri2);
                }
                return null;
            }
        } else {
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl6.mo68432a("akgy", "a", 2292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Failed to create uri in media store for file: %s.", fileAttachment.f80881a);
            return null;
        }
    }

    /* renamed from: a */
    public final Uri mo39373a(File file, File file2, FileAttachment fileAttachment) {
        try {
            akif.m59801a(file, file2);
            Uri a = C1136kk.m17966a(this.f71939f, "com.google.android.gms.fileprovider", file2);
            int i = fileAttachment.f80882b;
            if (i != 1) {
                if (i != 2) {
                    ((DownloadManager) this.f71939f.getSystemService("download")).addCompletedDownload(fileAttachment.f80881a, this.f71939f.getString(C0126R.string.sharing_download_description), true, akif.m59814d(this.f71939f, a), file2.getPath(), fileAttachment.f80883c, false);
                    return a;
                }
            }
            this.f71939f.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
            return a;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akgy", "a", 2242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to update the location of %s", fileAttachment);
            return null;
        }
    }

    /* renamed from: c */
    public final ShareTarget mo39400c(String str) {
        ShareTarget shareTarget = null;
        for (Map.Entry entry : this.f71936c.entrySet()) {
            if (str.equals(((akgq) entry.getValue()).f71895a) && (shareTarget == null || shareTarget.f81028a < ((ShareTarget) entry.getKey()).f81028a)) {
                shareTarget = (ShareTarget) entry.getKey();
            }
        }
        return shareTarget;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d5  */
    /* renamed from: a */
    public final ShareTarget mo39374a(akce akce, boolean z) {
        Uri uri;
        String str;
        String str2;
        File file;
        String str3;
        CountDownLatch countDownLatch;
        akce akce2 = akce;
        boolean z2 = z;
        akcj a = this.f71946m.mo39188a(akce2.f71581c, akce2.f71580b);
        if (!akce.mo39182a() && a == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 3914, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to retrieve public certificate %s for a contacts only advertisement.", Arrays.toString(akce2.f71581c));
            return null;
        }
        if (a != null) {
            ajhh ajhh = a.f71590b;
            if ((ajhh.f70630a & 4) != 0) {
                Context context = this.f71939f;
                String str4 = ajhh.f70633d;
                if (TextUtils.isEmpty(str4)) {
                    srn srn = ajvp.f71371a;
                    file = null;
                } else if (!akis.m59850a(str4)) {
                    srn srn2 = ajvp.f71371a;
                    file = null;
                } else {
                    File a2 = akis.m59847a(context);
                    String a3 = akif.m59799a(akif.m59812c(context, Uri.parse(str4)));
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(str4.hashCode());
                    if (TextUtils.isEmpty(a3)) {
                        a3 = "jpg";
                    }
                    objArr[1] = a3;
                    file = new File(a2, String.format("%s.%s", objArr));
                    if (!file.exists()) {
                        if (!akis.m59850a(str4)) {
                            srn srn3 = ajvp.f71371a;
                        } else if (akif.m59813c(akif.m59812c(context, Uri.parse(str4)))) {
                            int lastIndexOf = str4.lastIndexOf(47);
                            if (lastIndexOf == -1) {
                                srn srn4 = ajvp.f71371a;
                            } else {
                                int a4 = akim.m59828a(context, 64);
                                int i = lastIndexOf + 1;
                                String substring = str4.substring(0, i);
                                String format = String.format("s%s-c/", Integer.valueOf(a4));
                                String substring2 = str4.substring(i);
                                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(format).length() + String.valueOf(substring2).length());
                                sb.append(substring);
                                sb.append(format);
                                sb.append(substring2);
                                String sb2 = sb.toString();
                                srn srn5 = ajvp.f71371a;
                                str3 = sb2;
                                countDownLatch = new CountDownLatch(1);
                                new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str3, new akir(file, countDownLatch), ahhr.m55807c()).build().start();
                                try {
                                    countDownLatch.await(cfov.f185185a.mo6606a().mo82280P(), TimeUnit.MILLISECONDS);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    file = null;
                                }
                            }
                        } else {
                            srn srn6 = ajvp.f71371a;
                        }
                        str3 = str4;
                        countDownLatch = new CountDownLatch(1);
                        try {
                            new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str3, new akir(file, countDownLatch), ahhr.m55807c()).build().start();
                            countDownLatch.await(cfov.f185185a.mo6606a().mo82280P(), TimeUnit.MILLISECONDS);
                        } catch (IllegalStateException e2) {
                            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl2.mo68437a(e2);
                            bnsl2.mo68432a("akis", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("Failed to download Url %s. Cronet provider is unavailable on this device.", str3);
                            file = null;
                        }
                    }
                }
                if (file != null) {
                    try {
                        uri = C1136kk.m17966a(this.f71939f, "com.google.android.gms.fileprovider", file);
                    } catch (IllegalArgumentException e3) {
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl3.mo68437a(e3);
                        bnsl3.mo68432a("akgy", "a", 2983, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to get content Uri for %s", file);
                        uri = null;
                    }
                } else {
                    uri = null;
                }
                if (a != null) {
                    ajhh ajhh2 = a.f71590b;
                    if ((ajhh2.f70630a & 2) != 0) {
                        str = ajhh2.f70632c;
                        byte[] bArr = akce2.f71579a;
                        if (akce.mo39182a()) {
                            if (!akid.m59787a(bArr)) {
                                str2 = new String(bArr);
                                if (str2 == null) {
                                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                                    bnsl4.mo68432a("akgy", "a", 3924, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl4.mo68420a("Failed to retrieve device name for advertisement %s.", akce.m59345a(akce));
                                    return null;
                                }
                                ajsl ajsl = new ajsl();
                                ajsl.f71230b = str2;
                                ajsl.f71238j = str;
                                ajsl.f71237i = z2;
                                ajsl.f71231c = uri;
                                if (a != null) {
                                    ajsl.mo38888b();
                                }
                                ShareTarget a5 = ajsl.mo38887a();
                                if (!z2) {
                                    mo39417l(a5).f71896b = a;
                                } else {
                                    mo39410h(a5).f71891b = a;
                                }
                                return a5;
                            }
                        } else if (a != null) {
                            ajhh ajhh3 = a.f71590b;
                            if ((ajhh3.f70630a & 1) != 0) {
                                str2 = ajhh3.f70631b;
                                if (str2 == null) {
                                }
                            }
                        }
                        str2 = null;
                        if (str2 == null) {
                        }
                    }
                }
                str = null;
                byte[] bArr2 = akce2.f71579a;
                if (akce.mo39182a()) {
                }
                str2 = null;
                if (str2 == null) {
                }
            }
        }
        uri = null;
        if (a != null) {
        }
        str = null;
        byte[] bArr22 = akce2.f71579a;
        if (akce.mo39182a()) {
        }
        str2 = null;
        if (str2 == null) {
        }
    }

    /* renamed from: c */
    public final List mo38791c() {
        List list = (List) ahhf.m55773a("getContacts", aucu.m76780a(this.f71929C, new akes(this)), cfov.m142058k());
        return list == null ? bngx.m109376e() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo39401c(akdd akdd) {
        ajnw ajnw;
        while (!akdd.mo39255c()) {
            Iterator it = this.f71945l.keySet().iterator();
            if (it.hasNext()) {
                ajnw = (ajnw) this.f71945l.remove(it.next());
            } else {
                ajnw = null;
            }
            if (ajnw == null) {
                ajnw = m59543a(akdd);
            }
            if (ajnw != null) {
                ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
                ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
                akgr akgr = akgr.SUCCESS;
                ajnv a = ajnv.m58896a(ajnw.f71025b);
                if (a == null) {
                    a = ajnv.UNKNOWN_FRAME_TYPE;
                }
                if (a.ordinal() != 5) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a("akgy", "c", 4266, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    ajnv a2 = ajnv.m58896a(ajnw.f71025b);
                    if (a2 == null) {
                        a2 = ajnv.UNKNOWN_FRAME_TYPE;
                    }
                    bnsl.mo68420a("Discarding unknown frame of type %s", a2);
                } else {
                    mo39385a(new akez(this, ajnw));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo39402c(String str, ShareTarget shareTarget, ajud ajud) {
        int i;
        ShareTarget shareTarget2 = shareTarget;
        ajud ajud2 = ajud;
        akgq l = mo39417l(shareTarget2);
        String str2 = l.f71895a;
        if (str2 == null) {
            ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
            this.f71950q.mo39242a(shareTarget2);
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "c", 1547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to retrieve endpoint id for %s.", shareTarget2);
            return;
        }
        byte[] e = mo39405e(str);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f71944k == 1 || m59553a(shareTarget.mo44499b(), Long.parseLong(cfov.f185185a.mo6606a().mo82296aE()))) {
            i = 1;
        } else {
            i = 2;
        }
        ajvg ajvg = this.f71948o;
        long j = this.f71953t;
        bxvd d = ajvh.m59107d(27);
        bxvd da = bvfx.f155934c.mo74144da();
        String str3 = "akgy";
        String str4 = "c";
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfx bvfx = (bvfx) da.f164949b;
        bvfx.f155936a |= 1;
        bvfx.f155937b = j;
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvfx bvfx2 = (bvfx) da.mo74062i();
        bvgd bvgd2 = bvgd.f155960B;
        bvfx2.getClass();
        bvgd.f155987x = bvfx2;
        bvgd.f155964a |= 268435456;
        ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
        if (cfov.f185185a.mo6606a().mo82391o()) {
            m59559b(new akee(this, e, str2, m59570y(shareTarget2), i, m59567v(shareTarget2), ajud, shareTarget, l, uptimeMillis));
            return;
        }
        akdd a = this.f71940g.mo39280a(e, str2, m59570y(shareTarget2), i, m59567v(shareTarget2));
        if (a == null) {
            ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
            this.f71950q.mo39242a(shareTarget2);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a(str3, str4, 1607, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to connect to %s.", shareTarget2);
            return;
        }
        mo39379a(a, ajud, shareTarget, l, uptimeMillis, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ScheduledFuture mo39375a(Runnable runnable, long j) {
        return this.f71929C.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo38781a() {
        mo39385a(new akdz(this));
    }

    /* renamed from: a */
    public void mo38782a(int i) {
        this.f71927A = i;
        this.f71946m.mo39202b(i);
    }

    /* renamed from: a */
    public final void mo39376a(int i, int i2, String... strArr) {
        new adzt(Looper.getMainLooper()).post(new akeq(this, i2, strArr, i));
    }

    /* renamed from: a */
    public void mo38783a(ajsn ajsn, akbz akbz) {
        mo39385a(new akga(this, ajsn, akbz));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39377a(ajud ajud, ShareTarget shareTarget) {
        ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
        this.f71950q.mo39242a(shareTarget);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 1579, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to connect to %s", shareTarget);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39378a(akbw akbw, String str, ajud ajud) {
        int i;
        String str2;
        akcc akcc = akbw.f71567a;
        int i2 = akbw.f71568b;
        this.f71952s = (long) ajvg.m59094a();
        this.f71940g.mo39299d();
        int a = this.f71940g.mo39278a(mo39405e(str), this, akbw);
        int i3 = 3;
        if (a == 0) {
            this.f71942i = ajud;
            this.f71943j = akcc;
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 473, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i4 = this.f71927A;
            String str3 = "UNKNOWN";
            if (i4 != 0) {
                str2 = i4 != 1 ? i4 != 2 ? str3 : "SELECTED_CONTACTS" : "ALL_CONTACTS";
            } else {
                str2 = "NO_ONE";
            }
            if (i2 == 1) {
                str3 = "OFFLINE";
            } else if (i2 == 2) {
                str3 = "ONLINE";
            } else if (i2 == 3) {
                str3 = "WIFI_ONLY";
            }
            bnsl.mo68425a("Successfully started advertising over Nearby Connections: %s, %s, %s", akcc, str2, str3);
            i = 2;
        } else {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to advertise over Nearby Connections: %s", ahih.m55828a(a));
            i = 3;
        }
        if (akcc.HIGH_POWER.equals(akcc) || akcc.MEDIUM_POWER.equals(akcc)) {
            mo38796g();
        }
        if (str == null) {
            int i5 = this.f71927A;
            i3 = i5 != 1 ? i5 != 2 ? 1 : 4 : 2;
        }
        this.f71948o.f71351b = ajvg.m59094a();
        ajvg ajvg = this.f71948o;
        long j = this.f71952s;
        bxvd d = ajvh.m59107d(8);
        bxvd da = bvfd.f155845e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfd bvfd = (bvfd) da.f164949b;
        int i6 = 1 | bvfd.f155847a;
        bvfd.f155847a = i6;
        bvfd.f155848b = j;
        bvfd.f155849c = i3 - 1;
        int i7 = i6 | 2;
        bvfd.f155847a = i7;
        bvfd.f155850d = i - 1;
        bvfd.f155847a = i7 | 4;
        bvfd bvfd2 = (bvfd) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfd2.getClass();
        bvgd.f155972i = bvfd2;
        bvgd.f155964a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
    }

    /* renamed from: a */
    public final void mo39379a(akdd akdd, ajud ajud, ShareTarget shareTarget, akgq akgq, long j, String str) {
        String str2;
        akgq.f71900g = true;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 1631, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68423a("Connected to %s in %d millis.", shareTarget, SystemClock.uptimeMillis() - j);
        mo39417l(shareTarget).f71897c = akdd;
        akdd.mo39250a(new akef(this, akgq, ajud, shareTarget));
        byte[] d = this.f71940g.mo39300d(str);
        if (d != null) {
            str2 = akid.m59794c(d);
        } else {
            str2 = null;
        }
        ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
        ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
        akgr akgr = akgr.SUCCESS;
        int ordinal = mo39406f(shareTarget).ordinal();
        if (ordinal == 0) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 1663, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Paired key handshake succeeded when sending to %s.", shareTarget);
            m59561c(shareTarget, null);
            mo39408g(shareTarget);
        } else if (ordinal == 1) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "a", 1655, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Paired key handshake failed when sending to %s. Disconnecting.", shareTarget);
            ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
            akdd.mo39253b();
            this.f71950q.mo39242a(shareTarget);
        } else if (ordinal == 2) {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl4.mo68432a("akgy", "a", 1669, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Unable to verify paired key encryption with %s, verify tokens on devices.", shareTarget);
            if (this.f71940g.mo39302e(str)) {
                m59561c(shareTarget, null);
                mo39408g(shareTarget);
                return;
            }
            mo39417l(shareTarget).f71899f = str2;
            m59561c(shareTarget, str2);
        }
    }

    /* renamed from: a */
    public final void mo39380a(akdd akdd, ajud ajud, String str, ShareTarget shareTarget, ajnw ajnw) {
        ajud ajud2 = ajud;
        String str2 = str;
        ShareTarget shareTarget2 = shareTarget;
        ajnw ajnw2 = ajnw;
        if (ajnw2 != null) {
            this.f71938e.mo39358a();
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 1915, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Successfully read the response frame");
            ajne ajne = ajnw2.f71027d;
            if (ajne == null) {
                ajne = ajne.f70960c;
            }
            ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
            ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            akgr akgr = akgr.SUCCESS;
            int b = ajnd.m58878b(ajne.f70963b);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 1) {
                mo39395b(akdd);
                ajvg ajvg = this.f71948o;
                long j = this.f71953t;
                List b2 = shareTarget.mo44499b();
                bxvd d = ajvh.m59107d(16);
                bxvd da = bvfu.f155922d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfu bvfu = (bvfu) da.f164949b;
                bvfu.f155924a = 1 | bvfu.f155924a;
                bvfu.f155925b = j;
                bvfe a = ajvh.m59104a(b2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfu bvfu2 = (bvfu) da.f164949b;
                a.getClass();
                bvfu2.f155926c = a;
                bvfu2.f155924a |= 2;
                bvfu bvfu3 = (bvfu) da.mo74062i();
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                bvgd bvgd = (bvgd) d.f164949b;
                bvgd bvgd2 = bvgd.f155960B;
                bvfu3.getClass();
                bvgd.f155980q = bvfu3;
                bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
                this.f71955v = SystemClock.uptimeMillis();
                ajud2.mo38711a(shareTarget2, new ajub(5).mo38916a());
                akgx akgx = new akgx(this, shareTarget2, ajud2);
                for (ahiq ahiq : mo39425p(shareTarget2)) {
                    this.f71940g.mo39291a(str2, ahiq, akgx);
                }
                for (ahiq ahiq2 : mo39427q(shareTarget2)) {
                    this.f71940g.mo39291a(str2, ahiq2, akgx);
                }
                for (ahiq ahiq3 : mo39428r(shareTarget2)) {
                    this.f71940g.mo39291a(str2, ahiq3, akgx);
                }
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "a", 1936, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("The connection was accepted. Payloads are now being sent.");
            } else if (i == 2) {
                ajud2.mo38711a(shareTarget2, new ajub(8).mo38916a());
                akdd.mo39253b();
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", "a", 1941, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("The connection was rejected. The connection has been closed.");
            } else if (i == 3) {
                ajud2.mo38711a(shareTarget2, new ajub(13).mo38916a());
                akdd.mo39253b();
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "a", 1947, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("The connection was rejected because the remote device does not have enough space for our attachments. The connection has been closed.");
            } else if (i != 4) {
                ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
                akdd.mo39253b();
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "a", 1962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("The connection failed. The connection has been closed.");
            } else {
                ajud2.mo38711a(shareTarget2, new ajub(14).mo38916a());
                akdd.mo39253b();
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl6.mo68432a("akgy", "a", 1955, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("The connection was rejected because the remote device does not support the attachments we were sending. The connection has been closed.");
            }
        } else {
            ajud2.mo38711a(shareTarget2, new ajub(7).mo38916a());
            akdd.mo39253b();
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68387b();
            bnsl7.mo68432a("akgy", "a", 1907, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Failed to read a response from the remote device. Disconnecting.");
        }
    }

    /* renamed from: a */
    public final void mo39381a(Attachment attachment) {
        ahio ahio;
        File file;
        long b = mo39393b(attachment);
        if (b == -1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "a", 2384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to retrieve payload for: %s", attachment);
            return;
        }
        ahiq a = this.f71940g.mo39279a(b);
        if (a != null && (ahio = a.f67254d) != null && (file = ahio.f67246a) != null) {
            file.delete();
        }
    }

    /* renamed from: a */
    public final void mo39382a(Attachment attachment, long j) {
        akgk akgk = (akgk) this.f71935b.get(attachment);
        if (akgk == null) {
            akgk = new akgk();
            this.f71935b.put(attachment, akgk);
        }
        akgk.f71877c = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39383a(ShareTarget shareTarget, ajud ajud, String str) {
        String str2;
        List list;
        ShareTarget shareTarget2 = shareTarget;
        String str3 = str;
        this.f71953t = (long) ajvg.m59094a();
        this.f71945l.clear();
        ajud a = mo39371a(shareTarget, ajud);
        a.mo38711a(shareTarget2, new ajub(1).mo38916a());
        if (mo39427q(shareTarget).length > 0 || mo39425p(shareTarget).length > 0 || mo39428r(shareTarget).length > 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "w", 1972, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Skipping payload creation for ShareTarget %s. Payloads already created.", shareTarget2);
        } else {
            try {
                List list2 = shareTarget2.f81034g;
                int size = list2.size();
                ahiq[] ahiqArr = new ahiq[size];
                for (int i = 0; i < list2.size(); i++) {
                    FileAttachment fileAttachment = (FileAttachment) list2.get(i);
                    Uri uri = fileAttachment.f80884d;
                    if (uri != null) {
                        ahiq a2 = ahiq.m55837a(ahio.m55834a(akif.m59796a(this.f71939f, uri)), ahiq.m55836a());
                        ahiqArr[i] = a2;
                        mo39382a(fileAttachment, a2.f67251a);
                    }
                }
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "a", 2013, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("Created file payloads of length %d", size);
                mo39417l(shareTarget).f71902i = ahiqArr;
                List list3 = shareTarget2.f81033f;
                String str4 = "b";
                int size2 = list3.size();
                ahiq[] ahiqArr2 = new ahiq[size2];
                int i2 = 0;
                while (i2 < list3.size()) {
                    TextAttachment textAttachment = (TextAttachment) list3.get(i2);
                    ahiq a3 = ahiq.m55840a(textAttachment.f81048a.getBytes());
                    ahiqArr2[i2] = a3;
                    mo39382a(textAttachment, a3.f67251a);
                    i2++;
                    str4 = str4;
                    size2 = size2;
                }
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", str4, 2025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Created text payloads of length %d", size2);
                mo39417l(shareTarget).f71901h = ahiqArr2;
                List list4 = shareTarget2.f81035h;
                String str5 = "c";
                int size3 = list4.size();
                ahiq[] ahiqArr3 = new ahiq[size3];
                int i3 = 0;
                while (i3 < list4.size()) {
                    WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list4.get(i3);
                    bxvd da = ajnx.f71031d.mo74144da();
                    String str6 = wifiCredentialsAttachment.f81060d;
                    if (str6 != null) {
                        list = list4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ajnx ajnx = (ajnx) da.f164949b;
                        str6.getClass();
                        str2 = str5;
                        ajnx.f71033a |= 1;
                        ajnx.f71034b = str6;
                    } else {
                        list = list4;
                        str2 = str5;
                    }
                    boolean z = wifiCredentialsAttachment.f81061e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajnx ajnx2 = (ajnx) da.f164949b;
                    ajnx2.f71033a |= 2;
                    ajnx2.f71035c = z;
                    ahiq a4 = ahiq.m55840a(((ajnx) da.mo74062i()).mo73642k());
                    ahiqArr3[i3] = a4;
                    mo39382a(wifiCredentialsAttachment, a4.f67251a);
                    i3++;
                    list4 = list;
                    str5 = str2;
                }
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", str5, 2048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("Created wifi payloads of length %d", size3);
                mo39417l(shareTarget).f71903j = ahiqArr3;
                if (mo39427q(shareTarget).length <= 0) {
                    if (mo39425p(shareTarget).length <= 0 && mo39428r(shareTarget).length <= 0) {
                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl5.mo68432a("akgy", "w", 1991, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("Failed to create any payloads for ShareTarget %s.", shareTarget2);
                        ajud.mo38711a(shareTarget2, new ajub(11).mo38916a());
                        return;
                    }
                }
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl6.mo68432a("akgy", "w", 1988, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68424a("Created %s payloads for ShareTarget %s.", shareTarget.mo44499b(), shareTarget2);
            } catch (IOException e) {
                bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl7.mo68437a(e);
                bnsl7.mo68432a("akgy", "w", 1995, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Failed to create file payloads for the given attachments. Disconnecting.");
            }
        }
        if (shareTarget2.f81038k && this.f71950q.mo39245b(shareTarget2)) {
            bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl8.mo68432a("akgy", "a", 1425, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68420a("%s is outdated, attempting to rescan and send.", shareTarget2);
            mo39399b(str3, shareTarget2, a);
        } else if (mo39418m(shareTarget) == null) {
            bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl9.mo68432a("akgy", "a", 1428, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68420a("%s is not discovered yet, attempting to rescan and send.", shareTarget2);
            mo39399b(str3, shareTarget2, a);
        } else {
            bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl10.mo68432a("akgy", "a", 1432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl10.mo68420a("%s is not outdated, attempting to send.", shareTarget2);
            mo39402c(str3, shareTarget2, a);
        }
    }

    /* renamed from: a */
    public final void mo39384a(ShareTarget shareTarget, String str) {
        String str2;
        int i;
        String str3;
        int i2;
        int i3;
        ShareTarget shareTarget2 = shareTarget;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 642, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Receiving introduction from %s", shareTarget2);
        akdd i4 = mo39411i(shareTarget);
        if (i4 == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 646, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("No NearbyConnection tied to %s. Disconnect", shareTarget2);
            return;
        }
        ajud k = mo39415k(shareTarget);
        if (k == null) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68432a("akgy", "a", 652, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("no TransferUpdateCallback tied to %s. Disconnect", shareTarget2);
            i4.mo39253b();
            return;
        }
        ajnw a = m59544a(i4, ajnv.INTRODUCTION);
        if (a == null) {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68432a("akgy", "a", 659, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Failed to parse the introduction frame. Disconnecting.");
            i4.mo39253b();
            return;
        }
        ajvg ajvg = this.f71948o;
        long j = this.f71954u;
        bxvd d = ajvh.m59107d(14);
        bxvd da = bvfp.f155898c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfp bvfp = (bvfp) da.f164949b;
        bvfp.f155900a |= 1;
        bvfp.f155901b = j;
        bvfp bvfp2 = (bvfp) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfp2.getClass();
        bvgd.f155978o = bvfp2;
        bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl5.mo68432a("akgy", "a", 665, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68405a("Successfully read the introduction frame");
        ajnl ajnl = a.f71026c;
        if (ajnl == null) {
            ajnl = ajnl.f70979f;
        }
        int i5 = 0;
        while (true) {
            str2 = "UNKNOWN";
            if (i5 >= ajnl.f70982b.size()) {
                break;
            }
            ajnh ajnh = (ajnh) ajnl.f70982b.get(i5);
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl6.mo68432a("akgy", "a", 672, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String str4 = ajnh.f70968b;
            int a2 = ajng.m58881a(ajnh.f70969c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 1) {
                str2 = a2 != 2 ? a2 != 3 ? a2 != 4 ? "AUDIO" : "APP" : "VIDEO" : "IMAGE";
            }
            bnsl6.mo68425a("Found file attachment %s of type %s with mimeType %s", str4, str2, ajnh.f70972f);
            ajja ajja = new ajja(ajnh.f70968b);
            int a3 = ajng.m58881a(ajnh.f70969c);
            if (a3 == 0) {
                a3 = 1;
            }
            ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            akgr akgr = akgr.SUCCESS;
            int i6 = a3 - 1;
            if (i6 != 1) {
                i3 = i6 != 2 ? i6 != 3 ? i6 != 4 ? 0 : 4 : 3 : 2;
            } else {
                i3 = 1;
            }
            ajja.f70733c = i3;
            ajja.f70732b = ajnh.f70971e;
            ajja.f70734d = ajnh.f70972f;
            FileAttachment a4 = ajja.mo38689a();
            mo39382a(a4, ajnh.f70970d);
            shareTarget2.mo44496a(a4);
            i5++;
        }
        for (int i7 = 0; i7 < ajnl.f70983c.size(); i7++) {
            ajnt ajnt = (ajnt) ajnl.f70983c.get(i7);
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a("akgy", "a", 688, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String str5 = ajnt.f71010b;
            int a5 = ajns.m58893a(ajnt.f71011c);
            if (a5 == 0) {
                a5 = 1;
            }
            if (a5 != 1) {
                str3 = a5 != 2 ? a5 != 3 ? a5 != 4 ? "PHONE_NUMBER" : "ADDRESS" : "URL" : "TEXT";
            } else {
                str3 = str2;
            }
            bnsl7.mo68424a("Found text attachment %s of type %s", str5, str3);
            ajtz ajtz = new ajtz(ajnt.f71010b);
            int a6 = ajns.m58893a(ajnt.f71011c);
            if (a6 == 0) {
                a6 = 1;
            }
            ajnz ajnz2 = ajnz.UNKNOWN_SECURITY_TYPE;
            akgr akgr2 = akgr.SUCCESS;
            int i8 = a6 - 1;
            if (i8 != 2) {
                i2 = i8 != 3 ? i8 != 4 ? 0 : 3 : 2;
            } else {
                i2 = 1;
            }
            ajtz.f71281a = i2;
            TextAttachment a7 = ajtz.mo38913a();
            mo39382a(a7, ajnt.f71012d);
            shareTarget2.mo44497a(a7);
        }
        if (cfov.m142048X()) {
            for (int i9 = 0; i9 < ajnl.f70985e.size(); i9++) {
                ajoa ajoa = (ajoa) ajnl.f70985e.get(i9);
                bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl8.mo68432a("akgy", "a", 704, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str6 = ajoa.f71046b;
                ajnz a8 = ajnz.m58902a(ajoa.f71047c);
                if (a8 == null) {
                    a8 = ajnz.UNKNOWN_SECURITY_TYPE;
                }
                bnsl8.mo68424a("Found wifiCredentials attachment %s of security type %s", str6, a8);
                ajue ajue = new ajue(ajoa.f71046b);
                ajnz a9 = ajnz.m58902a(ajoa.f71047c);
                if (a9 == null) {
                    a9 = ajnz.UNKNOWN_SECURITY_TYPE;
                }
                akgr akgr3 = akgr.SUCCESS;
                int ordinal = a9.ordinal();
                if (ordinal != 1) {
                    i = ordinal != 2 ? ordinal != 3 ? 0 : 3 : 2;
                } else {
                    i = 1;
                }
                ajue.f71288a = i;
                WifiCredentialsAttachment a10 = ajue.mo38921a();
                mo39382a(a10, ajoa.f71048d);
                shareTarget2.mo44498a(a10);
            }
        }
        if (shareTarget.mo44499b().isEmpty()) {
            bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl9.mo68432a("akgy", "a", 717, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68405a("No attachment is found for this share target. It can be result of unrecognizable attachment type.");
            if (!cfov.f185185a.mo6606a().mo82374bv()) {
                i4.mo39253b();
                return;
            }
            m59551a(shareTarget2, 14);
            bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl10.mo68432a("akgy", "a", 722, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl10.mo68420a("We don't support the attachments sent by the sender. We have informed %s", shareTarget2);
            return;
        }
        if ((ajnl.f70981a & 1) != 0) {
            shareTarget2.f81032e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", ajnl.f70984d);
        }
        bnsl bnsl11 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl11.mo68432a("akgy", "a", 737, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl11.mo68420a("Successfully received incoming connection from %s", shareTarget2);
        if (cfov.f185185a.mo6606a().mo82292aA()) {
            List b = shareTarget.mo44499b();
            BigDecimal a11 = akif.m59800a();
            int size = b.size();
            boolean z = false;
            for (int i10 = 0; i10 < size; i10++) {
                Attachment attachment = (Attachment) b.get(i10);
                if (attachment.mo44385c()) {
                    a11 = a11.subtract(new BigDecimal(Long.toString(attachment.mo44383a())));
                    z = true;
                }
            }
            if (z && a11.signum() <= 0) {
                m59551a(shareTarget2, 13);
                bnsl bnsl12 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl12.mo68432a("akgy", "a", 742, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl12.mo68420a("Not enough space on the receiver. We have informed %s", shareTarget2);
                return;
            }
        }
        this.f71938e.mo39360a(shareTarget, i4, k, cfov.m142032H());
        ajub ajub = new ajub(2);
        ajub.f71284a = str;
        k.mo38711a(shareTarget2, ajub.mo38916a());
    }

    /* renamed from: a */
    public final void mo38784a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider"));
        for (Map.Entry entry : this.f71928B.entrySet()) {
            printWriter.write(String.format("  ShareTarget: %s\n", entry.getKey()));
            printWriter.write(String.format("  %s\n", entry.getValue()));
        }
        for (Map.Entry entry2 : this.f71936c.entrySet()) {
            printWriter.write(String.format("  ShareTarget: %s\n", entry2.getKey()));
            printWriter.write(String.format("  %s\n", entry2.getValue()));
        }
        for (Map.Entry entry3 : this.f71935b.entrySet()) {
            printWriter.write(String.format("  Attachment: %s\n", entry3.getKey()));
            printWriter.write(String.format("  %s\n", entry3.getValue()));
        }
        this.f71946m.mo39193a(printWriter);
        akcm akcm = this.f71947n;
        if (ajvh.m59100a() == 2 || ajvh.m59100a() == 3) {
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.ContactBookManager"));
            printWriter.write("  Contacts:\n");
            Account b = akcm.f71604c.mo39171b();
            if (b == null) {
                printWriter.write("    No account is logged in.\n");
                return;
            }
            bxwc bxwc = akcm.f71602a.mo39436b(b).f70709a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ajif ajif = (ajif) bxwc.get(i);
                String valueOf = String.valueOf(akcm.m59393a(ajif));
                String format = DateFormat.getDateTimeInstance().format(new Date(ajif.f70705j));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(format).length());
                sb.append("    ");
                sb.append(valueOf);
                sb.append(" lastCheckedReachability: ");
                sb.append(format);
                sb.append("\n");
                printWriter.write(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo39385a(Runnable runnable) {
        this.f71929C.execute(runnable);
    }

    /* renamed from: a */
    public final void mo39266a(String str) {
        mo39385a(new akgc(this, str));
    }

    /* renamed from: a */
    public final void mo39267a(String str, int i) {
        mo39385a(new akdy(this, str, i));
    }

    /* renamed from: a */
    public void mo38785a(String str, ajud ajud, akbw akbw) {
        mo39385a(new akfe(this, akbw, str, ajud));
    }

    /* renamed from: a */
    public void mo38786a(String str, ShareTarget shareTarget, ajud ajud) {
        mo39385a(new akeb(this, shareTarget, ajud, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39386a(String str, Exception exc) {
        mo39376a(0, (int) C0126R.string.sharing_toast_wifi_connection_failed, str);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("akgy", "a", 2884, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("WifiUtils#connectToWifi failed to connect to %s", str);
    }

    /* renamed from: a */
    public final void mo39268a(String str, byte[] bArr) {
        mo39385a(new akgb(this, str, bArr));
    }

    /* renamed from: a */
    public final void mo39269a(String str, byte[] bArr, akdd akdd) {
        mo39385a(new akfp(this, bArr, akdd, str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget
     arg types: [akce, int]
     candidates:
      akgy.a(java.lang.String, java.util.concurrent.Callable):int
      akgy.a(akdd, ajnv):ajnw
      akgy.a(ajnm, byte[]):akgr
      akgy.a(android.content.Intent, com.google.android.gms.nearby.sharing.FileAttachment):android.content.Intent
      akgy.a(long, akdd):void
      akgy.a(akdd, ajne):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, int):void
      akgy.a(java.util.List, long):boolean
      akgy.a(byte, byte[]):byte[]
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud):ajud
      akgy.a(java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(java.lang.Runnable, long):java.util.concurrent.ScheduledFuture
      akgy.a(ajsn, akbz):void
      akgy.a(ajud, com.google.android.gms.nearby.sharing.ShareTarget):void
      akgy.a(com.google.android.gms.nearby.sharing.Attachment, long):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, java.lang.String):void
      akgy.a(java.lang.String, int):void
      akgy.a(java.lang.String, java.lang.Exception):void
      akgy.a(java.lang.String, byte[]):void
      akcd.a(ajsn, akbz):void
      akdr.a(java.lang.String, int):void
      akdr.a(java.lang.String, byte[]):void
      akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget */
    /* renamed from: a */
    public final void mo39387a(String str, byte[] bArr, boolean z) {
        ShareTarget shareTarget;
        if (!mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 979, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring discovered endpoint %s because we're no longer scanning", akid.m59793b(bArr));
            return;
        }
        ajsn ajsn = this.f71941h;
        akce a = akce.m59343a(bArr);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 988, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse discovered advertisement %s", akid.m59793b(bArr));
            return;
        }
        ShareTarget c = mo39400c(str);
        if (c == null) {
            ShareTarget a2 = mo39374a(a, false);
            if (a2 == null) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", "a", 1001, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to convert advertisement %s to share target from discovered advertisement. Disconnecting.", akid.m59793b(bArr));
                this.f71934a.put(str, bArr);
                return;
            }
            if (a2.f81038k) {
                Iterator it = this.f71936c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        shareTarget = null;
                        break;
                    }
                    shareTarget = (ShareTarget) ((Map.Entry) it.next()).getKey();
                    if (akda.m59444a(shareTarget, a2)) {
                        break;
                    }
                }
                if (shareTarget != null) {
                    c = shareTarget;
                    mo39396b(c, str);
                    ajsn.mo38707a(c);
                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl4.mo68432a("akgy", "a", 1025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68423a("Reported onShareTargetDiscovered for %s in %s millis.", c, SystemClock.uptimeMillis() - this.f71956w);
                }
            }
            c = a2;
            mo39396b(c, str);
            ajsn.mo38707a(c);
            bnsl bnsl42 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl42.mo68432a("akgy", "a", 1025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl42.mo68423a("Reported onShareTargetDiscovered for %s in %s millis.", c, SystemClock.uptimeMillis() - this.f71956w);
        }
        if (z && c.f81038k && !c.f81041n) {
            this.f71950q.mo39243a(c, str, bArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39388a(boolean z, String str, ShareTarget shareTarget, ajud ajud) {
        if (!z) {
            ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
            this.f71950q.mo39242a(shareTarget);
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 1475, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to connect to outdated %s, because failed to discover the share target.", shareTarget);
            return;
        }
        mo39402c(str, shareTarget, ajud);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget
     arg types: [akce, int]
     candidates:
      akgy.a(java.lang.String, java.util.concurrent.Callable):int
      akgy.a(akdd, ajnv):ajnw
      akgy.a(ajnm, byte[]):akgr
      akgy.a(android.content.Intent, com.google.android.gms.nearby.sharing.FileAttachment):android.content.Intent
      akgy.a(long, akdd):void
      akgy.a(akdd, ajne):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, int):void
      akgy.a(java.util.List, long):boolean
      akgy.a(byte, byte[]):byte[]
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud):ajud
      akgy.a(java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(java.lang.Runnable, long):java.util.concurrent.ScheduledFuture
      akgy.a(ajsn, akbz):void
      akgy.a(ajud, com.google.android.gms.nearby.sharing.ShareTarget):void
      akgy.a(com.google.android.gms.nearby.sharing.Attachment, long):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, java.lang.String):void
      akgy.a(java.lang.String, int):void
      akgy.a(java.lang.String, java.lang.Exception):void
      akgy.a(java.lang.String, byte[]):void
      akcd.a(ajsn, akbz):void
      akdr.a(java.lang.String, int):void
      akdr.a(java.lang.String, byte[]):void
      akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39389a(byte[] bArr, akdd akdd, String str) {
        String str2;
        this.f71954u = (long) ajvg.m59094a();
        this.f71945l.clear();
        ajud ajud = this.f71942i;
        if (ajud == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 531, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring incoming connection from endpoint %s because we're no longer advertising. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        akce a = akce.m59343a(bArr);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse incoming connection from endpoint %s. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        ShareTarget a2 = mo39374a(a, true);
        if (a2 == null) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to convert advertisement %s to share target from incoming connection. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl4.mo68432a("akgy", "a", 560, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Received incoming connection from %s", a2);
        mo39410h(a2).f71892c = akdd;
        ajud a3 = mo39370a(ajud);
        mo39410h(a2).f71893d = a3;
        mo39410h(a2).f71890a = str;
        akdd.mo39250a(new akfu(this, a2));
        byte[] d = this.f71940g.mo39300d(str);
        if (d != null) {
            str2 = akid.m59794c(d);
        } else {
            str2 = null;
        }
        ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
        ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
        akgr akgr = akgr.SUCCESS;
        int ordinal = mo39406f(a2).ordinal();
        if (ordinal == 0) {
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl5.mo68432a("akgy", "a", 586, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Paired key handshake succeeded when receiving connection from %s.", a2);
            this.f71940g.mo39303f(str);
            mo39384a(a2, (String) null);
            if (this.f71940g.mo39302e(str)) {
                mo39404e(a2);
            }
        } else if (ordinal == 1) {
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl6.mo68432a("akgy", "a", 578, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Paired key handshake failed when receiving connection from %s. Disconnecting.", a2);
            akdd.mo39253b();
            return;
        } else if (ordinal == 2) {
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a("akgy", "a", 602, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68420a("Unable to verify paired key encryption when receiving connection from %s. Verify tokens on devices.", a2);
            if (this.f71940g.mo39302e(str)) {
                this.f71940g.mo39303f(str);
                mo39384a(a2, (String) null);
            } else {
                mo39410h(a2).f71894f = str2;
                mo39384a(a2, str2);
            }
        }
        akdd.mo39250a(new akfv(this, a3, a2));
    }

    /* renamed from: a */
    public final boolean mo39390a(FileAttachment fileAttachment) {
        Uri uri;
        long b = mo39393b((Attachment) fileAttachment);
        if (b == -1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "a", 2159, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to update the location of %s. No payload ID found.", fileAttachment);
            return false;
        }
        ahiq a = this.f71940g.mo39279a(b);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "a", 2166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to update the location of %s. No payload found.", fileAttachment);
            return false;
        }
        ahio ahio = a.f67254d;
        if (ahio == null) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68432a("akgy", "a", 2172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to update the location of %s. No file found.", fileAttachment);
            return false;
        }
        File file = ahio.f67246a;
        if (file == null) {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68432a("akgy", "a", 2178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Cannot move attachment %s due to failure to get the Java file.", fileAttachment);
            return false;
        }
        if (cfov.f185185a.mo6606a().mo82384h()) {
            if (ssw.m36269a()) {
                uri = mo39372a(file, fileAttachment);
            } else {
                uri = null;
            }
            if (uri == null) {
                uri = mo39373a(file, m59557b(fileAttachment), fileAttachment);
            }
        } else if (ssw.m36269a()) {
            uri = mo39372a(file, fileAttachment);
        } else {
            uri = mo39373a(file, m59557b(fileAttachment), fileAttachment);
        }
        if (uri == null) {
            return false;
        }
        akgk akgk = (akgk) this.f71935b.get(fileAttachment);
        if (akgk == null) {
            akgk = new akgk();
            this.f71935b.put(fileAttachment, akgk);
        }
        akgk.f71875a = uri;
        return true;
    }

    /* renamed from: a */
    public final boolean mo39391a(TextAttachment textAttachment) {
        long b = mo39393b(textAttachment);
        if (b == -1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "a", 2128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to receive text body of %s. No payload ID found.", textAttachment);
            return false;
        }
        ahiq a = this.f71940g.mo39279a(b);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "a", 2134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to receive text body of %s. No payload found.", textAttachment);
            return false;
        }
        byte[] bArr = a.f67253c;
        if (akid.m59787a(bArr)) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68432a("akgy", "a", 2140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to receive text body of %s. Incoming bytes is empty.", textAttachment);
            return false;
        }
        String str = new String(bArr);
        akgk akgk = (akgk) this.f71935b.get(textAttachment);
        if (akgk == null) {
            akgk = new akgk();
            this.f71935b.put(textAttachment, akgk);
        }
        akgk.f71878d = str;
        return true;
    }

    /* renamed from: a */
    public final boolean mo39392a(WifiCredentialsAttachment wifiCredentialsAttachment) {
        long b = mo39393b((Attachment) wifiCredentialsAttachment);
        if (b == -1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "a", 2095, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to receive Wi-Fi credential %s. No payload ID found.", wifiCredentialsAttachment);
            return false;
        }
        ahiq a = this.f71940g.mo39279a(b);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "a", 2102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to receive Wi-Fi credential of %s. No payload found.", wifiCredentialsAttachment);
            return false;
        }
        byte[] bArr = a.f67253c;
        if (!akid.m59787a(bArr)) {
            try {
                ajnx ajnx = (ajnx) bxvk.m124016a(ajnx.f71031d, bArr, bxus.m123744c());
                akgk akgk = (akgk) this.f71935b.get(wifiCredentialsAttachment);
                if (akgk == null) {
                    akgk = new akgk();
                    this.f71935b.put(wifiCredentialsAttachment, akgk);
                }
                akgk.f71876b = ajnx;
                return true;
            } catch (bxwf e) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("akgy", "a", 2120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to receive Wi-Fi credential of %s.", wifiCredentialsAttachment);
                return false;
            }
        } else {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68432a("akgy", "a", 2109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Failed to receive Wi-Fi credential of %s. No file found.", wifiCredentialsAttachment);
            return false;
        }
    }
}
