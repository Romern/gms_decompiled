package com.google.android.gms.fitness.service.seeding;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeedingIntentOperation extends IntentOperation {
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r9v0, assign insn: 0x0044: CONST  (r9v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean], assign insn: PHI: (r9v1 ?) = (r9v0 ?), (r9v14 ?) binds: [B:19:?, B:83:0x024f] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean], assign insn: PHI: (r9v2 ?) = (r9v10 ?), (r9v13 ?) binds: [B:108:0x0304, B:68:0x01e3] */
    /* JADX WARN: Type inference failed for: r9v10, assign insn: 0x0307: CONST  (r9v10 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v13, assign insn: ?: MOVE  (r9v13 ?) = (r9v1 ?) */
    /* JADX WARN: Type inference failed for: r9v14, assign insn: ?: MOVE  (r9v14 ?) = (r9v2 ?) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(long, long, caae, boolean):void
     arg types: [int, long, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(cadp, boolean):cadp
     arg types: [cadp, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(cadp, boolean):cadp */
    public final void onHandleIntent(Intent intent) {
        FileInputStream fileInputStream;
        Throwable th;
        caae caae;
        Log.i("SeedingIntentOperation", "Received intent");
        String stringExtra = intent.getStringExtra("fitness.account");
        String stringExtra2 = intent.getStringExtra("destination.file");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("receiver");
        int i = 1;
        try {
            if (!cdzd.f182003a.mo6606a().mo78543J()) {
                Log.i("SeedingIntentOperation", "Seeding disabled");
                if (resultReceiver != null) {
                    Log.i("SeedingIntentOperation", "Notifying Receiver");
                    resultReceiver.send(1, new Bundle());
                    return;
                }
                return;
            }
            int i2 = 2;
            ? r9 = 0;
            if (!bmxx.m108577a(stringExtra) && !bmxx.m108577a(stringExtra2)) {
                File file = new File(stringExtra2);
                if (file.exists()) {
                    long length = file.length();
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("File size: ");
                    sb.append(length);
                    Log.i("SeedingIntentOperation", sb.toString());
                    fileInputStream = new FileInputStream(file);
                    eno eno = (eno) GeneratedMessageLite.m124011a(eno.f15330e, fileInputStream, bxus.m123744c());
                    fileInputStream.close();
                    zre c = yzp.m45078a(getApplicationContext()).mo30877c(stringExtra);
                    caaq a = zvn.m46574a(this);
                    long j = eno.f15333b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(eno.f15335d));
                    instance.setTimeInMillis(System.currentTimeMillis());
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    instance.set(14, 999);
                    long nanos = timeUnit.toNanos(instance.getTime().getTime()) - j;
                    for (cadp cadp : eno.f15332a) {
                        cado cado = (cado) cadp.f172710f.mo74144da();
                        caae caae2 = cadp.f172713b;
                        if (caae2 == null) {
                            caae2 = caae.f172323i;
                        }
                        yyc a2 = yyd.m44987a();
                        caad a3 = caad.m126389a(caae2.f172329e);
                        if (a3 == null) {
                            a3 = caad.RAW;
                        }
                        a2.mo30856a(a3);
                        caah caah = caae2.f172330f;
                        if (caah == null) {
                            caah = caah.f172333d;
                        }
                        a2.mo30857a(caah);
                        a2.mo30858a(a);
                        a2.mo30859a(caae2.f172328d);
                        if ((caae2.f172325a & 64) != 0) {
                            bzzz bzzz = caae2.f172332h;
                            if (bzzz == null) {
                                bzzz = bzzz.f172298f;
                            }
                            a2.mo30855a(bzzz);
                        }
                        caae a4 = a2.mo30854a();
                        if (cado.f164950c) {
                            cado.mo74035c();
                            cado.f164950c = r9;
                        }
                        cadp cadp2 = (cadp) cado.f164949b;
                        a4.getClass();
                        cadp2.f172713b = a4;
                        cadp2.f172712a |= i2;
                        ? r92 = r9;
                        for (cadn cadn : cadp.f172714c) {
                            long j2 = nanos;
                            bxvd bxvd = (bxvd) cadn.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) cadn);
                            cadm cadm = (cadm) bxvd;
                            cadn cadn2 = (cadn) cadm.f164949b;
                            if ((cadn2.f172701a & 1) != 0) {
                                long j3 = cadn2.f172702b + j2;
                                if (cadm.f164950c) {
                                    cadm.mo74035c();
                                    cadm.f164950c = r92;
                                }
                                cadn cadn3 = (cadn) cadm.f164949b;
                                cadn cadn4 = cadn.f172699j;
                                cadn3.f172701a |= 1;
                                cadn3.f172702b = j3;
                            }
                            cadn cadn5 = (cadn) cadm.f164949b;
                            if ((cadn5.f172701a & 2) != 0) {
                                long j4 = cadn5.f172703c + j2;
                                if (cadm.f164950c) {
                                    cadm.mo74035c();
                                    cadm.f164950c = false;
                                }
                                cadn cadn6 = (cadn) cadm.f164949b;
                                cadn cadn7 = cadn.f172699j;
                                cadn6.f172701a |= 2;
                                cadn6.f172703c = j4;
                            }
                            if (cadm.f164950c) {
                                cadm.mo74035c();
                                cadm.f164950c = false;
                            }
                            cadn cadn8 = (cadn) cadm.f164949b;
                            cadn cadn9 = cadn.f172699j;
                            a4.getClass();
                            cadn8.f172705e = a4;
                            cadn8.f172701a |= 4;
                            if (cado.f164950c) {
                                cado.mo74035c();
                                cado.f164950c = false;
                            }
                            cadp cadp3 = (cadp) cado.f164949b;
                            cadn cadn10 = (cadn) cadm.mo74062i();
                            cadn10.getClass();
                            cadp3.mo74621c();
                            cadp3.f172714c.add(cadn10);
                            nanos = j2;
                            r92 = 0;
                        }
                        cadp cadp4 = (cadp) cado.mo74062i();
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                        caae caae3 = cadp4.f172713b;
                        if (caae3 != null) {
                            caae = caae3;
                        } else {
                            caae = caae.f172323i;
                        }
                        long j5 = nanos;
                        cadp cadp5 = cadp4;
                        c.mo31367a(0L, nanos2, caae, true);
                        Object[] objArr = new Object[1];
                        caae caae4 = cadp.f172713b;
                        if (caae4 == null) {
                            caae4 = caae.f172323i;
                        }
                        objArr[r92] = caae4.f172326b;
                        Log.i("SeedingIntentOperation", String.format("Deleted %s store data.", objArr));
                        c.mo31366a(cadp5, true);
                        Object[] objArr2 = new Object[1];
                        caae caae5 = cadp.f172713b;
                        if (caae5 == null) {
                            caae5 = caae.f172323i;
                        }
                        objArr2[r92] = caae5.f172326b;
                        Log.i("SeedingIntentOperation", String.format("Inserted %s raw data", objArr2));
                        nanos = j5;
                        i = 1;
                        i2 = 2;
                        r9 = r92;
                    }
                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                    Object[] objArr3 = new Object[i];
                    objArr3[r9] = Integer.valueOf(eno.f15334c.size());
                    Log.i("SeedingIntentOperation", String.format("About add %d Sessions", objArr3));
                    for (cadz cadz : eno.f15334c) {
                        bxvd a5 = cadz.f172773j.mo74141a(cadz);
                        if ((cadz.f172775a & 16) != 0) {
                            long j6 = cadz.f172780f + millis;
                            if (a5.f164950c) {
                                a5.mo74035c();
                                a5.f164950c = r9;
                            }
                            cadz cadz2 = (cadz) a5.f164949b;
                            cadz2.f172775a |= 16;
                            cadz2.f172780f = j6;
                        }
                        if ((cadz.f172775a & 8) != 0) {
                            long j7 = cadz.f172779e + millis;
                            if (a5.f164950c) {
                                a5.mo74035c();
                                a5.f164950c = r9;
                            }
                            cadz cadz3 = (cadz) a5.f164949b;
                            cadz3.f172775a |= 8;
                            cadz3.f172779e = j7;
                        }
                        cadz cadz4 = (cadz) a5.mo74062i();
                        c.mo31393a(cadz4, 17);
                        c.mo31394b(cadz4, 17);
                    }
                    Object[] objArr4 = new Object[1];
                    objArr4[r9] = Integer.valueOf(eno.f15334c.size());
                    Log.i("SeedingIntentOperation", String.format("Finished adding %d Sessions", objArr4));
                    if (resultReceiver != null) {
                        Log.i("SeedingIntentOperation", "Notifying Receiver");
                        resultReceiver.send(1, new Bundle());
                        return;
                    }
                    return;
                }
                Log.w("SeedingIntentOperation", String.format("File %s does not exist", stringExtra2));
                if (resultReceiver != null) {
                    Log.i("SeedingIntentOperation", "Notifying Receiver");
                    resultReceiver.send(1, new Bundle());
                    return;
                }
                return;
            }
            Log.i("SeedingIntentOperation", String.format("Missing inputs, have accountName: %s and seedingPath: %s", stringExtra, stringExtra2));
            if (resultReceiver != null) {
                Log.i("SeedingIntentOperation", "Notifying Receiver");
                resultReceiver.send(1, new Bundle());
                return;
            }
            return;
        } catch (IOException | RuntimeException e) {
            try {
                Log.w("SeedingIntentOperation", "Seeding exception", e);
                if (resultReceiver != null) {
                    Log.i("SeedingIntentOperation", "Notifying Receiver");
                    resultReceiver.send(1, new Bundle());
                    return;
                }
                return;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (resultReceiver != null) {
                    Log.i("SeedingIntentOperation", "Notifying Receiver");
                    resultReceiver.send(1, new Bundle());
                }
                throw th3;
            }
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
        throw th;
    }
}
