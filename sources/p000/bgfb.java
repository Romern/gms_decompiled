package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: bgfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfb {
    /* renamed from: a */
    public static int m98739a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 11:
            default:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
        }
    }

    /* renamed from: a */
    public static int m98740a(bgov bgov) {
        int a = bgou.m99549a(bgov.f116965b);
        if (a == 0) {
            a = 1;
        }
        switch (a) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
            default:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
        }
    }

    /* renamed from: a */
    public static bgoq m98741a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult.f79300a.size() == 0) {
            return null;
        }
        bgop bgop = (bgop) bgoq.f116946f.mo74144da();
        long j = activityRecognitionResult.f79302c;
        if (bgop.f164950c) {
            bgop.mo74035c();
            bgop.f164950c = false;
        }
        bgoq bgoq = (bgoq) bgop.f164949b;
        int i = bgoq.f116948a | 1;
        bgoq.f116948a = i;
        bgoq.f116950c = j;
        long j2 = activityRecognitionResult.f79301b;
        bgoq.f116948a = i | 2;
        bgoq.f116951d = j2;
        for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
            bxvd da = bgov.f116962d.mo74144da();
            int a = m98739a(detectedActivity.mo43513a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgov bgov = (bgov) da.f164949b;
            bgov.f116965b = a;
            int i2 = bgov.f116964a | 1;
            bgov.f116964a = i2;
            int i3 = detectedActivity.f79320e;
            bgov.f116964a = i2 | 2;
            bgov.f116966c = i3;
            bgop.mo63059a((bgov) da.mo74062i());
        }
        if (activityRecognitionResult.mo43493c() != null) {
            Bundle c = activityRecognitionResult.mo43493c();
            for (String str : activityRecognitionResult.mo43493c().keySet()) {
                Object obj = c.get(str);
                if (obj != null) {
                    bxvd da2 = bgos.f116954f.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bgos bgos = (bgos) da2.f164949b;
                    str.getClass();
                    int i4 = bgos.f116956a | 2;
                    bgos.f116956a = i4;
                    bgos.f116960e = str;
                    if (obj instanceof Integer) {
                        int intValue = ((Integer) obj).intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos2 = (bgos) da2.f164949b;
                        bgos2.f116957b = 3;
                        bgos2.f116958c = Integer.valueOf(intValue);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos3 = (bgos) da2.f164949b;
                        bgos3.f116959d = 1;
                        bgos3.f116956a |= 1;
                    } else if (obj instanceof Boolean) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos4 = (bgos) da2.f164949b;
                        bgos4.f116957b = 8;
                        bgos4.f116958c = Boolean.valueOf(booleanValue);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos5 = (bgos) da2.f164949b;
                        bgos5.f116959d = 1;
                        bgos5.f116956a |= 1;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos6 = (bgos) da2.f164949b;
                        bgos6.f116957b = 6;
                        bgos6.f116958c = Double.valueOf(doubleValue);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos7 = (bgos) da2.f164949b;
                        bgos7.f116959d = 1;
                        bgos7.f116956a |= 1;
                    } else if (obj instanceof Float) {
                        float floatValue = ((Float) obj).floatValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos8 = (bgos) da2.f164949b;
                        bgos8.f116957b = 5;
                        bgos8.f116958c = Float.valueOf(floatValue);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos9 = (bgos) da2.f164949b;
                        bgos9.f116959d = 1;
                        bgos9.f116956a |= 1;
                    } else if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos10 = (bgos) da2.f164949b;
                        bgos10.f116957b = 4;
                        bgos10.f116958c = Long.valueOf(longValue);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgos bgos11 = (bgos) da2.f164949b;
                        bgos11.f116959d = 1;
                        bgos11.f116956a |= 1;
                    } else {
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            str2.getClass();
                            bgos.f116957b = 7;
                            bgos.f116958c = str2;
                            bgos.f116959d = 1;
                        } else {
                            bgos.f116959d = 0;
                        }
                        bgos.f116956a = i4 | 1;
                    }
                    if (bgop.f164950c) {
                        bgop.mo74035c();
                        bgop.f164950c = false;
                    }
                    bgoq bgoq2 = (bgoq) bgop.f164949b;
                    bgos bgos12 = (bgos) da2.mo74062i();
                    bgos12.getClass();
                    if (!bgoq2.f116952e.mo73666a()) {
                        bgoq2.f116952e = GeneratedMessageLite.m124021a(bgoq2.f116952e);
                    }
                    bgoq2.f116952e.add(bgos12);
                }
            }
        }
        return (bgoq) bgop.mo74062i();
    }

    /* renamed from: a */
    public static ActivityRecognitionResult m98742a(bgoq bgoq) {
        Bundle bundle;
        int size = bgoq.f116949b.size();
        if (size == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(size);
        bxwc bxwc = bgoq.f116949b;
        int size2 = bxwc.size();
        for (int i = 0; i < size2; i++) {
            bgov bgov = (bgov) bxwc.get(i);
            arrayList.add(new DetectedActivity(m98740a(bgov), bgov.f116966c));
        }
        if (bgoq.f116952e.size() > 0) {
            Bundle bundle2 = new Bundle();
            bxwc bxwc2 = bgoq.f116952e;
            int size3 = bxwc2.size();
            for (int i2 = 0; i2 < size3; i2++) {
                bgos bgos = (bgos) bxwc2.get(i2);
                String str = bgos.f116960e;
                int i3 = bgos.f116957b;
                if (i3 == 3) {
                    bundle2.putInt(str, ((Integer) bgos.f116958c).intValue());
                } else if (i3 == 8) {
                    bundle2.putBoolean(str, ((Boolean) bgos.f116958c).booleanValue());
                } else if (i3 == 6) {
                    bundle2.putDouble(str, ((Double) bgos.f116958c).doubleValue());
                } else if (i3 == 5) {
                    bundle2.putFloat(str, ((Float) bgos.f116958c).floatValue());
                } else if (i3 == 4) {
                    bundle2.putFloat(str, (float) ((Long) bgos.f116958c).longValue());
                } else if (i3 == 7) {
                    bundle2.putString(str, (String) bgos.f116958c);
                }
            }
            bundle = bundle2;
        } else {
            bundle = null;
        }
        return new ActivityRecognitionResult(arrayList, bgoq.f116951d, bgoq.f116950c, bundle);
    }
}
