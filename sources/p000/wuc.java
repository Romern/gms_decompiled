package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.slice.Slice;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wuc extends dnu {

    /* renamed from: b */
    public final List f51348b = new ArrayList();

    /* renamed from: c */
    private wuj f51349c;

    /* renamed from: d */
    private apr f51350d;

    /* renamed from: e */
    private rfz f51351e;

    public wuc(String... strArr) {
        super(strArr);
    }

    /* renamed from: a */
    private static PendingIntent m42257a(Context context, String str, bzau bzau, String str2, byte[] bArr, String str3, Intent intent) {
        if (intent != null && !TextUtils.isEmpty(str3)) {
            return PendingIntent.getService(context, 2, butb.m120415a(context, bvin.FAST_PAIR_DEVICE_OPEN_COMPANION_APP_CLICKED, str, bzau, str2, bArr, intent), 134217728);
        }
        return PendingIntent.getService(context, 2, butb.m120415a(context, bvin.FAST_PAIR_DEVICE_INSTALL_COMPANION_APP_CLICKED, str, bzau, str2, bArr, busm.m120388a(context, sbv.m34879b(str))), 134217728);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0153, code lost:
        if (p000.cfoj.f184966a.mo82049ag().mo82156bm() == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ac, code lost:
        if (r13.mo29411a(r8.f51350d, m42259a("settings_slice", r11, r0), new p000.wua(r16, new java.util.concurrent.atomic.AtomicInteger(com.felicanetworks.mfc.mfi.MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), r14, r19, r11, r12)) == false) goto L_0x01ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0176  */
    /* renamed from: b */
    private final Slice m42269b(Context context, Uri uri, bzau bzau) {
        String str;
        String str2;
        Context context2 = context;
        String queryParameter = uri.getQueryParameter("address");
        String queryParameter2 = uri.getQueryParameter("account_key");
        if (!TextUtils.isEmpty(queryParameter)) {
            wuj b = m42271b();
            if (b == null) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                bnsl.mo68432a("wuc", "a", 476, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper.");
                return null;
            }
            try {
                DeviceDetailsLinks b2 = b.mo29418b(queryParameter);
                if (b2 == null) {
                    bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                    bnsl2.mo68432a("wuc", "a", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("FastPairSlice: No data found for deviceDetailsLinks.");
                    return null;
                }
                wug b3 = m42270b(context, uri);
                if (this.f51350d == null) {
                    this.f51350d = apr.m1818a(getContext());
                }
                String f = b2.mo86676f();
                String g = b2.mo86677g();
                String a = wul.m42303a(b2.mo86673c());
                if (TextUtils.isEmpty(f)) {
                    str = cfog.m141290r();
                } else {
                    str = (cfog.m141290r().equals(f) || cfoj.m141548ac()) ? f : null;
                }
                if (!cfog.m141290r().equals(str) && cfoj.m141548ac()) {
                    if (g == null) {
                        str2 = null;
                    } else {
                        if (a != null) {
                            try {
                                if (context.getPackageManager().getPackageInfo(a, 64).signatures.length != 1) {
                                    bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
                                    bnsl3.mo68432a("wuc", "a", 524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68405a("Does not show slice since companion app has more than one signature");
                                } else if (!g.toUpperCase(Locale.ENGLISH).equals(spn.m35867b(context2, a, "SHA-256")) && !context2.getSharedPreferences("discovery_shared_pref", 4).getBoolean("nearby_debug_mode", cfod.m141143c())) {
                                    bnsl bnsl4 = (bnsl) wtw.f51331a.mo68390d();
                                    bnsl4.mo68432a("wuc", "a", 533, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl4.mo68405a("Does not show slice signature, hash does not match what is registered in the console");
                                    str2 = null;
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                bnsl bnsl5 = (bnsl) wtw.f51331a.mo68388c();
                                bnsl5.mo68437a(e);
                                bnsl5.mo68432a("wuc", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5.mo68420a("Fail to verify the app's signature package name: %s", a);
                            }
                        }
                        str2 = null;
                    }
                    if (str2 != null) {
                        if (b3.mo29411a(this.f51350d, m42259a("oobe_slice", queryParameter, str2), new wtz(this, new AtomicInteger(100), a, bzau, queryParameter, b2))) {
                        }
                    }
                    m42265a(context, b3, b2, queryParameter, bzau);
                    m42266a(context, b3, b2.mo86671a(), queryParameter, bzau);
                    if (!m42272c(uri)) {
                        if (!TextUtils.isEmpty(str2) && (!str2.equals(cfog.m141290r()) || sre.m36086f(context))) {
                        }
                        m42264a(context, b3, b2, bzau);
                    }
                    return b3.mo29408a();
                }
                str2 = str;
                if (str2 != null) {
                }
                m42265a(context, b3, b2, queryParameter, bzau);
                m42266a(context, b3, b2.mo86671a(), queryParameter, bzau);
                if (!m42272c(uri)) {
                }
                return b3.mo29408a();
            } catch (RemoteException e2) {
                bnsl bnsl6 = (bnsl) wtw.f51331a.mo68388c();
                bnsl6.mo68432a("wuc", "a", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("FastPairSlice: RemoteException when getting DeviceDetailsLinks.");
                return null;
            }
        } else if (queryParameter2 == null) {
            bnsl bnsl7 = (bnsl) wtw.f51331a.mo68390d();
            bnsl7.mo68432a("wuc", "b", 465, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("FastPairSlice: Queried device details links but did not include address.");
            return null;
        } else {
            byte[] b4 = boan.f132472f.mo68796b(queryParameter2);
            wug b5 = m42270b(context, uri);
            m42266a(context, b5, b4, (String) null, bzau);
            return b5.mo29408a();
        }
    }

    /* renamed from: c */
    private static boolean m42272c(Uri uri) {
        return cfog.f184854a.mo6606a().mo82009ar().equals(uri.getQueryParameter("caller"));
    }

    /* renamed from: a */
    public final boolean mo9324a() {
        return true;
    }

    /* renamed from: a */
    private static Bitmap m42258a(Context context, int i) {
        Drawable a = C1133kh.m17836a(context, i);
        Bitmap createBitmap = Bitmap.createBitmap(a.getIntrinsicWidth(), a.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        a.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    static Uri m42259a(String str, String str2, String str3) {
        return new Uri.Builder().scheme("content").authority(str3).appendPath(str).appendQueryParameter("addr", str2).build();
    }

    /* renamed from: a */
    private final Slice m42260a(Context context, Uri uri) {
        IconCompat iconCompat;
        String str;
        Context context2 = context;
        String str2 = "wuc";
        if (this.f51348b.isEmpty()) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a(str2, "a", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: Nothing found from discoveryListItem");
            return null;
        }
        List list = this.f51348b;
        int size = list.size();
        DiscoveryListItem discoveryListItem = null;
        int i = 0;
        while (i < size) {
            DiscoveryListItem discoveryListItem2 = (DiscoveryListItem) list.get(i);
            if (discoveryListItem2 == null) {
                str = str2;
            } else if (bzbk.NEARBY_DEVICE.equals(discoveryListItem2.f191746l)) {
                if (discoveryListItem != null) {
                    if (!discoveryListItem2.mo86668a()) {
                        str = str2;
                    } else if (discoveryListItem.mo86668a()) {
                        str = str2;
                        if (discoveryListItem2.f191748n >= discoveryListItem.f191748n) {
                        }
                        discoveryListItem = discoveryListItem2;
                    }
                }
                str = str2;
                discoveryListItem = discoveryListItem2;
            } else {
                str = str2;
            }
            i++;
            str2 = str;
        }
        String str3 = str2;
        if (discoveryListItem == null) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a(str3, "a", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FastPairSlice: Nothing found from discoveryListItem");
            return null;
        }
        wug a = wug.m42283a(context, uri);
        Bitmap bitmap = discoveryListItem.f191744j;
        if (bitmap != null) {
            iconCompat = IconCompat.m1176a(bitmap);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            iconCompat = IconCompat.m1178b(context);
        }
        a.mo29410a(PendingIntent.getService(context2, 0, discoveryListItem.f191743i, 134217728), iconCompat, discoveryListItem.f191736b, context2.getString(C0126R.string.common_tap_to_pair), false);
        return a.mo29408a();
    }

    /* renamed from: a */
    private final Slice m42261a(Context context, Uri uri, bzau bzau) {
        wuj b = m42271b();
        if (b == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuc", "a", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: createOtaSlice can't get ServiceBindHelper.");
            return null;
        }
        bqgg b2 = b.mo29417b();
        if (b2 != null) {
            try {
                List<DiscoveryListItem> list = (List) b2.get(cfog.m141296x(), TimeUnit.MILLISECONDS);
                if (list != null && !list.isEmpty()) {
                    bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                    bnsl2.mo68432a("wuc", "a", 386, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("FastPairSlice: Got %d firmware updatable items.", list.size());
                    wug a = wug.m42283a(context, uri);
                    for (DiscoveryListItem discoveryListItem : list) {
                        String str = discoveryListItem.f191740f;
                        if (str == null) {
                            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
                            bnsl3.mo68432a("wuc", "a", 391, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("FastPairSlice: Skip adding unknown package for ota slice.");
                        } else {
                            a.mo29410a(m42257a(context, str, bzau, discoveryListItem.f191749o, (byte[]) null, buqy.m120266b(context, str), context.getPackageManager().getLaunchIntentForPackage(discoveryListItem.f191740f)), IconCompat.m1176a(discoveryListItem.f191744j), discoveryListItem.f191736b, discoveryListItem.f191737c, false);
                        }
                    }
                    return a.mo29408a();
                }
                bnsl bnsl4 = (bnsl) wtw.f51331a.mo68390d();
                bnsl4.mo68432a("wuc", "a", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("FastPairSlice: FirmwareUpdatableItems is empty.");
                return null;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                bnsl bnsl5 = (bnsl) wtw.f51331a.mo68388c();
                bnsl5.mo68437a(e);
                bnsl5.mo68432a("wuc", "a", 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("FastPairSlice: Meet exception when getting FirmwareUpdatableItems.");
                return null;
            }
        } else {
            bnsl bnsl6 = (bnsl) wtw.f51331a.mo68388c();
            bnsl6.mo68432a("wuc", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("FastPairSlice: getFirmwareUpdatableItemFuture is null!");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013f, code lost:
        if (p000.cfoj.f184966a.mo82049ag().mo82156bm() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        if (r12.mo29411a(r8.f51350d, m42259a("settings_slice", r10, r0), new p000.wua(r16, new java.util.concurrent.atomic.AtomicInteger(com.felicanetworks.mfc.mfi.MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), r13, r20, r19, r11)) == false) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0164  */
    /* renamed from: a */
    private final Slice m42262a(Context context, Uri uri, String str, bzau bzau) {
        String str2;
        String str3;
        Context context2 = context;
        String str4 = str;
        wuj b = m42271b();
        if (b == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuc", "a", 476, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper.");
            return null;
        }
        try {
            DeviceDetailsLinks b2 = b.mo29418b(str4);
            if (b2 == null) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                bnsl2.mo68432a("wuc", "a", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPairSlice: No data found for deviceDetailsLinks.");
                return null;
            }
            wug b3 = m42270b(context, uri);
            if (this.f51350d == null) {
                this.f51350d = apr.m1818a(getContext());
            }
            String f = b2.mo86676f();
            String g = b2.mo86677g();
            String a = wul.m42303a(b2.mo86673c());
            if (TextUtils.isEmpty(f)) {
                str2 = cfog.m141290r();
            } else {
                str2 = (cfog.m141290r().equals(f) || cfoj.m141548ac()) ? f : null;
            }
            if (!cfog.m141290r().equals(str2) && cfoj.m141548ac()) {
                if (g == null) {
                    str3 = null;
                } else {
                    if (a != null) {
                        try {
                            if (context.getPackageManager().getPackageInfo(a, 64).signatures.length != 1) {
                                bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
                                bnsl3.mo68432a("wuc", "a", 524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Does not show slice since companion app has more than one signature");
                            } else if (!g.toUpperCase(Locale.ENGLISH).equals(spn.m35867b(context2, a, "SHA-256")) && !context2.getSharedPreferences("discovery_shared_pref", 4).getBoolean("nearby_debug_mode", cfod.m141143c())) {
                                bnsl bnsl4 = (bnsl) wtw.f51331a.mo68390d();
                                bnsl4.mo68432a("wuc", "a", 533, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68405a("Does not show slice signature, hash does not match what is registered in the console");
                                str3 = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            bnsl bnsl5 = (bnsl) wtw.f51331a.mo68388c();
                            bnsl5.mo68437a(e);
                            bnsl5.mo68432a("wuc", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68420a("Fail to verify the app's signature package name: %s", a);
                        }
                    }
                    str3 = null;
                }
                if (str3 != null) {
                    if (b3.mo29411a(this.f51350d, m42259a("oobe_slice", str4, str3), new wtz(this, new AtomicInteger(100), a, bzau, str, b2))) {
                    }
                }
                m42265a(context, b3, b2, str, bzau);
                m42266a(context, b3, b2.mo86671a(), str, bzau);
                if (!m42272c(uri)) {
                    if (!TextUtils.isEmpty(str3) && (!str3.equals(cfog.m141290r()) || sre.m36086f(context))) {
                    }
                    m42264a(context, b3, b2, bzau);
                }
                return b3.mo29408a();
            }
            str3 = str2;
            if (str3 != null) {
            }
            m42265a(context, b3, b2, str, bzau);
            m42266a(context, b3, b2.mo86671a(), str, bzau);
            if (!m42272c(uri)) {
            }
            return b3.mo29408a();
        } catch (RemoteException e2) {
            bnsl bnsl6 = (bnsl) wtw.f51331a.mo68388c();
            bnsl6.mo68432a("wuc", "a", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("FastPairSlice: RemoteException when getting DeviceDetailsLinks.");
            return null;
        }
    }

    /* renamed from: b */
    private static wug m42270b(Context context, Uri uri) {
        int i = Build.VERSION.SDK_INT;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 16974371);
        TypedValue typedValue = new TypedValue();
        contextThemeWrapper.getTheme().resolveAttribute(16843817, typedValue, true);
        int color = contextThemeWrapper.getColor(typedValue.resourceId);
        wug a = wug.m42283a(context, uri);
        a.mo29409a(color);
        return a;
    }

    /* renamed from: b */
    private final wuj m42271b() {
        wuj wuj = this.f51349c;
        if (wuj != null) {
            return wuj;
        }
        if (getContext() == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuc", "b", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: getServiceBindHelper got null context ");
            return null;
        }
        wuj wuj2 = new wuj(getContext(), buqh.m120234a("FastPairSliceProvider"), new wty(this));
        this.f51349c = wuj2;
        return wuj2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wuc.a(android.net.Uri, boolean):void
     arg types: [android.net.Uri, int]
     candidates:
      wuc.a(android.content.Context, int):android.graphics.Bitmap
      wuc.a(android.content.Context, android.net.Uri):androidx.slice.Slice
      wuc.a(android.content.Context, java.lang.String):void
      wuc.a(android.net.Uri, boolean):void */
    /* renamed from: b */
    public final void mo9325b(Uri uri) {
        srn srn = wtw.f51331a;
        uri.toString();
        m42267a(uri, false);
    }

    /* renamed from: a */
    public static void m42263a(Context context, String str) {
        context.getContentResolver().notifyChange(busp.m120391a(str), null);
        if ("links".equals(str)) {
            context.getContentResolver().notifyChange(busp.f154817a, null);
        }
    }

    /* renamed from: a */
    private final void m42264a(Context context, wug wug, DeviceDetailsLinks deviceDetailsLinks, bzau bzau) {
        boolean z;
        String str;
        String str2;
        Context context2 = context;
        if (!cfoj.f184966a.mo6606a().mo82192y()) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuc", "a", 680, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: Companion app slice disabled.");
            return;
        }
        String c = deviceDetailsLinks.mo86673c();
        if (c == null || c.isEmpty()) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a("wuc", "a", 686, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FastPairSlice: No actionUrl for this device.");
            return;
        }
        String b = busp.m120393b(c);
        if (b == null || b.isEmpty()) {
            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
            bnsl3.mo68432a("wuc", "a", 693, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("FastPairSlice: No companion app for device.");
            return;
        }
        String b2 = buqy.m120266b(getContext(), b);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(b);
        PendingIntent a = m42257a(context, b, bzau, deviceDetailsLinks.mo86674d(), deviceDetailsLinks.mo86671a(), b2, launchIntentForPackage);
        if (launchIntentForPackage == null || TextUtils.isEmpty(b2)) {
            z = false;
        } else {
            z = true;
        }
        boolean e = deviceDetailsLinks.mo86675e();
        if (!z) {
            if (!e) {
                str2 = context2.getString(C0126R.string.fast_pair_slice_install_companion_without_firmware_title);
            } else {
                str2 = context2.getString(C0126R.string.common_firmware_update);
            }
            str = context2.getString(C0126R.string.fast_pair_slice_install_companion_without_firmware_description);
        } else if (!e) {
            str2 = context2.getString(C0126R.string.fast_pair_slice_open_companion_without_firmware_title, b2);
            str = context2.getString(C0126R.string.fast_pair_slice_open_companion_without_firmware_description);
        } else {
            String string = context2.getString(C0126R.string.common_firmware_update);
            str = context2.getString(C0126R.string.fast_pair_slice_open_companion_with_firmware_description, b2);
            str2 = string;
        }
        wub wub = new wub(str2, str);
        IconCompat a2 = IconCompat.m1176a(m42258a(context2, (int) C0126R.C0127drawable.quantum_ic_open_in_new_vd_theme_24));
        a2.mo1109a(-16777216);
        wug.mo29410a(a, a2, wub.f51346a, wub.f51347b, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if (r0.isConnected() != false) goto L_0x0087;
     */
    /* renamed from: a */
    private final void m42265a(Context context, wug wug, DeviceDetailsLinks deviceDetailsLinks, String str, bzau bzau) {
        bxvd bxvd;
        Context context2 = context;
        String str2 = str;
        if (!cfoj.f184966a.mo6606a().mo82177j()) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuc", "a", 836, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: Assistant slice disabled.");
        } else if (deviceDetailsLinks.mo86672b()) {
            if (!cfoj.f184966a.mo6606a().mo82155bl()) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                    bnsl2.mo68432a("wuc", "a", 929, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("FastPairSlice: BluetoothAdapter not found.");
                } else {
                    BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str2);
                    if (remoteDevice == null) {
                        bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
                        bnsl3.mo68432a("wuc", "a", 935, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("FastPairSlice: BluetoothAdapter remote device %s not found.", str2);
                    }
                }
                bnsl bnsl4 = (bnsl) wtw.f51331a.mo68390d();
                bnsl4.mo68432a("wuc", "a", 847, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("FastPairSlice: Assistant settings not shown because not connected.");
                return;
            }
            if (buqy.m120265a(getContext(), cfog.m141275c())) {
                bxvj bxvj = dcq.f12872d;
                if (str2 != null) {
                    bxvd = dcq.f12871c.mo74144da();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    dcq dcq = (dcq) bxvd.f164949b;
                    str.getClass();
                    dcq.f12874a |= 1;
                    dcq.f12875b = str2;
                } else {
                    bxvd = dcq.f12871c.mo74144da();
                }
                dcq dcq2 = (dcq) bxvd.mo74062i();
                bxvd da = ayue.f98506f.mo74144da();
                bxvd da2 = ayua.f98489c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayua ayua = (ayua) da2.f164949b;
                "https://www.google.com".getClass();
                ayua.f98491a |= 1;
                ayua.f98492b = "https://www.google.com";
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayue ayue = (ayue) da.f164949b;
                ayua ayua2 = (ayua) da2.mo74062i();
                ayua2.getClass();
                ayue.f98512e = ayua2;
                ayue.f98508a |= 8;
                bxvd da3 = ayud.f98502a.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ayud.m84825a((ayud) da3.f164949b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayue ayue2 = (ayue) da.f164949b;
                ayud ayud = (ayud) da3.mo74062i();
                ayud.getClass();
                ayue2.f98509b = ayud;
                ayue2.f98508a |= 1;
                bxvd da4 = ayuc.f98498a.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ayuc.m84823a((ayuc) da4.f164949b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayue ayue3 = (ayue) da.f164949b;
                ayuc ayuc = (ayuc) da4.mo74062i();
                ayuc.getClass();
                ayue3.f98510c = ayuc;
                ayue3.f98508a |= 2;
                bxvd da5 = ayub.f98493c.mo74144da();
                bxvd da6 = ayuf.f98514d.mo74144da();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                ayuf ayuf = (ayuf) da6.f164949b;
                ayuf.f98517b = 9;
                ayuf.f98516a |= 1;
                bxvf bxvf = (bxvf) dcp.f12868a.mo74144da();
                bxvj bxvj2 = dcr.f12876a;
                bxvf bxvf2 = (bxvf) dcs.f12877a.mo74144da();
                bxvf2.mo74125a(bxvj, dcq2);
                bxvf.mo74125a(bxvj2, (dcs) bxvf2.mo74062i());
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                ayuf ayuf2 = (ayuf) da6.f164949b;
                dcp dcp = (dcp) bxvf.mo74062i();
                dcp.getClass();
                ayuf2.f98518c = dcp;
                ayuf2.f98516a |= 2;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                ayub ayub = (ayub) da5.f164949b;
                ayuf ayuf3 = (ayuf) da6.mo74062i();
                ayuf3.getClass();
                ayub.f98496b = ayuf3;
                ayub.f98495a = 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayue ayue4 = (ayue) da.f164949b;
                ayub ayub2 = (ayub) da5.mo74062i();
                ayub2.getClass();
                ayue4.f98511d = ayub2;
                ayue4.f98508a |= 4;
                bxvd da7 = ayuh.f98521c.mo74144da();
                ByteString a = ByteString.m123261a(((ayue) da.mo74062i()).serializeToBytes());
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                ayuh ayuh = (ayuh) da7.f164949b;
                a.getClass();
                ayuh.f98523a |= 2;
                ayuh.f98524b = a;
                Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("googleapp").authority("deeplink").path("/").appendQueryParameter("data", boan.f132471e.mo68783a().mo68794a(((ayuh) da7.mo74062i()).serializeToBytes())).build());
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    bnsl bnsl5 = (bnsl) wtw.f51331a.mo68390d();
                    bnsl5.mo68432a("wuc", "a", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("FastPairSlice: No resolveActivity for assistant deep link.");
                    return;
                }
                String string = context2.getString(C0126R.string.fast_pair_assistant_slice_title_new);
                PendingIntent service = PendingIntent.getService(context2, 1, butb.m120415a(context, bvin.FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED, cfog.m141275c(), bzau, str, deviceDetailsLinks.mo86671a(), intent), 134217728);
                IconCompat a2 = IconCompat.m1176a(m42258a(context2, (int) C0126R.C0127drawable.quantum_ic_google_assistant_vd_theme_24));
                a2.mo1109a(-16777216);
                wug.mo29410a(service, a2, string, context2.getString(C0126R.string.fast_pair_assistant_slice_summary), true);
                return;
            }
            bnsl bnsl6 = (bnsl) wtw.f51331a.mo68390d();
            bnsl6.mo68432a("wuc", "a", 858, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("FastPairSlice: No assistant app is installed.");
        } else {
            bnsl bnsl7 = (bnsl) wtw.f51331a.mo68390d();
            bnsl7.mo68432a("wuc", "a", 841, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("FastPairSlice: This item doesn't support assistant.");
        }
    }

    /* renamed from: a */
    private final void m42266a(Context context, wug wug, byte[] bArr, String str, bzau bzau) {
        Intent intent;
        Intent intent2;
        byte[] bArr2 = bArr;
        if (cfoj.f184966a.mo6606a().mo82123au()) {
            Context context2 = getContext();
            boolean bx = cfoj.f184966a.mo6606a().mo82167bx();
            boolean aG = cfoj.f184966a.mo6606a().mo82083aG();
            if (bx) {
                intent = new Intent("com.google.android.gms.nearby.fastpair.FINDDEVICE").addCategory("android.intent.category.DEFAULT").setFlags(268435456).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", bArr2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", bzau.f169233e);
            } else {
                if (!aG) {
                    intent2 = null;
                } else if (cfoj.f184966a.mo6606a().mo82125aw() || buqy.m120265a(context2, "com.google.android.apps.adm")) {
                    intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("https").authority("www.google.com").appendPath("android").appendPath("find").appendQueryParameter("device", boan.f132472f.mo68794a(bArr2)).build());
                } else {
                    intent2 = busm.m120388a(context2, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", "com.google.android.apps.adm").build()));
                }
                intent = intent2;
            }
            if (intent == null) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
                bnsl.mo68432a("wuc", "a", 800, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPairSlice: Can't create Find My Device intent.");
                return;
            }
            ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
            if (resolveActivity == null) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                bnsl2.mo68432a("wuc", "a", 805, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPairSlice: Can't resolve Find My Device activity.");
                return;
            }
            wug.mo29410a(PendingIntent.getService(context, 0, butb.m120415a(context, bvin.FAST_PAIR_DEVICE_FIND_DEVICE_CLICKED, resolveActivity.getPackageName(), bzau, str, bArr, intent), 134217728), IconCompat.m1176a(m42258a(context, (int) C0126R.C0127drawable.quantum_gm_ic_fmd_good_vd_theme_24)), context.getString(C0126R.string.fast_pair_find_device_title), context.getString(C0126R.string.fast_pair_slice_find_device_description), true);
            return;
        }
        bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
        bnsl3.mo68432a("wuc", "a", 787, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("FastPairSlice: Find device slice disabled.");
    }

    /* renamed from: a */
    private final void m42267a(Uri uri, boolean z) {
        wuj b = m42271b();
        if (b == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuc", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: onPinStatusChanged.getServiceBindHelper return null");
            return;
        }
        srn srn = wtw.f51331a;
        uri.toString();
        if (z) {
            boolean a = b.mo29416a(uri.getLastPathSegment());
            wuh wuh = new wuh(b, "AutoUnpinRunnable", uri);
            synchronized (b) {
                b.f51366b.put(uri.getLastPathSegment(), wuh);
                b.f51365a.mo72983a(wuh, cfog.f184854a.mo6606a().mo81986aU());
            }
            if (!a) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                bnsl2.mo68432a("wuj", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("ServiceBindHelper.onSlicePinned, pin slice, uri = %s", uri.toString());
                b.mo29413a();
                return;
            }
            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
            bnsl3.mo68432a("wuj", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("ServiceBindHelper.onSlicePinned, slice already pinned, uri = %s", uri.toString());
            return;
        }
        b.mo29419b(uri);
    }

    /* renamed from: a */
    private static boolean m42268a(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuc", "a", 929, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairSlice: BluetoothAdapter not found.");
            return false;
        }
        BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
        if (remoteDevice != null) {
            return remoteDevice.isConnected();
        }
        bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
        bnsl2.mo68432a("wuc", "a", 935, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("FastPairSlice: BluetoothAdapter remote device %s not found.", str);
        return false;
    }

    /* renamed from: a */
    public final PendingIntent mo29407a(int i, bvin bvin, String str, bzau bzau, String str2, byte[] bArr, PendingIntent pendingIntent) {
        return PendingIntent.getService(getContext(), i, butb.m120415a(getContext(), bvin, str, bzau, str2, bArr, pendingIntent), 134217728);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wuc.a(android.net.Uri, boolean):void
     arg types: [android.net.Uri, int]
     candidates:
      wuc.a(android.content.Context, int):android.graphics.Bitmap
      wuc.a(android.content.Context, android.net.Uri):androidx.slice.Slice
      wuc.a(android.content.Context, java.lang.String):void
      wuc.a(android.net.Uri, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r1 = r0;
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0755, code lost:
        if (p000.sre.m36086f(r8) != false) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x077e, code lost:
        if (r15.mo29411a(r30.f51350d, m42259a("settings_slice", r7, r2), new p000.wua(r30, new java.util.concurrent.atomic.AtomicInteger(com.felicanetworks.mfc.mfi.MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), r16, r29, r7, r24)) == false) goto L_0x0780;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        android.os.StrictMode.setThreadPolicy(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x002b, B:28:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0388 A[SYNTHETIC, Splitter:B:181:0x0388] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03d7 A[Catch:{ RemoteException -> 0x0889, all -> 0x0907 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03f3 A[Catch:{ RemoteException -> 0x0889, all -> 0x0907 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040d A[Catch:{ RemoteException -> 0x0889, all -> 0x0907 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x073d A[Catch:{ RemoteException -> 0x0889, all -> 0x0907 }] */
    /* renamed from: a */
    public final Slice mo9323a(Uri uri) {
        StrictMode.ThreadPolicy threadPolicy;
        bzau bzau;
        Uri uri2;
        Slice slice;
        String str;
        bzau bzau2;
        String str2;
        String str3;
        wug wug;
        Context context;
        String str4;
        boolean z;
        String str5;
        String str6;
        Context context2;
        String str7;
        int i;
        bxvd bxvd;
        IconCompat iconCompat;
        Context context3;
        bzau bzau3;
        Uri uri3 = uri;
        srn srn = wtw.f51331a;
        StrictMode.ThreadPolicy threadPolicy2 = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
            if (!cfoj.m141576z()) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
                bnsl.mo68432a("wuc", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPairSlice: Slices disabled.");
                StrictMode.setThreadPolicy(threadPolicy2);
                return null;
            }
            if (this.f51351e == null) {
                this.f51351e = rfz.m33557a(getContext());
            }
            Context context4 = getContext();
            rfz rfz = this.f51351e;
            rfz.getClass();
            wtx wtx = new wtx(rfz);
            if (Binder.getCallingUid() != 1000) {
                String[] packagesForUid = context4.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid != null) {
                    int length = packagesForUid.length;
                    if (length > 0) {
                        StrictMode.ThreadPolicy threadPolicy3 = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy3).permitCustomSlowCalls().build());
                        int i2 = 0;
                        while (i2 < length) {
                            String str8 = packagesForUid[i2];
                            if (!context4.getPackageName().equals(str8)) {
                                if (cfog.m141291s().equals(str8)) {
                                    if (wtx.mo6527a(str8)) {
                                        bzau3 = bzau.GOOGLE_APPS;
                                    }
                                }
                                i2++;
                            } else {
                                bzau3 = bzau.GMS_SETTINGS;
                            }
                            StrictMode.setThreadPolicy(threadPolicy3);
                            bzau = bzau3;
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy3);
                        bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                        bnsl2.mo68432a("buqy", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("CommonUtils: uid:%d is not whitelisted and google signed", Binder.getCallingUid());
                        bzau = bzau.ENTRY_POINT_UNKNOWN;
                    }
                }
                bnsl bnsl3 = (bnsl) busr.f154819a.mo68388c();
                bnsl3.mo68432a("buqy", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("CommonUtils: can't find package for uid:%d", Binder.getCallingUid());
                bzau = bzau.ENTRY_POINT_UNKNOWN;
            } else {
                bzau = bzau.BLUETOOTH_SETTINGS;
            }
            if (bzau.equals(bzau.ENTRY_POINT_UNKNOWN)) {
                bnsl bnsl4 = (bnsl) wtw.f51331a.mo68388c();
                bnsl4.mo68432a("wuc", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("FastPairSlice: not allow access from uid:%d", Binder.getCallingUid());
            } else {
                m42267a(uri3, true);
                String lastPathSegment = uri.getLastPathSegment();
                char c = 65535;
                switch (lastPathSegment.hashCode()) {
                    case -84929608:
                        if (lastPathSegment.equals("ota_contextual_cards")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 102977465:
                        if (lastPathSegment.equals("links")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 818461222:
                        if (lastPathSegment.equals("method_bind_service_for_discovery_item")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1128144081:
                        if (lastPathSegment.equals("pair_header_suggestion")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1561212112:
                        if (lastPathSegment.equals("device_status_list_item")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    Context context5 = getContext();
                    String queryParameter = uri3.getQueryParameter("address");
                    String queryParameter2 = uri3.getQueryParameter("account_key");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        wuj b = m42271b();
                        if (b == null) {
                            bnsl bnsl5 = (bnsl) wtw.f51331a.mo68388c();
                            bnsl5.mo68432a("wuc", "a", 476, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper.");
                            uri2 = uri3;
                            threadPolicy = threadPolicy2;
                            slice = null;
                        } else {
                            try {
                                DeviceDetailsLinks b2 = b.mo29418b(queryParameter);
                                if (b2 == null) {
                                    bnsl bnsl6 = (bnsl) wtw.f51331a.mo68390d();
                                    bnsl6.mo68432a("wuc", "a", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl6.mo68405a("FastPairSlice: No data found for deviceDetailsLinks.");
                                    uri2 = uri3;
                                    threadPolicy = threadPolicy2;
                                    slice = null;
                                } else {
                                    wug b3 = m42270b(context5, uri3);
                                    if (this.f51350d == null) {
                                        this.f51350d = apr.m1818a(getContext());
                                    }
                                    String f = b2.mo86676f();
                                    String g = b2.mo86677g();
                                    String a = wul.m42303a(b2.mo86673c());
                                    if (TextUtils.isEmpty(f)) {
                                        f = cfog.m141290r();
                                    } else if (!cfog.m141290r().equals(f)) {
                                        if (!cfoj.m141548ac()) {
                                            f = null;
                                        }
                                    }
                                    if (!cfog.m141290r().equals(f)) {
                                        if (cfoj.m141548ac()) {
                                            if (g == null) {
                                                str = null;
                                            } else {
                                                if (a != null) {
                                                    try {
                                                        if (context5.getPackageManager().getPackageInfo(a, 64).signatures.length != 1) {
                                                            bnsl bnsl7 = (bnsl) wtw.f51331a.mo68390d();
                                                            bnsl7.mo68432a("wuc", "a", 524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl7.mo68405a("Does not show slice since companion app has more than one signature");
                                                        } else if (!g.toUpperCase(Locale.ENGLISH).equals(spn.m35867b(context5, a, "SHA-256")) && !context5.getSharedPreferences("discovery_shared_pref", 4).getBoolean("nearby_debug_mode", cfod.m141143c())) {
                                                            bnsl bnsl8 = (bnsl) wtw.f51331a.mo68390d();
                                                            bnsl8.mo68432a("wuc", "a", 533, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl8.mo68405a("Does not show slice signature, hash does not match what is registered in the console");
                                                            str = null;
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e) {
                                                        PackageManager.NameNotFoundException nameNotFoundException = e;
                                                        bnsl bnsl9 = (bnsl) wtw.f51331a.mo68388c();
                                                        bnsl9.mo68437a(nameNotFoundException);
                                                        bnsl9.mo68432a("wuc", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl9.mo68420a("Fail to verify the app's signature package name: %s", a);
                                                    }
                                                }
                                                str = null;
                                            }
                                            if (str == null) {
                                                AtomicInteger atomicInteger = new AtomicInteger(100);
                                                apr apr = this.f51350d;
                                                Uri a2 = m42259a("oobe_slice", queryParameter, str);
                                                threadPolicy = threadPolicy2;
                                                str2 = str;
                                                wug = b3;
                                                str7 = queryParameter;
                                                context2 = context5;
                                                bzau2 = bzau;
                                                i = 2;
                                                str3 = a;
                                                if (wug.mo29411a(apr, a2, new wtz(this, atomicInteger, a, bzau, str7, b2))) {
                                                    if (!cfoj.f184966a.mo6606a().mo82156bm()) {
                                                        str4 = str7;
                                                        context = context2;
                                                        m42266a(context, wug, b2.mo86671a(), str4, bzau2);
                                                        if (!cfog.f184854a.mo6606a().mo82009ar().equals(uri.getQueryParameter("caller"))) {
                                                            if (!TextUtils.isEmpty(str2)) {
                                                                String str9 = str2;
                                                                if (!str9.equals(cfog.m141290r())) {
                                                                }
                                                            }
                                                            if (!cfoj.f184966a.mo6606a().mo82192y()) {
                                                                bnsl bnsl10 = (bnsl) wtw.f51331a.mo68390d();
                                                                bnsl10.mo68432a("wuc", "a", 680, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bnsl10.mo68405a("FastPairSlice: Companion app slice disabled.");
                                                            } else {
                                                                String c2 = b2.mo86673c();
                                                                if (c2 != null) {
                                                                    if (!c2.isEmpty()) {
                                                                        String b4 = busp.m120393b(c2);
                                                                        if (b4 != null) {
                                                                            if (!b4.isEmpty()) {
                                                                                String b5 = buqy.m120266b(getContext(), b4);
                                                                                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(b4);
                                                                                PendingIntent a3 = m42257a(context, b4, bzau2, b2.mo86674d(), b2.mo86671a(), b5, launchIntentForPackage);
                                                                                if (launchIntentForPackage == null || TextUtils.isEmpty(b5)) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                boolean e2 = b2.mo86675e();
                                                                                if (!z) {
                                                                                    if (!e2) {
                                                                                        str6 = context.getString(C0126R.string.fast_pair_slice_install_companion_without_firmware_title);
                                                                                    } else {
                                                                                        str6 = context.getString(C0126R.string.common_firmware_update);
                                                                                    }
                                                                                    str5 = context.getString(C0126R.string.fast_pair_slice_install_companion_without_firmware_description);
                                                                                } else if (!e2) {
                                                                                    str6 = context.getString(C0126R.string.fast_pair_slice_open_companion_without_firmware_title, b5);
                                                                                    str5 = context.getString(C0126R.string.fast_pair_slice_open_companion_without_firmware_description);
                                                                                } else {
                                                                                    str6 = context.getString(C0126R.string.common_firmware_update);
                                                                                    str5 = context.getString(C0126R.string.fast_pair_slice_open_companion_with_firmware_description, b5);
                                                                                }
                                                                                wub wub = new wub(str6, str5);
                                                                                IconCompat a4 = IconCompat.m1176a(m42258a(context, (int) C0126R.C0127drawable.quantum_ic_open_in_new_vd_theme_24));
                                                                                a4.mo1109a(-16777216);
                                                                                wug.mo29410a(a3, a4, wub.f51346a, wub.f51347b, true);
                                                                            }
                                                                        }
                                                                        bnsl bnsl11 = (bnsl) wtw.f51331a.mo68390d();
                                                                        bnsl11.mo68432a("wuc", "a", 693, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl11.mo68405a("FastPairSlice: No companion app for device.");
                                                                    }
                                                                }
                                                                bnsl bnsl12 = (bnsl) wtw.f51331a.mo68390d();
                                                                bnsl12.mo68432a("wuc", "a", 686, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bnsl12.mo68405a("FastPairSlice: No actionUrl for this device.");
                                                            }
                                                        }
                                                        slice = wug.mo29408a();
                                                        uri2 = uri;
                                                    }
                                                }
                                            } else {
                                                str7 = queryParameter;
                                                context2 = context5;
                                                str3 = a;
                                                threadPolicy = threadPolicy2;
                                                bzau2 = bzau;
                                                str2 = str;
                                                i = 2;
                                                wug = b3;
                                            }
                                            if (cfoj.f184966a.mo6606a().mo82177j()) {
                                                bnsl bnsl13 = (bnsl) wtw.f51331a.mo68390d();
                                                bnsl13.mo68432a("wuc", "a", 836, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl13.mo68405a("FastPairSlice: Assistant slice disabled.");
                                                str4 = str7;
                                                context = context2;
                                            } else if (!b2.mo86672b()) {
                                                bnsl bnsl14 = (bnsl) wtw.f51331a.mo68390d();
                                                bnsl14.mo68432a("wuc", "a", 841, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl14.mo68405a("FastPairSlice: This item doesn't support assistant.");
                                                str4 = str7;
                                                context = context2;
                                            } else {
                                                if (!cfoj.f184966a.mo6606a().mo82155bl()) {
                                                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                                                    if (defaultAdapter == null) {
                                                        bnsl bnsl15 = (bnsl) wtw.f51331a.mo68390d();
                                                        bnsl15.mo68432a("wuc", "a", 929, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl15.mo68405a("FastPairSlice: BluetoothAdapter not found.");
                                                        str4 = str7;
                                                    } else {
                                                        str4 = str7;
                                                        BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str4);
                                                        if (remoteDevice == null) {
                                                            bnsl bnsl16 = (bnsl) wtw.f51331a.mo68390d();
                                                            bnsl16.mo68432a("wuc", "a", 935, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl16.mo68420a("FastPairSlice: BluetoothAdapter remote device %s not found.", str4);
                                                        } else if (remoteDevice.isConnected()) {
                                                        }
                                                    }
                                                    bnsl bnsl17 = (bnsl) wtw.f51331a.mo68390d();
                                                    bnsl17.mo68432a("wuc", "a", 847, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl17.mo68405a("FastPairSlice: Assistant settings not shown because not connected.");
                                                    context = context2;
                                                } else {
                                                    str4 = str7;
                                                }
                                                if (!buqy.m120265a(getContext(), cfog.m141275c())) {
                                                    bnsl bnsl18 = (bnsl) wtw.f51331a.mo68390d();
                                                    bnsl18.mo68432a("wuc", "a", 858, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl18.mo68405a("FastPairSlice: No assistant app is installed.");
                                                    context = context2;
                                                } else {
                                                    bxvj bxvj = dcq.f12872d;
                                                    if (str4 != null) {
                                                        bxvd = dcq.f12871c.mo74144da();
                                                        if (bxvd.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd.f164950c = false;
                                                        }
                                                        dcq dcq = (dcq) bxvd.f164949b;
                                                        str4.getClass();
                                                        dcq.f12874a |= 1;
                                                        dcq.f12875b = str4;
                                                    } else {
                                                        bxvd = dcq.f12871c.mo74144da();
                                                    }
                                                    dcq dcq2 = (dcq) bxvd.mo74062i();
                                                    bxvd da = ayue.f98506f.mo74144da();
                                                    bxvd da2 = ayua.f98489c.mo74144da();
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    ayua ayua = (ayua) da2.f164949b;
                                                    "https://www.google.com".getClass();
                                                    ayua.f98491a |= 1;
                                                    ayua.f98492b = "https://www.google.com";
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    ayue ayue = (ayue) da.f164949b;
                                                    ayua ayua2 = (ayua) da2.mo74062i();
                                                    ayua2.getClass();
                                                    ayue.f98512e = ayua2;
                                                    ayue.f98508a |= 8;
                                                    bxvd da3 = ayud.f98502a.mo74144da();
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    ayud.m84825a((ayud) da3.f164949b);
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    ayue ayue2 = (ayue) da.f164949b;
                                                    ayud ayud = (ayud) da3.mo74062i();
                                                    ayud.getClass();
                                                    ayue2.f98509b = ayud;
                                                    ayue2.f98508a |= 1;
                                                    bxvd da4 = ayuc.f98498a.mo74144da();
                                                    if (da4.f164950c) {
                                                        da4.mo74035c();
                                                        da4.f164950c = false;
                                                    }
                                                    ayuc.m84823a((ayuc) da4.f164949b);
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    ayue ayue3 = (ayue) da.f164949b;
                                                    ayuc ayuc = (ayuc) da4.mo74062i();
                                                    ayuc.getClass();
                                                    ayue3.f98510c = ayuc;
                                                    ayue3.f98508a |= i;
                                                    bxvd da5 = ayub.f98493c.mo74144da();
                                                    bxvd da6 = ayuf.f98514d.mo74144da();
                                                    if (da6.f164950c) {
                                                        da6.mo74035c();
                                                        da6.f164950c = false;
                                                    }
                                                    ayuf ayuf = (ayuf) da6.f164949b;
                                                    ayuf.f98517b = 9;
                                                    ayuf.f98516a |= 1;
                                                    bxvf bxvf = (bxvf) dcp.f12868a.mo74144da();
                                                    bxvj bxvj2 = dcr.f12876a;
                                                    bxvf bxvf2 = (bxvf) dcs.f12877a.mo74144da();
                                                    bxvf2.mo74125a(bxvj, dcq2);
                                                    bxvf.mo74125a(bxvj2, (dcs) bxvf2.mo74062i());
                                                    if (da6.f164950c) {
                                                        da6.mo74035c();
                                                        da6.f164950c = false;
                                                    }
                                                    ayuf ayuf2 = (ayuf) da6.f164949b;
                                                    dcp dcp = (dcp) bxvf.mo74062i();
                                                    dcp.getClass();
                                                    ayuf2.f98518c = dcp;
                                                    ayuf2.f98516a |= 2;
                                                    if (da5.f164950c) {
                                                        da5.mo74035c();
                                                        da5.f164950c = false;
                                                    }
                                                    ayub ayub = (ayub) da5.f164949b;
                                                    ayuf ayuf3 = (ayuf) da6.mo74062i();
                                                    ayuf3.getClass();
                                                    ayub.f98496b = ayuf3;
                                                    ayub.f98495a = 2;
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    ayue ayue4 = (ayue) da.f164949b;
                                                    ayub ayub2 = (ayub) da5.mo74062i();
                                                    ayub2.getClass();
                                                    ayue4.f98511d = ayub2;
                                                    ayue4.f98508a |= 4;
                                                    bxvd da7 = ayuh.f98521c.mo74144da();
                                                    ByteString a5 = ByteString.m123261a(((ayue) da.mo74062i()).serializeToBytes());
                                                    if (da7.f164950c) {
                                                        da7.mo74035c();
                                                        da7.f164950c = false;
                                                    }
                                                    ayuh ayuh = (ayuh) da7.f164949b;
                                                    a5.getClass();
                                                    ayuh.f98523a |= 2;
                                                    ayuh.f98524b = a5;
                                                    Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("googleapp").authority("deeplink").path("/").appendQueryParameter("data", boan.f132471e.mo68783a().mo68794a(((ayuh) da7.mo74062i()).serializeToBytes())).build());
                                                    if (intent.resolveActivity(context2.getPackageManager()) == null) {
                                                        bnsl bnsl19 = (bnsl) wtw.f51331a.mo68390d();
                                                        bnsl19.mo68432a("wuc", "a", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl19.mo68405a("FastPairSlice: No resolveActivity for assistant deep link.");
                                                        context = context2;
                                                    } else {
                                                        context = context2;
                                                        String string = context.getString(C0126R.string.fast_pair_assistant_slice_title_new);
                                                        PendingIntent service = PendingIntent.getService(context, 1, butb.m120415a(context, bvin.FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED, cfog.m141275c(), bzau2, str4, b2.mo86671a(), intent), 134217728);
                                                        IconCompat a6 = IconCompat.m1176a(m42258a(context, (int) C0126R.C0127drawable.quantum_ic_google_assistant_vd_theme_24));
                                                        a6.mo1109a(-16777216);
                                                        wug.mo29410a(service, a6, string, context.getString(C0126R.string.fast_pair_assistant_slice_summary), true);
                                                    }
                                                }
                                            }
                                            m42266a(context, wug, b2.mo86671a(), str4, bzau2);
                                            if (!cfog.f184854a.mo6606a().mo82009ar().equals(uri.getQueryParameter("caller"))) {
                                            }
                                            slice = wug.mo29408a();
                                            uri2 = uri;
                                        }
                                    }
                                    str = f;
                                    if (str == null) {
                                    }
                                    if (cfoj.f184966a.mo6606a().mo82177j()) {
                                    }
                                    m42266a(context, wug, b2.mo86671a(), str4, bzau2);
                                    if (!cfog.f184854a.mo6606a().mo82009ar().equals(uri.getQueryParameter("caller"))) {
                                    }
                                    slice = wug.mo29408a();
                                    uri2 = uri;
                                }
                            } catch (RemoteException e3) {
                                threadPolicy = threadPolicy2;
                                bnsl bnsl20 = (bnsl) wtw.f51331a.mo68388c();
                                bnsl20.mo68432a("wuc", "a", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl20.mo68405a("FastPairSlice: RemoteException when getting DeviceDetailsLinks.");
                                uri2 = uri;
                                slice = null;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                StrictMode.setThreadPolicy(threadPolicy);
                                throw th2;
                            }
                        }
                    } else {
                        Context context6 = context5;
                        threadPolicy = threadPolicy2;
                        bzau bzau4 = bzau;
                        if (queryParameter2 != null) {
                            byte[] b6 = boan.f132472f.mo68796b(queryParameter2);
                            uri2 = uri;
                            wug b7 = m42270b(context6, uri2);
                            m42266a(context6, b7, b6, (String) null, bzau4);
                            slice = b7.mo29408a();
                        } else {
                            uri2 = uri;
                            bnsl bnsl21 = (bnsl) wtw.f51331a.mo68390d();
                            bnsl21.mo68432a("wuc", "b", 465, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl21.mo68405a("FastPairSlice: Queried device details links but did not include address.");
                            slice = null;
                        }
                    }
                    if (slice == null) {
                        slice = wug.m42283a(getContext(), uri2).mo29408a();
                    }
                    wtv.m42254a(getContext(), bvin.FAST_PAIR_CONNECTED_DEVICE_SLICE_QUERIED);
                } else if (c == 1 || c == 2) {
                    Context context7 = getContext();
                    if (this.f51348b.isEmpty()) {
                        bnsl bnsl22 = (bnsl) wtw.f51331a.mo68390d();
                        bnsl22.mo68432a("wuc", "a", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl22.mo68405a("FastPairSlice: Nothing found from discoveryListItem");
                        slice = null;
                        uri2 = uri3;
                        threadPolicy = threadPolicy2;
                    } else {
                        DiscoveryListItem discoveryListItem = null;
                        for (DiscoveryListItem discoveryListItem2 : this.f51348b) {
                            if (discoveryListItem2 == null) {
                                context3 = context7;
                            } else if (bzbk.NEARBY_DEVICE.equals(discoveryListItem2.f191746l)) {
                                if (discoveryListItem != null) {
                                    if (!discoveryListItem2.mo86668a()) {
                                        context3 = context7;
                                    } else if (discoveryListItem.mo86668a()) {
                                        context3 = context7;
                                        if (discoveryListItem2.f191748n < discoveryListItem.f191748n) {
                                            discoveryListItem = discoveryListItem2;
                                        }
                                    }
                                }
                                context3 = context7;
                                discoveryListItem = discoveryListItem2;
                            } else {
                                context3 = context7;
                            }
                            context7 = context3;
                        }
                        Context context8 = context7;
                        if (discoveryListItem == null) {
                            bnsl bnsl23 = (bnsl) wtw.f51331a.mo68390d();
                            bnsl23.mo68432a("wuc", "a", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl23.mo68405a("FastPairSlice: Nothing found from discoveryListItem");
                            uri2 = uri3;
                            threadPolicy = threadPolicy2;
                            slice = null;
                        } else {
                            Context context9 = context8;
                            wug a7 = wug.m42283a(context9, uri3);
                            Bitmap bitmap = discoveryListItem.f191744j;
                            if (bitmap == null) {
                                int i3 = Build.VERSION.SDK_INT;
                                iconCompat = IconCompat.m1178b(context9);
                            } else {
                                iconCompat = IconCompat.m1176a(bitmap);
                            }
                            a7.mo29410a(PendingIntent.getService(context9, 0, discoveryListItem.f191743i, 134217728), iconCompat, discoveryListItem.f191736b, context9.getString(C0126R.string.common_tap_to_pair), false);
                            slice = a7.mo29408a();
                            uri2 = uri3;
                            threadPolicy = threadPolicy2;
                        }
                    }
                } else if (c == 3) {
                    boolean booleanValue = Boolean.valueOf(uri3.getQueryParameter("is_bind")).booleanValue();
                    wuj b8 = m42271b();
                    if (b8 != null) {
                        b8.mo29415a(booleanValue);
                    }
                } else if (c == 4) {
                    slice = m42261a(getContext(), uri3, bzau);
                    uri2 = uri3;
                    threadPolicy = threadPolicy2;
                }
                bnsl bnsl24 = (bnsl) wtw.f51331a.mo68390d();
                bnsl24.mo68432a("wuc", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl24.mo68424a("FastPairSlice: Build slice uri %s completed with slice %s", uri2, slice);
                StrictMode.setThreadPolicy(threadPolicy);
                return slice;
            }
            StrictMode.setThreadPolicy(threadPolicy2);
            return null;
        } catch (Throwable th3) {
            th = th3;
            threadPolicy = threadPolicy2;
            Throwable th22 = th;
            StrictMode.setThreadPolicy(threadPolicy);
            throw th22;
        }
    }
}
