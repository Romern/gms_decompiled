package com.google.android.gms.common.reshelper;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocaleChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final qws f30299a;

    public LocaleChangedIntentOperation() {
        this.f30299a = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        byte[] byteArrayExtra;
        if (((Boolean) rsv.f43637z.mo25081c()).booleanValue() && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            char c2 = 1;
            if (hashCode != -19011148) {
                if (hashCode == 307286717 && action.equals("com.google.android.gms.common.LEMON_LOG")) {
                    c = 1;
                    if (c == 0) {
                        String language = getResources().getConfiguration().locale.getLanguage();
                        bxvd da = bpve.f139314f.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpve bpve = (bpve) da.f164949b;
                        bpve.f139317b = 1;
                        int i = bpve.f139316a | 1;
                        bpve.f139316a = i;
                        language.getClass();
                        bpve.f139316a = i | 2;
                        bpve.f139318c = language;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        try {
                            if (bqxw.m113733a(getResources(), getPackageName())) {
                                if (bqxw.m113734a(getResources(), language, getPackageName())) {
                                    Context a = bqxx.m113736a(this);
                                    String a2 = bqxw.m113728a(a, bqxw.m113729a(language), a.getPackageCodePath());
                                    String valueOf = String.valueOf(a.getFilesDir());
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                                    sb.append(valueOf);
                                    if (!new File(sb.toString(), a2).exists()) {
                                        bqxw.m113726a(a, getAssets(), language);
                                        c2 = 2;
                                    } else {
                                        c2 = 3;
                                    }
                                } else {
                                    c2 = 4;
                                }
                            }
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (c2 == 2) {
                                int i2 = (int) (uptimeMillis2 - uptimeMillis);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpve bpve2 = (bpve) da.f164949b;
                                bpve2.f139316a |= 4;
                                bpve2.f139319d = i2;
                            }
                            Intent startIntent = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                            if (startIntent != null) {
                                startService(startIntent.putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                            }
                            if (c2 == 2 || c2 == 3) {
                                Log.i("LocaleChangeIO", "Requesting GmsCore restart due to change in locale assets");
                                sendBroadcast(new Intent("com.google.android.gms.common.LANGUAGE_RELOAD").setPackage(getPackageName()).putExtra("lang", language));
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            throw new RuntimeException("Failed to extract language", e);
                        } catch (RuntimeException e2) {
                            String message = e2.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(language).length() + 29 + String.valueOf(message).length());
                            sb2.append("Failed extracting language ");
                            sb2.append(language);
                            sb2.append(": ");
                            sb2.append(message);
                            Log.e("LocaleChangeIO", sb2.toString());
                            if (message != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpve bpve3 = (bpve) da.f164949b;
                                message.getClass();
                                bpve3.f139316a |= 8;
                                bpve3.f139320e = message;
                            }
                            Intent startIntent2 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                            if (startIntent2 != null) {
                                startService(startIntent2.putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            Intent startIntent3 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                            if (startIntent3 != null) {
                                startService(startIntent3.putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                            }
                            throw th;
                        }
                    } else if (c == 1 && (byteArrayExtra = intent.getByteArrayExtra("proto")) != null) {
                        bxvd da2 = bpvf.f139321t.mo74144da();
                        try {
                            bpve bpve4 = (bpve) bxvk.m124016a(bpve.f139314f, byteArrayExtra, bxus.m123744c());
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpvf bpvf = (bpvf) da2.f164949b;
                            bpve4.getClass();
                            bpvf.f139333k = bpve4;
                            bpvf.f139323a |= 64;
                            qws qws = this.f30299a;
                            if (qws == null) {
                                qws = sfa.m35133a().mo25463b(this);
                            }
                            qwo a3 = qws.mo24333a(da2.mo74062i());
                            a3.mo24328b(13);
                            a3.mo24327b();
                            return;
                        } catch (bxwf e3) {
                            Log.w("LocaleChangeIO", "Dropping malformed log event");
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                c = 0;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }

    protected LocaleChangedIntentOperation(qws qws) {
        this.f30299a = qws;
    }
}
