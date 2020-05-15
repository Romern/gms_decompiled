package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.authzen.AuthzenGcmTaskChimeraService;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: ikl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikl {

    /* renamed from: b */
    public static final Logger f21214b = new Logger("TransactionStarter");

    /* renamed from: c */
    private static ikl f21215c;

    /* renamed from: a */
    public final Context f21216a;

    /* renamed from: d */
    private final sex f21217d;

    private ikl(Context context) {
        this.f21216a = context;
        this.f21217d = sex.m35104a(context);
    }

    /* renamed from: a */
    private final Notification m15603a(Intent intent, byog byog, byoh byoh) {
        Intent intent2 = new Intent(intent);
        intent2.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
        int a = qkj.m32287a(this.f21216a, C0126R.C0127drawable.authzen_ic_notification_badge_low_risk);
        C1102je jeVar = new C1102je(this.f21216a);
        jeVar.mo13627a(true);
        jeVar.f22266r = "authzen_notification_group";
        jeVar.f22272x = byog.f167204g;
        jeVar.mo13634c();
        jeVar.f22254f = PendingIntent.getActivity(this.f21216a, 0, intent2, 1207959552);
        jeVar.mo13631b(m15604a(intent2, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
        jeVar.mo13630b(a);
        jeVar.mo13621a(BitmapFactory.decodeResource(this.f21216a.getResources(), C0126R.C0127drawable.authzen_ic_notification_low_risk));
        jeVar.mo13633b(byog.f167203f);
        jeVar.f22260l = byog.f167202e;
        jeVar.f22258j = byog.f167200c;
        jeVar.mo13640e(byoh.f167209b);
        int i = Build.VERSION.SDK_INT;
        int i2 = byoh.f167208a;
        String str = null;
        if (!((i2 & 16) == 0 || (i2 & 4) == 0 || (i2 & 32) == 0)) {
            String str2 = byoh.f167212e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 9);
            sb.append("authzen:");
            sb.append(str2);
            sb.append(":");
            String sb2 = sb.toString();
            String str3 = byoh.f167211d;
            Integer valueOf = Integer.valueOf(byoh.f167213f);
            int i3 = byoh.f167214g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 11);
            sb3.append(sb2);
            sb3.append(i3);
            String sb4 = sb3.toString();
            if (i3 != 0) {
                for (NotificationChannel notificationChannel : this.f21217d.mo25439a()) {
                    String id = notificationChannel.getId();
                    if (id.startsWith(sb2)) {
                        try {
                            if (Integer.valueOf(Integer.parseInt(id.substring(sb2.length()))).intValue() < i3) {
                                this.f21217d.mo25447b(id);
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
            NotificationChannel notificationChannel2 = new NotificationChannel(sb4, str3, valueOf.intValue());
            Uri a2 = m15605a(byog);
            if (a2 != null) {
                notificationChannel2.setSound(a2, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
            long[] b = m15611b(byog);
            if (b != null) {
                notificationChannel2.setVibrationPattern(b);
            }
            this.f21217d.mo25442a(notificationChannel2);
            str = sb4;
        }
        if (str != null) {
            jeVar.f22244B = str;
        }
        if ((byoh.f167208a & 2) != 0) {
            jeVar.mo13632b(byoh.f167210c);
        }
        Uri a3 = m15605a(byog);
        if (a3 != null) {
            jeVar.mo13622a(a3);
        }
        long[] b2 = m15611b(byog);
        if (b2 != null) {
            jeVar.mo13628a(b2);
        }
        int i4 = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", this.f21216a.getString(C0126R.string.common_google));
        jeVar.mo13623a(bundle);
        return jeVar.mo13629b();
    }

    /* renamed from: b */
    private final PendingIntent m15610b(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setAction("AUTHZEN_NOTIFICATION_EXPIRED");
        intent2.setClassName(this.f21216a, "com.google.android.gms.auth.authzen.AuthzenGcmReceiver");
        return PendingIntent.getBroadcast(this.f21216a, 0, intent2, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* renamed from: c */
    private final PendingIntent m15612c(Intent intent) {
        return m15604a(intent, 1610612736);
    }

    /* renamed from: b */
    private static long[] m15611b(byog byog) {
        if (byog == null || byog.f167201d.size() <= 0) {
            return null;
        }
        bxvw bxvw = byog.f167201d;
        long[] jArr = new long[bxvw.size()];
        int size = bxvw.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            jArr[i2] = ((Long) bxvw.get(i)).longValue();
            i++;
            i2++;
        }
        return jArr;
    }

    /* renamed from: a */
    private final PendingIntent m15604a(Intent intent, int i) {
        Intent intent2 = new Intent(intent);
        intent2.setAction("AUTHZEN_NOTIFICATION_DISMISSED");
        intent2.setClassName(this.f21216a, "com.google.android.gms.auth.authzen.AuthzenGcmReceiver");
        return PendingIntent.getBroadcast(this.f21216a, 0, intent2, i);
    }

    /* renamed from: a */
    private static Uri m15605a(byog byog) {
        if (!(byog == null || (byog.f167198a & 4) == 0)) {
            int a = byof.m125024a(byog.f167199b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 != 0) {
                if (i2 == 2 || i2 == 3) {
                    return RingtoneManager.getDefaultUri(2);
                }
                Logger Logger = f21214b;
                int a2 = byof.m125024a(byog.f167199b);
                if (a2 != 0) {
                    i = a2;
                }
                String valueOf = String.valueOf(Integer.toString(i - 1));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unknown sound type: ");
                sb.append(valueOf);
                Logger.mo25416d(sb.toString(), new Object[0]);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    static byog m15606a(bypc bypc, boolean z) {
        if (z) {
            bypb bypb = bypc.f167310d;
            if (bypb == null) {
                bypb = bypb.f167289p;
            }
            if ((bypb.f167291a & 4096) != 0) {
                bypb bypb2 = bypc.f167310d;
                if (bypb2 == null) {
                    bypb2 = bypb.f167289p;
                }
                byog byog = bypb2.f167303n;
                return byog == null ? byog.f167196i : byog;
            }
        }
        bypb bypb3 = bypc.f167310d;
        if (bypb3 == null) {
            bypb3 = bypb.f167289p;
        }
        if ((bypb3.f167291a & 2048) == 0) {
            return null;
        }
        bypb bypb4 = bypc.f167310d;
        if (bypb4 == null) {
            bypb4 = bypb.f167289p;
        }
        byog byog2 = bypb4.f167302m;
        return byog2 == null ? byog.f167196i : byog2;
    }

    /* renamed from: a */
    public static ikl m15607a(Context context) {
        if (f21215c == null) {
            f21215c = new ikl(context);
        }
        return f21215c;
    }

    /* renamed from: a */
    public static String m15608a(bypc bypc) {
        bypb bypb = bypc.f167310d;
        if (bypb == null) {
            bypb = bypb.f167289p;
        }
        byny byny = bypb.f167295e;
        if (byny == null) {
            byny = byny.f167146c;
        }
        int i = byny.f167149b;
        byny byny2 = bypb.f167295e;
        if (byny2 == null) {
            byny2 = byny.f167146c;
        }
        int i2 = byny2.f167148a;
        StringBuilder sb = new StringBuilder(47);
        sb.append("authzen:notificationTag:");
        sb.append(i2);
        sb.append(':');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m15609a(byod byod, byoh byoh) {
        if (byoh == null || stm.m36302d(byoh.f167209b) || byod == byod.START_ACTIVITY) {
            return false;
        }
        if (byod == byod.GENERIC_NOTIFICATION) {
            return true;
        }
        if (byod != byod.AUTO) {
            Logger Logger = f21214b;
            String valueOf = String.valueOf(byod);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unknown interaction type: ");
            sb.append(valueOf);
            Logger.mo25418e(sb.toString(), new Object[0]);
            return false;
        } else if (!new igh(this.f21216a).mo12993a()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final PendingIntent mo13094a(long j) {
        Intent intent = new Intent("AUTHZEN_ACTIVITY_EXPIRED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("creation_elapsed_time", j);
        StringBuilder sb = new StringBuilder(42);
        sb.append("creation_elapsed_time:");
        sb.append(j);
        intent.addCategory(sb.toString());
        return PendingIntent.getBroadcast(this.f21216a, 0, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13095a(Intent intent) {
        if (((Boolean) igt.f20947C.mo58455c()).booleanValue()) {
            f21214b.mo25412b("Cancel dismiss notification task", new Object[0]);
            AuthzenGcmTaskChimeraService.m6428a(this.f21216a, m15608a(ijt.m15553a(intent)));
            return;
        }
        ikj.m15597a(ijt.m15553a(intent).f167308b.getKey(), 13, this.f21216a);
        new skc(this.f21216a).mo25668a(m15610b(intent));
    }

    /* renamed from: a */
    public final void mo13096a(Intent intent, String str) {
        PendingIntent activity = PendingIntent.getActivity(this.f21216a, 0, intent, 1610612736);
        PendingIntent c = m15612c(intent);
        if (activity != null && c != null) {
            mo13095a(intent);
            PendingIntent c2 = m15612c(intent);
            if (c2 != null) {
                try {
                    c2.send();
                } catch (PendingIntent.CanceledException e) {
                    f21214b.mo25413c("PendingIntent cancelled", e, new Object[0]);
                }
            }
            mo13098a(str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ikl.a(bypc, boolean):byog
     arg types: [bypc, int]
     candidates:
      ikl.a(android.content.Intent, int):android.app.PendingIntent
      ikl.a(byod, byoh):boolean
      ikl.a(android.content.Intent, java.lang.String):void
      ikl.a(bypc, boolean):byog */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017d, code lost:
        if (p000.sqz.m36058a((java.lang.String) p000.igt.f20976z.mo58455c(), java.lang.Integer.toString(r4.getCurrentModeType())) != false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0252 A[RETURN] */
    /* renamed from: a */
    public final void mo13097a(bypc bypc, Intent intent, long j, long j2, boolean z) {
        byod byod;
        int i;
        Notification notification;
        bypc bypc2 = bypc;
        Intent intent2 = intent;
        boolean z2 = z;
        intent2.putExtra("creation_elapsed_time", j);
        intent2.putExtra("creation_wall_time", j2);
        String a = m15608a(bypc);
        intent2.addCategory(a);
        Intent intent3 = new Intent("AUTHZEN_REPLACE_ACTIVITY");
        intent3.setPackage("com.google.android.gms");
        intent3.putExtra("notification_tag", a);
        intent3.putExtra("transaction_id", bypc2.f167308b.getKey());
        this.f21216a.sendBroadcast(intent3);
        if (!z2) {
            mo13096a(intent2, a);
        }
        byoh byoh = null;
        if (z2) {
            bypb bypb = bypc2.f167310d;
            if (bypb == null) {
                bypb = bypb.f167289p;
            }
            if ((bypb.f167291a & 64) != 0) {
                bypb bypb2 = bypc2.f167310d;
                if (bypb2 == null) {
                    bypb2 = bypb.f167289p;
                }
                byod = byod.m125020a(bypb2.f167297g);
                if (byod == null) {
                    byod = byod.START_ACTIVITY;
                }
                if (byod == byod.INVISIBLE) {
                    byog a2 = m15606a(bypc2, z2);
                    if (z2 && (bypc2.f167307a & 1024) != 0) {
                        byoh = bypc2.f167314h;
                        if (byoh == null) {
                            byoh = byoh.f167206h;
                        }
                    } else if ((bypc2.f167307a & 512) != 0 && (byoh = bypc2.f167313g) == null) {
                        byoh = byoh.f167206h;
                    }
                    if (m15609a(byod, byoh)) {
                        PendingIntent b = m15610b(intent2);
                        long longExtra = intent2.getLongExtra("creation_elapsed_time", SystemClock.elapsedRealtime());
                        long a3 = ikj.m15593a(bypc);
                        if (a3 < 0) {
                            a3 = 0;
                        }
                        ikj.m15597a(bypc2.f167308b.getKey(), 7, this.f21216a);
                        if (((Boolean) igt.f20947C.mo58455c()).booleanValue()) {
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(a3);
                            AuthzenGcmTaskChimeraService.m6427a(this.f21216a, intent2, seconds);
                            f21214b.mo25414c("Scheduling Gcm task to dismiss notification (txId=%s) in %s seconds", ikj.m15598b(bypc2.f167308b.getKey()), Long.valueOf(seconds));
                        } else {
                            skc skc = new skc(this.f21216a);
                            int i2 = Build.VERSION.SDK_INT;
                            skc.mo25681b("AuthzenNotificationAlarm", 2, longExtra + a3, b, "com.google.android.gms");
                            f21214b.mo25414c("Scheduling notification-based prompt (txId=%s) to be killed in %s seconds.", ikj.m15598b(bypc2.f167308b.getKey()), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(a3)));
                        }
                        if (!stm.m36302d((String) igt.f20976z.mo58455c()) && (r4 = (UiModeManager) this.f21216a.getSystemService("uimode")) != null) {
                        }
                        if (byod == byod.AUTO || byod == byod.START_ACTIVITY) {
                            f21214b.mo25412b("Starting activity-based prompt: interaction_type=%s", byod);
                            this.f21216a.startActivity(intent2);
                            notification = m15603a(intent2, a2, byoh);
                            i = 1;
                            this.f21217d.mo25445a(a, i, notification);
                            ikj.m15597a(bypc2.f167308b.getKey(), 3, this.f21216a);
                        }
                        i = 1;
                        f21214b.mo25412b("Starting notification-based prompt: interaction_type=%s", byod);
                        notification = m15603a(intent2, a2, byoh);
                        this.f21217d.mo25445a(a, i, notification);
                        ikj.m15597a(bypc2.f167308b.getKey(), 3, this.f21216a);
                    } else {
                        if (z2) {
                            bypb bypb3 = bypc2.f167310d;
                            if (bypb3 == null) {
                                bypb3 = bypb.f167289p;
                            }
                            byod a4 = byod.m125020a(bypb3.f167296f);
                            if (a4 == null) {
                                a4 = byod.START_ACTIVITY;
                            }
                            byoh byoh2 = bypc2.f167313g;
                            if (byoh2 == null) {
                                byoh2 = byoh.f167206h;
                            }
                            if (m15609a(a4, byoh2)) {
                                this.f21217d.mo25444a(a, 1);
                            }
                        }
                        byog a5 = m15606a(bypc2, z2);
                        Uri a6 = m15605a(a5);
                        if (a6 != null && (!z2 || !a6.equals(m15605a(m15606a(bypc2, false))))) {
                            RingtoneManager.getRingtone(this.f21216a, a6).play();
                        }
                        long[] b2 = m15611b(a5);
                        if (b2 != null && (!z2 || !Arrays.equals(b2, m15611b(m15606a(bypc2, false))))) {
                            ((Vibrator) this.f21216a.getSystemService("vibrator")).vibrate(b2, -1);
                        }
                        ikj.m15597a(bypc2.f167308b.getKey(), 4, this.f21216a);
                        this.f21216a.startActivity(intent2);
                    }
                    if (z2) {
                        TransactionReplyIntentOperation.m6533b(bypc2.f167308b.getKey());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        bypb bypb4 = bypc2.f167310d;
        if (bypb4 == null) {
            bypb4 = bypb.f167289p;
        }
        if ((bypb4.f167291a & 32) != 0) {
            bypb bypb5 = bypc2.f167310d;
            if (bypb5 == null) {
                bypb5 = bypb.f167289p;
            }
            byod = byod.m125020a(bypb5.f167296f);
            if (byod == null) {
                byod = byod.START_ACTIVITY;
            }
        } else {
            byod = null;
        }
        if (byod == byod.INVISIBLE) {
        }
    }

    /* renamed from: a */
    public final void mo13098a(String str) {
        this.f21217d.mo25444a(str, 1);
    }
}
