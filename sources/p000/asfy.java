package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: asfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfy extends asen {
    public asfy() {
        super("Netstats", "netstats", "NETSTATS", false);
    }

    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(31);
        sb.append("--duration=");
        sb.append(j2 - j);
        return new String[]{"detail", sb.toString()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a0 A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a1 A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03bc A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03c4 A[SYNTHETIC] */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        bork bork;
        calu calu;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        borf borf;
        bord bord;
        long j3 = j;
        asga asga = new asga(context.getPackageManager());
        boolean z = true;
        boolean z2 = false;
        try {
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
            asfz asfz = new asfz();
            synchronized (asga.f88888b) {
                while (true) {
                    String readLine = bufferedReader3.readLine();
                    if (readLine == null) {
                        break;
                    }
                    asgb asgb = asga.f88888b.f88900h;
                    asgb.mo49146c(readLine);
                    if (asgb.mo49144a()) {
                        asfz.mo49142b();
                        asfz.f88883c = z;
                        asfz.f88884d = z2;
                    } else {
                        asgb asgb2 = asga.f88888b.f88901i;
                        asgb2.mo49146c(readLine);
                        if (asgb2.mo49144a()) {
                            asfz.mo49142b();
                            asfz.f88883c = z2;
                            asfz.f88884d = z;
                        } else if (asfz.f88883c || asfz.f88884d) {
                            asgb asgb3 = asga.f88888b.f88896d;
                            asgb3.mo49146c(readLine);
                            if (!asgb3.mo49144a()) {
                                asgb asgb4 = asga.f88888b.f88898f;
                                asgb4.mo49146c(readLine);
                                if (asgb4.mo49144a()) {
                                    Integer num = (Integer) asfz.f88885e.first;
                                    borf borf2 = (borf) asfz.f88885e.second;
                                    bxvd bxvd = (bxvd) borf2.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) borf2);
                                    long a = asga.f88888b.mo49147a(Long.parseLong(asgb4.mo49145b("duration")));
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = z2;
                                    }
                                    borf borf3 = (borf) bxvd.f164949b;
                                    borf borf4 = borf.f134398h;
                                    borf3.f134400a |= 8;
                                    borf3.f134406g = a;
                                    asfz.f88885e = Pair.create(num, (borf) bxvd.mo74062i());
                                } else {
                                    asgb asgb5 = asga.f88888b.f88899g;
                                    asgb5.mo49146c(readLine);
                                    if (asgb5.mo49144a()) {
                                        bxvd da = bord.f134384h.mo74144da();
                                        long a2 = asga.f88888b.mo49147a(Long.parseLong(asgb5.mo49145b("start")));
                                        if (a2 - 1 >= j3) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z2;
                                            }
                                            bord bord2 = (bord) da.f164949b;
                                            bord2.f134386a = bord2.f134386a | z ? 1 : 0;
                                            bord2.f134387b = a2;
                                            long parseLong = Long.parseLong(asgb5.mo49145b("rxBytes"));
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z2;
                                            }
                                            bord bord3 = (bord) da.f164949b;
                                            bord3.f134386a |= 2;
                                            bord3.f134388c = parseLong;
                                            long parseLong2 = Long.parseLong(asgb5.mo49145b("rxPackets"));
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z2;
                                            }
                                            bord bord4 = (bord) da.f164949b;
                                            bord4.f134386a |= 4;
                                            bord4.f134389d = parseLong2;
                                            long parseLong3 = Long.parseLong(asgb5.mo49145b("txBytes"));
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z2;
                                            }
                                            bord bord5 = (bord) da.f164949b;
                                            bord5.f134386a |= 8;
                                            bord5.f134390e = parseLong3;
                                            long parseLong4 = Long.parseLong(asgb5.mo49145b("txPackets"));
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = z2;
                                            }
                                            bord bord6 = (bord) da.f164949b;
                                            bord6.f134386a |= 16;
                                            bord6.f134391f = parseLong4;
                                            String b = asgb5.mo49145b("operations");
                                            if (b != null) {
                                                long parseLong5 = Long.parseLong(b);
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = z2;
                                                }
                                                bord bord7 = (bord) da.f164949b;
                                                bord7.f134386a |= 32;
                                                bord7.f134392g = parseLong5;
                                            }
                                            bord = (bord) da.mo74062i();
                                        } else {
                                            bord = null;
                                        }
                                        if (bord != null) {
                                            asfz.f88886f.add(bord);
                                        }
                                    }
                                }
                            } else {
                                asfz.mo49142b();
                                bxvd da2 = borf.f134398h.mo74144da();
                                asgd asgd = asga.f88888b;
                                String b2 = asgb3.mo49145b("idents");
                                asgb asgb6 = asgd.f88897e;
                                asgb6.mo49146c(b2);
                                ArrayList arrayList = new ArrayList();
                                while (asgb6.f88890b.find()) {
                                    BufferedReader bufferedReader4 = bufferedReader3;
                                    bxvd da3 = bori.f134413f.mo74144da();
                                    String b3 = asgb6.mo49145b("type");
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bori bori = (bori) da3.f164949b;
                                    b3.getClass();
                                    bori.f134415a |= 2;
                                    bori.f134416b = b3;
                                    String b4 = asgb6.mo49145b("subtype");
                                    if (b4 != null) {
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bori bori2 = (bori) da3.f164949b;
                                        b4.getClass();
                                        bori2.f134415a |= 8;
                                        bori2.f134417c = b4;
                                    }
                                    String b5 = asgb6.mo49145b("subscriberId");
                                    if (b5 != null) {
                                        String substring = b5.substring(0, Math.min(6, b5.length()));
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bori bori3 = (bori) da3.f164949b;
                                        substring.getClass();
                                        bori3.f134415a |= 16;
                                        bori3.f134418d = substring;
                                    }
                                    if (asgb6.mo49145b("roaming") != null) {
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bori bori4 = (bori) da3.f164949b;
                                        bori4.f134415a |= 32;
                                        bori4.f134419e = true;
                                    }
                                    arrayList.add((bori) da3.mo74062i());
                                    bufferedReader3 = bufferedReader4;
                                    z = true;
                                    z2 = false;
                                }
                                List asList = Arrays.asList((bori[]) arrayList.toArray(new bori[arrayList.size()]));
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = z2;
                                }
                                borf borf5 = (borf) da2.f164949b;
                                if (!borf5.f134401b.mo73666a()) {
                                    borf5.f134401b = GeneratedMessageLite.m124021a(borf5.f134401b);
                                }
                                bxsy.m123078a(asList, borf5.f134401b);
                                String b6 = asgb3.mo49145b("set");
                                if (b6 != null) {
                                    asgb asgb7 = asga.f88888b.f88902j;
                                    asgb7.mo49146c(b6);
                                    if (!asgb7.mo49144a()) {
                                        asgb asgb8 = asga.f88888b.f88903k;
                                        asgb8.mo49146c(b6);
                                        if (!asgb8.mo49144a()) {
                                            asgb asgb9 = asga.f88888b.f88904l;
                                            asgb9.mo49146c(b6);
                                            if (!asgb9.mo49144a()) {
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = z2;
                                                }
                                                borf borf6 = (borf) da2.f164949b;
                                                borf6.f134404e = z2 ? 1 : 0;
                                                borf6.f134400a |= 2;
                                                asgd asgd2 = asga.f88888b;
                                                asgb asgb10 = asgd2.f88905m;
                                                asgb10.mo49146c(b6);
                                                if (!asgb10.mo49144a()) {
                                                    asgb asgb11 = asgd2.f88906n;
                                                    asgb11.mo49146c(b6);
                                                    if (!asgb11.mo49144a()) {
                                                        Log.w("NetstatsParser", b6.length() == 0 ? new String("Unknown set: ") : "Unknown set: ".concat(b6));
                                                    }
                                                }
                                            } else {
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = z2;
                                                }
                                                borf borf7 = (borf) da2.f164949b;
                                                borf7.f134404e = 3;
                                                borf7.f134400a |= 2;
                                            }
                                        } else {
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = z2;
                                            }
                                            borf borf8 = (borf) da2.f164949b;
                                            borf8.f134404e = 2;
                                            borf8.f134400a |= 2;
                                        }
                                    } else {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = z2;
                                        }
                                        borf borf9 = (borf) da2.f164949b;
                                        borf9.f134404e = z ? 1 : 0;
                                        borf9.f134400a |= 2;
                                    }
                                }
                                String b7 = asgb3.mo49145b("tag");
                                if (b7 != null) {
                                    long intValue = (long) new BigInteger(b7, asga.f88888b.f88907o).intValue();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = z2;
                                    }
                                    borf borf10 = (borf) da2.f164949b;
                                    borf10.f134400a |= 4;
                                    borf10.f134405f = intValue;
                                }
                                int parseInt = Integer.parseInt(asgb3.mo49145b("uid"));
                                PackageManager packageManager = asga.f88887a;
                                if (packageManager == null) {
                                    bufferedReader = bufferedReader3;
                                } else {
                                    String[] packagesForUid = packageManager.getPackagesForUid(parseInt);
                                    if (packagesForUid == null) {
                                        bufferedReader = bufferedReader3;
                                    } else {
                                        int length = packagesForUid.length;
                                        int i = 0;
                                        while (i < length) {
                                            String str = packagesForUid[i];
                                            bxvd da4 = bore.f134393d.mo74144da();
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            bore bore = (bore) da4.f164949b;
                                            str.getClass();
                                            String[] strArr = packagesForUid;
                                            bore.f134395a |= 1;
                                            bore.f134396b = str;
                                            try {
                                                int i2 = asga.f88887a.getPackageInfo(str, 0).versionCode;
                                                if (da4.f164950c) {
                                                    da4.mo74035c();
                                                    da4.f164950c = false;
                                                }
                                                bore bore2 = (bore) da4.f164949b;
                                                bufferedReader2 = bufferedReader3;
                                                try {
                                                    bore2.f134395a |= 2;
                                                    bore2.f134397c = i2;
                                                } catch (PackageManager.NameNotFoundException e) {
                                                    e = e;
                                                }
                                            } catch (PackageManager.NameNotFoundException e2) {
                                                e = e2;
                                                bufferedReader2 = bufferedReader3;
                                                String valueOf = String.valueOf(e);
                                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(valueOf).length());
                                                sb.append("Package ");
                                                sb.append(str);
                                                sb.append(" not found: ");
                                                sb.append(valueOf);
                                                Log.w("NetstatsParser", sb.toString());
                                                if (!da2.f164950c) {
                                                }
                                                borf = (borf) da2.f164949b;
                                                bore bore3 = (bore) da4.mo74062i();
                                                bore3.getClass();
                                                if (borf.f134402c.mo73666a()) {
                                                }
                                                borf.f134402c.add(bore3);
                                                i++;
                                                packagesForUid = strArr;
                                                bufferedReader3 = bufferedReader2;
                                            }
                                            if (!da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            borf = (borf) da2.f164949b;
                                            bore bore32 = (bore) da4.mo74062i();
                                            bore32.getClass();
                                            if (borf.f134402c.mo73666a()) {
                                                borf.f134402c = GeneratedMessageLite.m124021a(borf.f134402c);
                                            }
                                            borf.f134402c.add(bore32);
                                            i++;
                                            packagesForUid = strArr;
                                            bufferedReader3 = bufferedReader2;
                                        }
                                        bufferedReader = bufferedReader3;
                                    }
                                    String nameForUid = asga.f88887a.getNameForUid(parseInt);
                                    if (!TextUtils.isEmpty(nameForUid)) {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        borf borf11 = (borf) da2.f164949b;
                                        nameForUid.getClass();
                                        borf11.f134400a |= 1;
                                        borf11.f134403d = nameForUid;
                                    }
                                }
                                asfz.f88885e = Pair.create(Integer.valueOf(parseInt), (borf) da2.mo74062i());
                                bufferedReader3 = bufferedReader;
                                z = true;
                                z2 = false;
                            }
                        }
                    }
                }
                calu = (calu) calx.f175201v.mo74144da();
                if (calu.f164950c) {
                    calu.mo74035c();
                    calu.f164950c = false;
                }
                calx calx = (calx) calu.f164949b;
                int i3 = calx.f175203a | 1;
                calx.f175203a = i3;
                calx.f175206d = j3;
                int i4 = 2 | i3;
                calx.f175203a = i4;
                calx.f175207e = j2;
                bork.getClass();
                calx.f175221s = bork;
                calx.f175203a = i4 | 8388608;
                calx calx2 = (calx) calu.mo74062i();
                srz.m36171a((Closeable) inputStream);
                return calx2;
            }
            asfz.mo49142b();
            bxvd da5 = bork.f134421e.mo74144da();
            int size = asfz.f88881a.size();
            for (int i5 = 0; i5 < size; i5++) {
                borg borg = (borg) ((Pair) asfz.f88881a.get(i5)).second;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bork bork2 = (bork) da5.f164949b;
                borg.getClass();
                if (!bork2.f134424b.mo73666a()) {
                    bork2.f134424b = GeneratedMessageLite.m124021a(bork2.f134424b);
                }
                bork2.f134424b.add(borg);
            }
            int size2 = asfz.f88882b.size();
            for (int i6 = 0; i6 < size2; i6++) {
                borg borg2 = (borg) ((Pair) asfz.f88882b.get(i6)).second;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bork bork3 = (bork) da5.f164949b;
                borg2.getClass();
                if (!bork3.f134425c.mo73666a()) {
                    bork3.f134425c = GeneratedMessageLite.m124021a(bork3.f134425c);
                }
                bork3.f134425c.add(borg2);
            }
            bork = (bork) da5.mo74062i();
        } catch (IOException e3) {
            Log.w("NetstatsParser", e3);
            bxvd da6 = bork.f134421e.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bork bork4 = (bork) da6.f164949b;
            bork4.f134426d = 3;
            bork4.f134423a |= 4;
            bork = (bork) da6.mo74062i();
        } catch (NumberFormatException e4) {
            Log.w("NetstatsParser", e4);
            bxvd da7 = bork.f134421e.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bork bork5 = (bork) da7.f164949b;
            bork5.f134426d = 4;
            bork5.f134423a = 4 | bork5.f134423a;
            bork = (bork) da7.mo74062i();
        } catch (Exception e5) {
            Log.e("NetstatsParser", "Unexpected Exception", e5);
            bxvd da8 = bork.f134421e.mo74144da();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bork bork6 = (bork) da8.f164949b;
            bork6.f134426d = 1;
            bork6.f134423a |= 4;
            bork = (bork) da8.mo74062i();
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
        calu = (calu) calx.f175201v.mo74144da();
        if (calu.f164950c) {
        }
        calx calx3 = (calx) calu.f164949b;
        int i32 = calx3.f175203a | 1;
        calx3.f175203a = i32;
        calx3.f175206d = j3;
        int i42 = 2 | i32;
        calx3.f175203a = i42;
        calx3.f175207e = j2;
        bork.getClass();
        calx3.f175221s = bork;
        calx3.f175203a = i42 | 8388608;
        calx calx22 = (calx) calu.mo74062i();
        srz.m36171a((Closeable) inputStream);
        return calx22;
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgta.f187697a.mo6606a().mo84448g();
    }

    /* renamed from: d */
    public final long mo49095d() {
        return cgta.f187697a.mo6606a().mo84447f();
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        return cgsf.f187633a.mo6606a().mo84392h();
    }
}
