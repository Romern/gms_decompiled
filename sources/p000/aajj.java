package p000;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.gcm.GcmChimeraService;
import com.google.android.gms.gcm.GcmSenderChimeraProxy;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aajj */
public final /* synthetic */ class aajj implements Runnable {

    /* renamed from: a */
    private final aajt f28281a;

    /* renamed from: b */
    private final Intent f28282b;

    /* renamed from: c */
    private final int f28283c;

    public aajj(aajt aajt, Intent intent, int i) {
        this.f28281a = aajt;
        this.f28282b = intent;
        this.f28283c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0291, code lost:
        if (r3.mo17003a(r4, (p000.blmp) r9.mo74062i()) == false) goto L_0x0293;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03bd  */
    public final void run() {
        int i;
        boolean z;
        NetworkInfo activeNetworkInfo;
        Object obj;
        int i2;
        aajt aajt = this.f28281a;
        Intent intent = this.f28282b;
        int i3 = this.f28283c;
        String stringExtra = intent.getStringExtra("google.ttl");
        String stringExtra2 = intent.getStringExtra("google.message_id");
        String stringExtra3 = intent.getStringExtra("collapse_key");
        boolean z2 = false;
        try {
            String a = aara.m21846a(intent);
            if (a == null) {
                Log.w("GCM", "Failed to send message - missing package name");
            } else {
                blmo blmo = (blmo) blmp.f126864r.mo74144da();
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp = (blmp) blmo.f164949b;
                a.getClass();
                blmp.f126866a |= 16;
                blmp.f126870e = a;
                String stringExtra4 = intent.getStringExtra("google.from");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("from");
                } else {
                    intent.removeExtra("google.from");
                }
                String a2 = stm.m36299a(stringExtra4);
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp2 = (blmp) blmo.f164949b;
                a2.getClass();
                blmp2.f126866a |= 4;
                blmp2.f126868c = a2;
                int i4 = (int) cecz.f182285a.mo6606a().mo78841i();
                if (stringExtra != null) {
                    try {
                        i2 = Integer.parseInt(stringExtra);
                    } catch (NumberFormatException e) {
                        i2 = 0;
                    }
                    if (i2 >= 0 && i2 <= i4) {
                        i4 = i2;
                    }
                }
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp3 = (blmp) blmo.f164949b;
                blmp3.f126866a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                blmp3.f126877l = i4;
                long currentTimeMillis = System.currentTimeMillis();
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp4 = (blmp) blmo.f164949b;
                int i5 = blmp4.f126866a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                blmp4.f126866a = i5;
                blmp4.f126878m = currentTimeMillis;
                if (stringExtra2 != null) {
                    stringExtra2.getClass();
                    i5 |= 2;
                    blmp4.f126866a = i5;
                    blmp4.f126867b = stringExtra2;
                }
                if (stringExtra3 != null) {
                    stringExtra3.getClass();
                    blmp4.f126866a = i5 | 32;
                    blmp4.f126871f = stringExtra3;
                    intent.removeExtra("collapse_key");
                }
                if (i3 != 0) {
                    long j = (long) i3;
                    if (blmo.f164950c) {
                        blmo.mo74035c();
                        blmo.f164950c = false;
                    }
                    blmp blmp5 = (blmp) blmo.f164949b;
                    blmp5.f126866a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    blmp5.f126876k = j;
                }
                String stringExtra5 = intent.getStringExtra("google.to");
                if (stringExtra5 != null) {
                    intent.removeExtra("google.to");
                    if (blmo.f164950c) {
                        blmo.mo74035c();
                        blmo.f164950c = false;
                    }
                    blmp blmp6 = (blmp) blmo.f164949b;
                    stringExtra5.getClass();
                    blmp6.f126866a |= 8;
                    blmp6.f126869d = stringExtra5;
                    int i6 = 1;
                    if (!stringExtra5.startsWith("https://gcm.googleapis.com/local/")) {
                        String stringExtra6 = intent.getStringExtra("registration_id");
                        intent.removeExtra("registration_id");
                        if (stringExtra6 != null) {
                            if (blmo.f164950c) {
                                blmo.mo74035c();
                                blmo.f164950c = false;
                            }
                            blmp blmp7 = (blmp) blmo.f164949b;
                            stringExtra6.getClass();
                            blmp7.f126866a |= 2048;
                            blmp7.f126875j = stringExtra6;
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            i = 0;
                            for (String str : extras.keySet()) {
                                if (!str.startsWith("google.") && (obj = extras.get(str)) != null) {
                                    if (obj instanceof String) {
                                        String str2 = (String) obj;
                                        aajt.m21356a(blmo, str, str2);
                                        i += str.length() + str2.length();
                                    } else if ((obj instanceof byte[]) && str.equals("rawData")) {
                                        byte[] bArr = (byte[]) obj;
                                        ByteString a3 = ByteString.m123261a(bArr);
                                        if (blmo.f164950c) {
                                            blmo.mo74035c();
                                            blmo.f164950c = false;
                                        }
                                        blmp blmp8 = (blmp) blmo.f164949b;
                                        a3.getClass();
                                        blmp8.f126866a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                        blmp8.f126880o = a3;
                                        i += bArr.length;
                                    } else {
                                        String valueOf = String.valueOf(str);
                                        Log.w("GCM", valueOf.length() == 0 ? new String("Ignoring ") : "Ignoring ".concat(valueOf));
                                    }
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (((long) i) <= cecz.f182285a.mo6606a().mo78839g() || aajt.f28314q.contains(a)) {
                            if (cedl.m136284b() > 0) {
                                blmp blmp9 = (blmp) blmo.mo74062i();
                                int i7 = blmp9.f164961ai;
                                if (i7 == -1) {
                                    i7 = bxxm.f165037a.mo74228a(blmp9).mo74223b(blmp9);
                                    blmp9.f164961ai = i7;
                                }
                                if (((long) i7) > cedl.m136284b()) {
                                    aajt.mo16914a(blmp9, "MessageTooBig");
                                }
                            }
                            boolean z3 = i4 == 0 ? false : stringExtra2 != null;
                            if (z3) {
                                if (!aajt.f28302e.mo17004a(aamh.m21513a(a, i3))) {
                                    aajt.mo16914a((blmp) blmo.mo74062i(), "TooManyMessages");
                                } else {
                                    aamc aamc = aajt.f28302e;
                                    if (!aytw.m84813a(aamc.f28439b)) {
                                        long d = aamc.mo17007d();
                                        String valueOf2 = String.valueOf(d);
                                        if (blmo.f164950c) {
                                            blmo.mo74035c();
                                            blmo.f164950c = false;
                                        }
                                        blmp blmp10 = (blmp) blmo.f164949b;
                                        valueOf2.getClass();
                                        blmp10.f126866a |= 128;
                                        blmp10.f126873h = valueOf2;
                                    }
                                    aajt.mo16914a((blmp) blmo.mo74062i(), "save_error");
                                }
                            }
                            if (aajt.f28313p.mo17094b()) {
                                aajt.f28313p.mo17091a(blmo);
                                z = true;
                            } else if (((blmp) blmo.f164949b).f126877l != 0 || (activeNetworkInfo = ((ConnectivityManager) aajt.f28298a.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                                z = false;
                            } else {
                                aand aand = aajt.f28313p;
                                aans aans = ((aanr) aand).f28608a;
                                if (!aans.f28640g) {
                                    synchronized (((aanr) aand).f28615h) {
                                        ((aanr) aand).f28615h.add(blmo);
                                    }
                                } else {
                                    aanr.m21668a(aans, blmo);
                                }
                                aajt.f28301d.mo17123b();
                                z = true;
                            }
                            if (z) {
                                return;
                            }
                            if (z3) {
                                try {
                                    GcmChimeraService.m24303a("Queued GCM %s", ((blmp) blmo.f164949b).f126870e);
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z;
                                    if (!z2) {
                                        GcmSenderChimeraProxy.m24315a();
                                    }
                                    throw th;
                                }
                            } else {
                                aajt.mo16914a((blmp) blmo.mo74062i(), "SERVICE_NOT_AVAILABLE");
                            }
                        } else {
                            aajt.mo16914a((blmp) blmo.mo74062i(), "MessageTooBig");
                        }
                    } else if (!stringExtra5.equals("https://gcm.googleapis.com/local/status")) {
                        Log.w("GCM", stringExtra5.length() == 0 ? new String("Ignoring unknown local RPC: ") : "Ignoring unknown local RPC: ".concat(stringExtra5));
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                        if (parcelableExtra instanceof Messenger) {
                            Messenger messenger = (Messenger) parcelableExtra;
                            Intent intent2 = new Intent();
                            intent2.putExtra("In-Reply-To", stringExtra2);
                            aans aans2 = ((aanr) aajt.f28313p).f28608a;
                            if (!aans2.f28640g) {
                                if (aans2.f28639f) {
                                    i6 = 2;
                                } else {
                                    i6 = 3;
                                }
                            }
                            intent2.putExtra("status", String.valueOf(i6));
                            Message obtain = Message.obtain();
                            obtain.obj = intent2;
                            try {
                                messenger.send(obtain);
                            } catch (RemoteException e2) {
                                Log.w("GCM", stringExtra5.length() == 0 ? new String("RemoteException while handling rpc response for: ") : "RemoteException while handling rpc response for: ".concat(stringExtra5));
                            }
                        } else {
                            Log.w("GCM", stringExtra5.length() == 0 ? new String("Local RPC missing messenger: ") : "Local RPC missing messenger: ".concat(stringExtra5));
                        }
                    }
                } else {
                    aajt.mo16914a((blmp) blmo.mo74062i(), "missing_to");
                }
            }
            GcmSenderChimeraProxy.m24315a();
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }
}
