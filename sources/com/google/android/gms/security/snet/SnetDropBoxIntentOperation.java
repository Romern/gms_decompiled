package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.DropBoxManager;
import com.google.android.chimera.IntentOperation;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetDropBoxIntentOperation extends IntentOperation {

    /* renamed from: a */
    static String f107570a = "network_watchlist_report";

    /* renamed from: b */
    private apgy f107571b;

    /* renamed from: c */
    private List f107572c = null;

    public final void onCreate() {
        this.f107571b = new apgy(this);
    }

    public final void onHandleIntent(Intent intent) {
        DropBoxManager dropBoxManager;
        apyq apyq;
        BufferedOutputStream bufferedOutputStream;
        DropBoxManager.Entry nextEntry;
        InputStream inputStream;
        byte[] bArr;
        if (cgkt.m145930b() && intent != null) {
            if (!this.f107571b.mo47201a() && !cgkt.m145938j()) {
                return;
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                apyk apyk = new apyk(this);
                long currentTimeMillis = System.currentTimeMillis();
                long j = apyk.f85144b.getLong("snet_last_dropbox_read_time_ms", 0);
                if (currentTimeMillis >= j && (dropBoxManager = (DropBoxManager) getSystemService("dropbox")) != null) {
                    while (j < currentTimeMillis) {
                        try {
                            nextEntry = dropBoxManager.getNextEntry(null, j);
                            if (nextEntry == null) {
                                break;
                            }
                            long timeMillis = nextEntry.getTimeMillis();
                            if (this.f107572c == null) {
                                this.f107572c = Arrays.asList(f107570a.split(","));
                            }
                            if (this.f107572c.contains(nextEntry.getTag())) {
                                try {
                                    aqat aqat = aqat.f85474a;
                                    bxvd da = apyp.f85168e.mo74144da();
                                    long timeMillis2 = nextEntry.getTimeMillis();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    apyp apyp = (apyp) da.f164949b;
                                    apyp.f85170a |= 1;
                                    apyp.f85171b = timeMillis2;
                                    String tag = nextEntry.getTag();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    apyp apyp2 = (apyp) da.f164949b;
                                    tag.getClass();
                                    apyp2.f85170a |= 2;
                                    apyp2.f85172c = tag;
                                    inputStream = nextEntry.getInputStream();
                                    if (inputStream == null) {
                                        bArr = new byte[0];
                                    } else {
                                        byte[] bArr2 = new byte[81920];
                                        int i = 0;
                                        int i2 = 0;
                                        while (i >= 0) {
                                            i2 += i;
                                            if (i2 >= 81920) {
                                                break;
                                            }
                                            i = inputStream.read(bArr2, i2, 81920 - i2);
                                        }
                                        if (i2 < 81920) {
                                            byte[] copyOf = Arrays.copyOf(bArr2, i2);
                                            inputStream.close();
                                            bArr = copyOf;
                                        } else {
                                            inputStream.close();
                                            bArr = bArr2;
                                        }
                                    }
                                    bxtx a = bxtx.m123261a(bArr);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    apyp apyp3 = (apyp) da.f164949b;
                                    a.getClass();
                                    apyp3.f85170a |= 4;
                                    apyp3.f85173d = a;
                                    apyp apyp4 = (apyp) da.mo74062i();
                                    bxvd da2 = apyo.f85164c.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    apyo apyo = (apyo) da2.f164949b;
                                    apyp4.getClass();
                                    apyo.f85167b = apyp4;
                                    apyo.f85166a |= 1;
                                    aqat.f85476c.add((apyo) da2.mo74062i());
                                } catch (IOException e) {
                                } catch (Throwable th) {
                                    bqye.m113761a(th, th);
                                }
                            }
                            nextEntry.close();
                            j = timeMillis;
                        } catch (RuntimeException | SecurityException e2) {
                        } catch (Throwable th2) {
                            bqye.m113761a(th, th2);
                        }
                    }
                    aqat aqat2 = aqat.f85474a;
                    if (!aqat2.f85476c.isEmpty()) {
                        synchronized (aqat2.f85475b) {
                            try {
                                apyq = aqat2.mo47723a(aqat2.mo47724a(this));
                            } catch (IOException e3) {
                                apyq = apyq.f85174b;
                            }
                            apyq a2 = aqat2.mo47722a(apyq);
                            int i3 = a2.f164961ai;
                            if (i3 == -1) {
                                i3 = bxxm.f165037a.mo74228a(a2).mo74223b(a2);
                                a2.f164961ai = i3;
                            }
                            if (((long) i3) <= apum.f84929b) {
                                apyq = a2;
                            }
                            File file = new File(String.valueOf(getApplicationInfo().dataDir).concat("/snet"));
                            if (!file.exists()) {
                                if (!file.mkdir()) {
                                }
                            }
                            try {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "cachedlogs")));
                                bufferedOutputStream.write(apyq.mo73642k());
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                            } catch (Throwable th3) {
                                bqye.m113761a(th, th3);
                            }
                        }
                    }
                    apyk.m71178a(apyk.f85144b, "snet_last_dropbox_read_time_ms", currentTimeMillis);
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
        throw th;
    }
}
