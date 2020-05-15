package com.google.android.gms.growth.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrowthNotificationsIntentOperation extends IntentOperation {

    /* renamed from: e */
    private static final srn f79022e = srn.m36127a(sgj.GROWTH);

    /* renamed from: a */
    abij f79023a;

    /* renamed from: b */
    ablh f79024b;

    /* renamed from: c */
    abjd f79025c;

    /* renamed from: d */
    abla f79026d;

    /* renamed from: a */
    public static Intent m66641a(Context context, Intent intent) {
        return IntentOperation.getStartIntent(context, GrowthNotificationsIntentOperation.class, "com.google.android.gms.growth.notifications.NOTIFICATION_ACTION").putExtra("gcmIntent", intent);
    }

    public final void onCreate() {
        abiq abiq = new abiq();
        abig a = abif.m47744a();
        cazf.m127594a(a);
        abiq.f57547a = a;
        cazf.m127595a(abiq.f57547a, abig.class);
        abir abir = new abir(abiq.f57547a);
        abij d = abir.f57548a.mo32121d();
        cazf.m127593a(d, "Cannot return null from a non-@Nullable component method");
        this.f79023a = d;
        ablh j = abir.f57548a.mo32127j();
        cazf.m127593a(j, "Cannot return null from a non-@Nullable component method");
        this.f79024b = j;
        Context b = abir.f57548a.mo32119b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable component method");
        bqgj e = abir.f57548a.mo32122e();
        cazf.m127593a(e, "Cannot return null from a non-@Nullable component method");
        this.f79025c = new abjd(b, e);
        abla h = abir.f57548a.mo32125h();
        cazf.m127593a(h, "Cannot return null from a non-@Nullable component method");
        this.f79026d = h;
    }

    public final void onHandleIntent(Intent intent) {
        String a;
        bsmg a2;
        try {
            if (!"com.google.android.gms.growth.notifications.NOTIFICATION_ACTION".equals(intent.getAction())) {
                ((bnsl) f79022e.mo68388c()).mo68420a("Received unexpected ACTION=%s", intent.getAction());
            } else {
                Intent intent2 = (Intent) intent.getParcelableExtra("gcmIntent");
                String a3 = aakz.m21424a(this).mo16960a(intent2);
                if ("gcm".equals(a3)) {
                    String stringExtra = intent2.getStringExtra("gms.gnots.payload");
                    blcs a4 = this.f79026d.mo32190a(stringExtra);
                    if (!(a4 == null || (a = this.f79026d.mo32193a(getApplicationContext(), a4)) == null || (a2 = this.f79026d.mo32192a(a4, stringExtra)) == null)) {
                        abla abla = this.f79026d;
                        bsqe bsqe = a2.f145019b;
                        if (bsqe == null) {
                            bsqe = bsqe.f146627e;
                        }
                        abla.mo32196a(a, bsqe, 2, this.f79023a);
                        int b = stu.m36316b();
                        int i = a2.f145021d;
                        int i2 = a2.f145022e;
                        if (i2 == 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (b >= i) {
                            if (b <= i2) {
                                Iterator it = a2.f145023f.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (this.f79026d.mo32194a(this).contains((String) it.next())) {
                                            abij abij = this.f79023a;
                                            bxvd da = bspy.f146601f.mo74144da();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bspy bspy = (bspy) da.f164949b;
                                            bspy.f146604b = 2;
                                            int i3 = bspy.f146603a | 1;
                                            bspy.f146603a = i3;
                                            bspy.f146605c = 4;
                                            bspy.f146603a = 2 | i3;
                                            bsqe bsqe2 = a2.f145019b;
                                            if (bsqe2 == null) {
                                                bsqe2 = bsqe.f146627e;
                                            }
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bspy bspy2 = (bspy) da.f164949b;
                                            bsqe2.getClass();
                                            bspy2.f146606d = bsqe2;
                                            bspy2.f146603a |= 4;
                                            abij.mo32130a(a, da);
                                        }
                                    } else if (!m66642a(a, a2)) {
                                        if (!a2.f145020c) {
                                            this.f79026d.mo32198b(this, intent, this.f79023a);
                                        } else {
                                            abij abij2 = this.f79023a;
                                            bxvd da2 = bspy.f146601f.mo74144da();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bspy bspy3 = (bspy) da2.f164949b;
                                            bspy3.f146604b = 2;
                                            int i4 = bspy3.f146603a | 1;
                                            bspy3.f146603a = i4;
                                            bspy3.f146605c = 2;
                                            bspy3.f146603a = i4 | 2;
                                            bsqe bsqe3 = a2.f145019b;
                                            if (bsqe3 == null) {
                                                bsqe3 = bsqe.f146627e;
                                            }
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bspy bspy4 = (bspy) da2.f164949b;
                                            bsqe3.getClass();
                                            bspy4.f146606d = bsqe3;
                                            bspy4.f146603a |= 4;
                                            abij2.mo32130a(a, da2);
                                            bxvd da3 = bsmh.f145025e.mo74144da();
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            bsmh bsmh = (bsmh) da3.f164949b;
                                            a.getClass();
                                            bsmh.f145027a |= 2;
                                            bsmh.f145029c = a;
                                            bsqe bsqe4 = a2.f145019b;
                                            if (bsqe4 == null) {
                                                bsqe4 = bsqe.f146627e;
                                            }
                                            int i5 = bsqe4.f146630b;
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            bsmh bsmh2 = (bsmh) da3.f164949b;
                                            bsmh2.f145027a |= 4;
                                            bsmh2.f145030d = i5;
                                            for (String str : cejv.f182809a.mo6606a().mo79197a().f165797a) {
                                                this.f79024b.mo32204a(str, da3);
                                            }
                                            ablh ablh = this.f79024b;
                                            bxvd da4 = bsmh.f145025e.mo74144da();
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            bsmh bsmh3 = (bsmh) da4.f164949b;
                                            a.getClass();
                                            bsmh3.f145027a |= 2;
                                            bsmh3.f145029c = a;
                                            bsqe bsqe5 = a2.f145019b;
                                            if (bsqe5 == null) {
                                                bsqe5 = bsqe.f146627e;
                                            }
                                            int i6 = bsqe5.f146630b;
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            bsmh bsmh4 = (bsmh) da4.f164949b;
                                            bsmh4.f145027a |= 4;
                                            bsmh4.f145030d = i6;
                                            ablh.mo32202a(da4);
                                            ablh ablh2 = this.f79024b;
                                            bxvd da5 = bsmh.f145025e.mo74144da();
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = false;
                                            }
                                            bsmh bsmh5 = (bsmh) da5.f164949b;
                                            a.getClass();
                                            bsmh5.f145027a = 2 | bsmh5.f145027a;
                                            bsmh5.f145029c = a;
                                            bsqe bsqe6 = a2.f145019b;
                                            if (bsqe6 == null) {
                                                bsqe6 = bsqe.f146627e;
                                            }
                                            int i7 = bsqe6.f146630b;
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = false;
                                            }
                                            bsmh bsmh6 = (bsmh) da5.f164949b;
                                            bsmh6.f145027a |= 4;
                                            bsmh6.f145030d = i7;
                                            ablh2.mo32205b(da5);
                                        }
                                    }
                                }
                            }
                        }
                        abij abij3 = this.f79023a;
                        bxvd da6 = bspy.f146601f.mo74144da();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bspy bspy5 = (bspy) da6.f164949b;
                        bspy5.f146604b = 2;
                        int i8 = bspy5.f146603a | 1;
                        bspy5.f146603a = i8;
                        bspy5.f146605c = 3;
                        bspy5.f146603a = 2 | i8;
                        bsqe bsqe7 = a2.f145019b;
                        if (bsqe7 == null) {
                            bsqe7 = bsqe.f146627e;
                        }
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bspy bspy6 = (bspy) da6.f164949b;
                        bsqe7.getClass();
                        bspy6.f146606d = bsqe7;
                        bspy6.f146603a |= 4;
                        abij3.mo32130a(a, da6);
                    }
                } else {
                    ((bnsl) f79022e.mo68388c()).mo68420a("Received unexpected message type: %s", a3);
                }
            }
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f79022e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to handle intent: %s", intent);
        } catch (Throwable th) {
            asfd.m73946a(this, intent);
            throw th;
        }
        asfd.m73946a(this, intent);
    }

    /* renamed from: a */
    private final boolean m66642a(String str, bsmg bsmg) {
        if ((bsmg.f145018a & 16) != 0) {
            try {
                abjd abjd = this.f79025c;
                bsmf bsmf = bsmg.f145024g;
                if (bsmf == null) {
                    bsmf = bsmf.f145008e;
                }
                abjc abjc = (abjc) abjd.mo32144a(bsmf).get(5, TimeUnit.SECONDS);
                if (!abjc.mo32132a()) {
                    abij abij = this.f79023a;
                    bxvd da = bspy.f146601f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspy bspy = (bspy) da.f164949b;
                    bspy.f146604b = 2;
                    int i = bspy.f146603a | 1;
                    bspy.f146603a = i;
                    bspy.f146605c = 5;
                    bspy.f146603a = i | 2;
                    bngx b = abjc.mo32133b();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspy bspy2 = (bspy) da.f164949b;
                    if (!bspy2.f146607e.mo73666a()) {
                        bspy2.f146607e = bxvk.m124021a(bspy2.f146607e);
                    }
                    bxsy.m123078a(b, bspy2.f146607e);
                    bsqe bsqe = bsmg.f145019b;
                    if (bsqe == null) {
                        bsqe = bsqe.f146627e;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspy bspy3 = (bspy) da.f164949b;
                    bsqe.getClass();
                    bspy3.f146606d = bsqe;
                    bspy3.f146603a |= 4;
                    abij.mo32130a(str, da);
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                bnsl bnsl = (bnsl) f79022e.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to evaluate filtering condition");
                abij abij2 = this.f79023a;
                bxvd da2 = bspy.f146601f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bspy bspy4 = (bspy) da2.f164949b;
                bspy4.f146604b = 2;
                int i2 = bspy4.f146603a | 1;
                bspy4.f146603a = i2;
                bspy4.f146605c = 1;
                bspy4.f146603a = 2 | i2;
                bsqe bsqe2 = bsmg.f145019b;
                if (bsqe2 == null) {
                    bsqe2 = bsqe.f146627e;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bspy bspy5 = (bspy) da2.f164949b;
                bsqe2.getClass();
                bspy5.f146606d = bsqe2;
                bspy5.f146603a |= 4;
                abij2.mo32130a(str, da2);
                return true;
            }
        }
        return false;
    }
}
