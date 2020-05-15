package com.google.android.gms.smartdevice.fastpair;

import android.app.NotificationChannel;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastPairNotificationIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f108064a = ascp.m73787a("FastPair", "FastPairIntentOperation");

    /* renamed from: b */
    public static final Set f108065b = new HashSet();

    /* renamed from: c */
    public final aucf f108066c = new aucf();

    /* renamed from: d */
    private long f108067d;

    /* renamed from: e */
    private aqxl f108068e;

    /* renamed from: f */
    private arrw f108069f;

    /* renamed from: g */
    private BluetoothGatt f108070g;

    /* renamed from: h */
    private final BluetoothGattCallback f108071h = new arrx(this);

    /* renamed from: i */
    private final bxvd f108072i = bowb.f135084g.mo74144da();

    /* renamed from: a */
    static void m92771a(qws qws, bowb bowb) {
        f108064a.mo25409a(bowb.toString(), new Object[0]);
        if (cgqa.m146531b()) {
            bxvd da = bovc.f134986j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovc bovc = (bovc) da.f164949b;
            bowb.getClass();
            bovc.f134996i = bowb;
            bovc.f134988a |= 128;
            qws.mo24333a((bovc) da.mo74062i()).mo24327b();
            return;
        }
        qws.mo24335a(bowb.mo73642k()).mo24327b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
        if (r7 == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r9.mo32262a(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0203, code lost:
        if (r7 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
        if (r7 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r7.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0254, code lost:
        if (r7 != null) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0279 A[Catch:{ InterruptedException | ExecutionException -> 0x0430, TimeoutException -> 0x03fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0298 A[Catch:{ InterruptedException | ExecutionException -> 0x0430, TimeoutException -> 0x03fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a3 A[Catch:{ InterruptedException | ExecutionException -> 0x0430, TimeoutException -> 0x03fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0222 A[Catch:{ InterruptedException | ExecutionException -> 0x0430, TimeoutException -> 0x03fd }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0210=Splitter:B:75:0x0210, B:110:0x0271=Splitter:B:110:0x0271, B:78:0x0217=Splitter:B:78:0x0217, B:107:0x026a=Splitter:B:107:0x026a} */
    public final void onHandleIntent(Intent intent) {
        byte[] bArr;
        BluetoothGatt bluetoothGatt;
        sex a;
        int i;
        HttpURLConnection httpURLConnection;
        IOException e;
        HttpURLConnection httpURLConnection2;
        IOException e2;
        int i2 = Build.VERSION.SDK_INT;
        if (cgqa.m146533d()) {
            this.f108067d = System.currentTimeMillis();
            if (intent == null || intent.getExtras() == null) {
                f108064a.mo25420f("Intent is null or doesn't have extras.", new Object[0]);
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getExtras().get("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                return;
            }
            if (!f108065b.contains(bluetoothDevice.getAddress())) {
                Bitmap bitmap = null;
                bitmap = null;
                HttpURLConnection httpURLConnection3 = null;
                bitmap = null;
                bitmap = null;
                Bitmap decodeStream = null;
                HttpURLConnection httpURLConnection4 = null;
                bitmap = null;
                bitmap = null;
                qws qws = new qws(this, "SMART_SETUP", null);
                f108065b.add(bluetoothDevice.getAddress());
                this.f108068e = arai.m72320a(this);
                bxvd bxvd = this.f108072i;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bowb bowb = (bowb) bxvd.f164949b;
                bowb bowb2 = bowb.f135084g;
                bowb.f135087b = 1;
                bowb.f135086a |= 1;
                if (cgqa.f187489a.mo6606a().mo84265e()) {
                    bArr = aryq.m73691b(intent);
                } else {
                    bArr = null;
                }
                this.f108069f = new arrw(this, this.f108072i, this.f108067d, bArr);
                sek sek = f108064a;
                String valueOf = String.valueOf(bluetoothDevice.getAddress());
                sek.mo25412b(valueOf.length() == 0 ? new String("onHandleIntent(). BluetoothDevice address: ") : "onHandleIntent(). BluetoothDevice address: ".concat(valueOf), new Object[0]);
                String str = "";
                try {
                    if (cgqa.m146532c()) {
                        this.f108070g = bluetoothDevice.connectGatt(this, false, this.f108071h);
                        str = (String) aucu.m76783a(this.f108066c.f91388a, cgqa.f187489a.mo6606a().mo84269i(), TimeUnit.MILLISECONDS);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.f108067d;
                    ((beoj) this.f108068e.f87040g.mo6606a()).mo60852a((double) currentTimeMillis, Integer.valueOf(Build.VERSION.SDK_INT));
                    bxvd bxvd2 = this.f108072i;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bowb bowb3 = (bowb) bxvd2.f164949b;
                    bowb3.f135086a |= 8;
                    bowb3.f135090e = currentTimeMillis;
                    bxvd bxvd3 = this.f108072i;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bowb bowb4 = (bowb) bxvd3.f164949b;
                    str.getClass();
                    bowb4.f135086a |= 2;
                    bowb4.f135088c = str;
                    sek sek2 = f108064a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
                    sb.append("Device name: ");
                    sb.append(str);
                    sb.append(", Time: ");
                    sb.append(currentTimeMillis);
                    sek2.mo25412b(sb.toString(), new Object[0]);
                    if (cgqa.m146531b() && cgqa.m146532c() && TextUtils.isEmpty(str)) {
                        m92771a(qws, (bowb) this.f108072i.mo74062i());
                    }
                    if (TextUtils.isEmpty(str)) {
                        cgqa.f187489a.mo6606a().mo84271k();
                    }
                    if (cgqa.m146533d() && !TextUtils.isEmpty(str)) {
                        arrw arrw = this.f108069f;
                        arrw.f88199b.mo25412b("send request.", new Object[0]);
                        if (arrw.f88200c.containsKey(str)) {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) arrw.f88201a.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                                if (activeNetworkInfo.isConnected()) {
                                    Context context = arrw.f88201a;
                                    if (arrw.f88200c.containsKey(str)) {
                                        String str2 = (String) arrw.f88200c.get(str);
                                        if (!cgqa.f187489a.mo6606a().mo84262b()) {
                                            try {
                                                httpURLConnection2 = (HttpURLConnection) new URL(str2).openConnection();
                                                try {
                                                    int responseCode = httpURLConnection2.getResponseCode();
                                                    if (responseCode != 200) {
                                                        sek sek3 = arrw.f88199b;
                                                        StringBuilder sb2 = new StringBuilder(29);
                                                        sb2.append("Bad response code ");
                                                        sb2.append(responseCode);
                                                        sek3.mo25416d(sb2.toString(), new Object[0]);
                                                    } else {
                                                        bitmap = BitmapFactory.decodeStream(httpURLConnection2.getInputStream());
                                                    }
                                                } catch (IOException e3) {
                                                    e2 = e3;
                                                    try {
                                                        arrw.f88199b.mo25410a((Throwable) e2);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        httpURLConnection3 = httpURLConnection2;
                                                        if (httpURLConnection3 != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    httpURLConnection3 = httpURLConnection2;
                                                    if (httpURLConnection3 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e4) {
                                                e2 = e4;
                                                httpURLConnection2 = null;
                                                arrw.f88199b.mo25410a((Throwable) e2);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (httpURLConnection3 != null) {
                                                    httpURLConnection3.disconnect();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            aboy aboy = new aboy(context);
                                            try {
                                                httpURLConnection = aboy.mo32271a(new URL(str2));
                                                try {
                                                    i = httpURLConnection.getResponseCode();
                                                    if (i == 200) {
                                                        try {
                                                            decodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                                                        } catch (IOException e5) {
                                                            e = e5;
                                                            try {
                                                                arrw.f88199b.mo25410a((Throwable) e);
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                httpURLConnection4 = httpURLConnection;
                                                                if (httpURLConnection4 != null) {
                                                                    aboy.mo32262a(httpURLConnection4, i);
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            httpURLConnection4 = httpURLConnection;
                                                            if (httpURLConnection4 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        arrw.f88199b.mo25416d("Bad response (%d) from %s", Integer.valueOf(i), str2);
                                                    }
                                                } catch (IOException e6) {
                                                    e = e6;
                                                    i = 0;
                                                    arrw.f88199b.mo25410a((Throwable) e);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    httpURLConnection4 = httpURLConnection;
                                                    i = 0;
                                                    if (httpURLConnection4 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e7) {
                                                e = e7;
                                                httpURLConnection = null;
                                                i = 0;
                                                arrw.f88199b.mo25410a((Throwable) e);
                                            } catch (Throwable th7) {
                                                th = th7;
                                                i = 0;
                                                if (httpURLConnection4 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    arrw.f88199b.mo25412b("show notification.", new Object[0]);
                                    a = sex.m35104a(arrw.f88201a);
                                    if (a != null) {
                                        arrw.f88199b.mo25416d("NotificationManager is null.", new Object[0]);
                                    } else {
                                        int i3 = Build.VERSION.SDK_INT;
                                        NotificationChannel notificationChannel = new NotificationChannel("smartdevice.channel", arrw.f88201a.getString(C0126R.string.smartdevice_d2d_source_notification_generic_title), 4);
                                        notificationChannel.setDescription("Smart_device_channel_for_fastpair");
                                        a.mo25442a(notificationChannel);
                                        C1102je jeVar = new C1102je(arrw.f88201a, "smartdevice.channel");
                                        jeVar.mo13630b(qkj.m32287a(arrw.f88201a, C0126R.C0127drawable.quantum_ic_google_white_24));
                                        jeVar.mo13640e(arrw.f88201a.getString(C0126R.string.smartdevice_fastpair_title, str));
                                        jeVar.mo13632b(arrw.f88201a.getString(C0126R.string.smartdevice_fastpair_instruction));
                                        jeVar.f22245C = 60000;
                                        int i4 = Build.VERSION.SDK_INT;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("android.substName", arrw.f88201a.getString(C0126R.string.smartdevice_d2d_source_notification_generic_title));
                                        jeVar.mo13623a(bundle);
                                        bxvd da = bovz.f135078d.mo74144da();
                                        if (bitmap != null) {
                                            jeVar.mo13621a(bitmap);
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bovz bovz = (bovz) da.f164949b;
                                            bovz.f135082c = 1;
                                            bovz.f135080a |= 2;
                                        } else {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bovz bovz2 = (bovz) da.f164949b;
                                            bovz2.f135082c = 2;
                                            bovz2.f135080a |= 2;
                                        }
                                        bxvd bxvd4 = arrw.f88205g;
                                        if (bxvd4.f164950c) {
                                            bxvd4.mo74035c();
                                            bxvd4.f164950c = false;
                                        }
                                        bowb bowb5 = (bowb) bxvd4.f164949b;
                                        bovz bovz3 = (bovz) da.mo74062i();
                                        bovz3.getClass();
                                        bowb5.f135089d = bovz3;
                                        bowb5.f135086a |= 4;
                                        bxvd bxvd5 = arrw.f88205g;
                                        if (bxvd5.f164950c) {
                                            bxvd5.mo74035c();
                                            bxvd5.f164950c = false;
                                        }
                                        bowb bowb6 = (bowb) bxvd5.f164949b;
                                        bowb6.f135087b = 3;
                                        bowb6.f135086a |= 1;
                                        long currentTimeMillis2 = System.currentTimeMillis() - arrw.f88203e;
                                        sek sek4 = arrw.f88199b;
                                        StringBuilder sb3 = new StringBuilder(47);
                                        sb3.append("Time to show notification: ");
                                        sb3.append(currentTimeMillis2);
                                        sek4.mo25412b(sb3.toString(), new Object[0]);
                                        bxvd bxvd6 = arrw.f88205g;
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        bowb bowb7 = (bowb) bxvd6.f164949b;
                                        bowb7.f135086a |= 16;
                                        bowb7.f135091f = currentTimeMillis2;
                                        byte[] k = ((bowb) arrw.f88205g.mo74062i()).mo73642k();
                                        int hashCode = str.hashCode();
                                        arrw.f88202d = hashCode;
                                        jeVar.mo13631b(NotificationBehaviorIntentOperation.m92772a(arrw.f88201a, "com.google.android.gms.smartdevice.fastpair.DISMISS", hashCode, k, arrw.f88204f));
                                        jeVar.f22254f = NotificationBehaviorIntentOperation.m92772a(arrw.f88201a, "com.google.android.gms.smartdevice.fastpair.OPEN", arrw.f88202d, k, arrw.f88204f);
                                        jeVar.mo13618a(0, arrw.f88201a.getString(C0126R.string.smartdevice_fastpair_action), NotificationBehaviorIntentOperation.m92772a(arrw.f88201a, "com.google.android.gms.smartdevice.fastpair.OPEN_ACTION", arrw.f88202d, k, arrw.f88204f));
                                        int i5 = Build.VERSION.SDK_INT;
                                        a.mo25441a(arrw.f88202d, jeVar.mo13629b());
                                    }
                                    bluetoothGatt = this.f108070g;
                                    if (bluetoothGatt != null) {
                                        bluetoothGatt.disconnect();
                                        this.f108070g.close();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        arrw.f88199b.mo25416d("Use default device icon. ", new Object[0]);
                        arrw.f88199b.mo25412b("show notification.", new Object[0]);
                        a = sex.m35104a(arrw.f88201a);
                        if (a != null) {
                        }
                        bluetoothGatt = this.f108070g;
                        if (bluetoothGatt != null) {
                        }
                    } else {
                        bluetoothGatt = this.f108070g;
                        if (bluetoothGatt != null) {
                        }
                    }
                } catch (InterruptedException | ExecutionException e8) {
                    f108064a.mo25410a(e8);
                } catch (TimeoutException e9) {
                    f108064a.mo25412b("Time out for getting device name.", new Object[0]);
                    bxvd bxvd7 = this.f108072i;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bowb bowb8 = (bowb) bxvd7.f164949b;
                    bowb8.f135087b = 2;
                    bowb8.f135086a |= 1;
                    if (cgqa.m146531b()) {
                        m92771a(qws, (bowb) this.f108072i.mo74062i());
                    }
                }
            } else {
                f108064a.mo25412b("Already processed the same intent.", new Object[0]);
            }
        }
    }
}
