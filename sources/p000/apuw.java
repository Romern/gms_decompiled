package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: apuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apuw {

    /* renamed from: a */
    private final SimpleDateFormat f84960a;

    /* renamed from: b */
    private final Context f84961b;

    static {
        apuw.class.getSimpleName();
    }

    public apuw(Context context) {
        this.f84961b = context;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateTimeInstance();
        this.f84960a = simpleDateFormat;
        simpleDateFormat.applyPattern("MM-dd HH:mm:ss.SSS");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo47633a(String str) {
        return this.f84960a.parse(str.substring(0, 18)).getTime();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [aqay, apuv]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6 A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* renamed from: a */
    public final Map mo47634a() {
        Long l;
        int i;
        Long l2;
        Iterator it;
        EnumMap enumMap = new EnumMap(aqay.class);
        apuu apuu = new apuu(this);
        try {
            Process exec = Runtime.getRuntime().exec("logcat -d");
            BufferedReader bufferedReader = exec != null ? new BufferedReader(new InputStreamReader(exec.getInputStream())) : null;
            if (bufferedReader == null) {
                return null;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.contains("android.intent.action.SCREEN_OFF")) {
                    if (!readLine.contains("LockScreenReceiver: OFF") && !readLine.contains("DisplayManagerService: Display device changed state: \"Built-in Screen\", OFF")) {
                        if (readLine.contains("ActivityManager") && readLine.contains("START")) {
                            long a = apuu.f84957d.mo47633a(readLine);
                            String str = "";
                            int indexOf = readLine.indexOf("cmp=");
                            if (indexOf != -1) {
                                i = readLine.indexOf(125, indexOf);
                                if (i == -1) {
                                    i = readLine.indexOf(32, indexOf);
                                }
                            } else {
                                i = -1;
                            }
                            if (indexOf != -1) {
                                if (i != -1) {
                                    if (i > indexOf) {
                                        List c = bmyx.m108640a('/').mo66925c((CharSequence) readLine.substring(indexOf, i));
                                        if (c.size() == 2) {
                                            str = ((String) c.get(0)).substring(4);
                                        }
                                    }
                                }
                            }
                            if (!apuu.f84955b.isEmpty()) {
                                l2 = (Long) apuu.f84955b.first();
                                while (true) {
                                    if (l2 == null) {
                                        break;
                                    }
                                    if (l2.longValue() < a - 1000) {
                                        apuu.f84955b.remove(l2);
                                        if (apuu.f84955b.isEmpty()) {
                                            break;
                                        }
                                        l2 = (Long) apuu.f84955b.first();
                                        l2 = (Long) apuu.f84955b.first();
                                    }
                                    break;
                                }
                                it = apuu.f84955b.iterator();
                                while (it.hasNext() && Math.abs(((Long) it.next()).longValue() - a) < 1000) {
                                    apuu.f84957d.mo47635a(str, apuu.f84954a);
                                }
                                if (((long) apuu.f84956c.size()) >= 10) {
                                    apuu.f84956c.put(Long.valueOf(a), str);
                                } else if (((Long) apuu.f84956c.firstKey()).longValue() < a) {
                                    SortedMap sortedMap = apuu.f84956c;
                                    sortedMap.remove(sortedMap.firstKey());
                                    apuu.f84956c.put(Long.valueOf(a), str);
                                }
                            }
                            l2 = null;
                            while (true) {
                                if (l2 == null) {
                                }
                                l2 = (Long) apuu.f84955b.first();
                            }
                            it = apuu.f84955b.iterator();
                            while (it.hasNext()) {
                                apuu.f84957d.mo47635a(str, apuu.f84954a);
                            }
                            if (((long) apuu.f84956c.size()) >= 10) {
                            }
                        }
                    }
                }
                long a2 = apuu.f84957d.mo47633a(readLine);
                if (!apuu.f84955b.isEmpty()) {
                    if (Math.abs(a2 - ((Long) apuu.f84955b.last()).longValue()) > 1000) {
                    }
                }
                apuu.f84954a.f84958a++;
                if (!apuu.f84956c.isEmpty()) {
                    l = (Long) apuu.f84956c.firstKey();
                } else {
                    l = null;
                }
                while (l != null && l.longValue() < a2 - 1000) {
                    apuu.f84956c.remove(l);
                    l = !apuu.f84956c.isEmpty() ? (Long) apuu.f84956c.firstKey() : null;
                }
                while (l != null && Math.abs(l.longValue() - a2) < 1000) {
                    apuu.f84957d.mo47635a((String) apuu.f84956c.get(l), apuu.f84954a);
                    apuu.f84956c.remove(l);
                    l = !apuu.f84956c.isEmpty() ? (Long) apuu.f84956c.firstKey() : null;
                }
                if (((long) apuu.f84955b.size()) < 10) {
                    apuu.f84955b.add(Long.valueOf(a2));
                } else if (((Long) apuu.f84955b.first()).longValue() < a2) {
                    SortedSet sortedSet = apuu.f84955b;
                    sortedSet.remove(sortedSet.first());
                    apuu.f84955b.add(Long.valueOf(a2));
                }
            }
            apuv apuv = apuu.f84954a;
            if (apuv.f84958a > 0 && !apuv.f84959b.isEmpty()) {
                enumMap.put((Object) aqay.NEW_ACTIVITY_AFTER_SCREEN_OFF, (Object) apuu.f84954a);
            }
            return enumMap;
        } catch (IOException e) {
            return null;
        } catch (ParseException e2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47635a(String str, apuv apuv) {
        if (!TextUtils.isEmpty(str)) {
            aput aput = (aput) apuv.f84959b.get(str);
            if (aput == null) {
                aput = new aput();
                byte[] b = apum.m71050b(apum.m71045a(str, this.f84961b));
                if (b != null) {
                    aput.f84952a = b;
                }
                apuv.f84959b.put(str, aput);
            }
            aput.f84953b++;
        }
    }
}
