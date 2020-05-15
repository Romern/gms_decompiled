package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.at */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0622at {

    /* renamed from: a */
    private static final Map f8937a = new HashMap();

    /* renamed from: b */
    private static List f8938b;

    /* renamed from: c */
    private static final Object f8939c = new Object();

    /* renamed from: a */
    public static List m5623a(String str) {
        synchronized (f8939c) {
            if (f8937a.containsKey(str)) {
                List list = (List) f8937a.get(str);
                return list;
            }
            try {
                synchronized (f8939c) {
                    if (f8938b == null) {
                        int i = Build.VERSION.SDK_INT;
                        f8938b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f8938b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        int i2 = Build.VERSION.SDK_INT;
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        hashMap.put("bitRatesBps", m5624a(videoCapabilities.getBitrateRange()));
                        hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                        hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                        hashMap.put("frameRates", m5624a(videoCapabilities.getSupportedFrameRates()));
                        hashMap.put("widths", m5624a(videoCapabilities.getSupportedWidths()));
                        hashMap.put("heights", m5624a(videoCapabilities.getSupportedHeights()));
                        int i3 = Build.VERSION.SDK_INT;
                        hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        arrayList.add(hashMap);
                    }
                }
                f8937a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f8937a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    /* renamed from: a */
    private static Integer[] m5624a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
