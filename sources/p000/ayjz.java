package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.IOException;
import java.util.UUID;

/* renamed from: ayjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjz {
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r4.edit().putLong(":lastRunMsec", r6).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022a, code lost:
        if (r11 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.edit().putLong(":lastRunMsec", r6).apply();
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0179, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0181, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:48:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ac A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:48:0x00db] */
    /* renamed from: a */
    public static synchronized void m84134a(Context context, rjx rjx, bymq bymq, qxq qxq) {
        DropBoxManager dropBoxManager;
        long j;
        int i;
        Context context2 = context;
        qxq qxq2 = qxq;
        synchronized (ayjz.class) {
            DropBoxManager dropBoxManager2 = (DropBoxManager) context2.getSystemService("dropbox");
            if (dropBoxManager2 != null) {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("WestworldAwPOp", 0);
                long j2 = sharedPreferences.getLong(":lastRunMsec", -1);
                long currentTimeMillis = System.currentTimeMillis();
                DropBoxManager.Entry entry = null;
                if (aykk.f97848g == null) {
                    aykk.f97848g = new qws(context2, chpz.m149327d(), null);
                }
                qws qws = aykk.f97848g;
                while (true) {
                    if (j2 >= currentTimeMillis) {
                        break;
                    }
                    try {
                        entry = dropBoxManager2.getNextEntry("perfprofd", j2);
                        if (entry == null) {
                            break;
                        }
                        try {
                            j2 = entry.getTimeMillis();
                        } catch (ayko e) {
                            dropBoxManager = dropBoxManager2;
                            qxq2.mo24383c("BadAwPFile").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                            if (entry != null) {
                            }
                            dropBoxManager2 = dropBoxManager;
                        } catch (IOException e2) {
                            dropBoxManager = dropBoxManager2;
                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                        } catch (Exception e3) {
                            e = e3;
                            qxq2.mo24383c("AwPCrash").mo24359a();
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                            if (entry != null) {
                            }
                            throw th;
                        }
                        try {
                            if ((entry.getFlags() & 1) != 0) {
                                sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                                entry.close();
                            } else {
                                qxq2.mo24383c("UploadAwP").mo24359a();
                                aykn aykn = new aykn(entry.getInputStream(), ((int) chpz.m149328e()) - 24);
                                aykq aykq = new aykq(aykn);
                                UUID randomUUID = UUID.randomUUID();
                                int i2 = 0;
                                while (true) {
                                    if (aykn.mo54059a()) {
                                        i = 0;
                                    } else if (aykn.f97857a == 0) {
                                        break;
                                    } else {
                                        i = 0;
                                    }
                                    while (true) {
                                        aykp a = aykq.mo54067a();
                                        if (a == null) {
                                            break;
                                        }
                                        i += a.f97866c;
                                    }
                                    if (i != 0) {
                                        bxtx a2 = bxtx.m123261a(aykn.mo54060a(0, i));
                                        aykq.mo54070d();
                                        bxvd da = bymn.f167040f.mo74144da();
                                        j = j2;
                                        try {
                                            long leastSignificantBits = randomUUID.getLeastSignificantBits();
                                            aykn aykn2 = aykn;
                                            if (!da.f164950c) {
                                                dropBoxManager = dropBoxManager2;
                                            } else {
                                                da.mo74035c();
                                                dropBoxManager = dropBoxManager2;
                                                da.f164950c = false;
                                            }
                                            bymn bymn = (bymn) da.f164949b;
                                            bymn.f167042a |= 1;
                                            bymn.f167043b = leastSignificantBits;
                                            long mostSignificantBits = randomUUID.getMostSignificantBits();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bymn bymn2 = (bymn) da.f164949b;
                                            int i3 = bymn2.f167042a | 2;
                                            bymn2.f167042a = i3;
                                            bymn2.f167044c = mostSignificantBits;
                                            int i4 = i3 | 4;
                                            bymn2.f167042a = i4;
                                            bymn2.f167045d = i2;
                                            a2.getClass();
                                            bymn2.f167042a = i4 | 8;
                                            bymn2.f167046e = a2;
                                            bxvd da2 = byms.f167065g.mo74144da();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            byms byms = (byms) da2.f164949b;
                                            bymn bymn3 = (bymn) da.mo74062i();
                                            bymn3.getClass();
                                            byms.f167069c = bymn3;
                                            byms.f167068b = 5;
                                            aykk.m84171a(rjx, qws, bymq, qxq2, da2);
                                            i2++;
                                            aykn = aykn2;
                                            j2 = j;
                                            dropBoxManager2 = dropBoxManager;
                                        } catch (ayko e4) {
                                            j2 = j;
                                            qxq2.mo24383c("BadAwPFile").mo24359a();
                                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                                            if (entry != null) {
                                            }
                                            dropBoxManager2 = dropBoxManager;
                                        } catch (IOException e5) {
                                            j2 = j;
                                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                                        } catch (Exception e6) {
                                        } catch (Throwable th2) {
                                        }
                                    } else {
                                        aykn aykn3 = aykn;
                                        dropBoxManager = dropBoxManager2;
                                        long j3 = j2;
                                        if (aykq.mo54069c()) {
                                            aykn = aykn3;
                                            j2 = j3;
                                            dropBoxManager2 = dropBoxManager;
                                        } else {
                                            throw new ayko("Can't skip a field in file");
                                        }
                                    }
                                }
                                dropBoxManager2 = dropBoxManager;
                            }
                        } catch (ayko e7) {
                            dropBoxManager = dropBoxManager2;
                            j = j2;
                            j2 = j;
                            qxq2.mo24383c("BadAwPFile").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                            if (entry != null) {
                                entry.close();
                            }
                            dropBoxManager2 = dropBoxManager;
                        } catch (IOException e8) {
                            dropBoxManager = dropBoxManager2;
                            j = j2;
                            j2 = j;
                            qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                        } catch (Exception e9) {
                            e = e9;
                            j = j2;
                            j2 = j;
                            qxq2.mo24383c("AwPCrash").mo24359a();
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            j = j2;
                            j2 = j;
                            sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                            if (entry != null) {
                                entry.close();
                            }
                            throw th;
                        }
                    } catch (ayko e10) {
                        dropBoxManager = dropBoxManager2;
                        qxq2.mo24383c("BadAwPFile").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                        if (entry != null) {
                        }
                        dropBoxManager2 = dropBoxManager;
                    } catch (IOException e11) {
                        dropBoxManager = dropBoxManager2;
                        qxq2.mo24383c("BadDropBoxEntry").mo24359a();
                        sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                    } catch (Exception e12) {
                        e = e12;
                        qxq2.mo24383c("AwPCrash").mo24359a();
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        sharedPreferences.edit().putLong(":lastRunMsec", j2).apply();
                        if (entry != null) {
                        }
                        throw th;
                    }
                }
            } else {
                Log.i("WestworldAwPOp", "Can't find dropbox");
                qxq2.mo24383c("UploadAwPFailsDropBoxManager").mo24359a();
            }
        }
    }
}
