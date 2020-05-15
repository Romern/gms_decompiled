package p000;

import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: plv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class plv {

    /* renamed from: a */
    static final IntentFilter f39628a;

    /* renamed from: b */
    static final List f39629b;

    /* renamed from: c */
    private static final String[] f39630c = {"android.media.intent.action.PAUSE", "android.media.intent.action.RESUME", "android.media.intent.action.STOP", "android.media.intent.action.SEEK", "android.media.intent.action.GET_STATUS", "android.media.intent.action.START_SESSION", "android.media.intent.action.GET_SESSION_STATUS", "android.media.intent.action.END_SESSION"};

    /* renamed from: d */
    private static final String[] f39631d = {"image/jpeg", "image/jpeg", "image/pjpeg", "image/jpg", "image/webp", "image/png", "image/gif", "image/bmp", "image/vnd.microsoft.icon", "image/x-icon", "image/x-xbitmap", "audio/wav", "audio/x-wav", "audio/mp3", "audio/x-mp3", "audio/x-m4a", "audio/mpeg", "audio/webm", "audio/ogg", "audio/x-matroska", "video/mp4", "video/x-m4v", "video/mp2t", "video/webm", "video/ogg", "video/x-matroska", "application/x-mpegurl", "<item>application/vnd.apple.mpegurl", "application/dash+xml", "application/vnd.ms-sstr+xml"};

    static {
        IntentFilter intentFilter = new IntentFilter();
        f39628a = intentFilter;
        intentFilter.addCategory("com.google.android.gms.cast.CATEGORY_CAST");
        ArrayList arrayList = new ArrayList();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        intentFilter2.addAction("android.media.intent.action.PLAY");
        intentFilter2.addDataScheme("http");
        intentFilter2.addDataScheme("https");
        for (String str : f39631d) {
            m30795a(intentFilter2, str);
        }
        arrayList.add(intentFilter2);
        String[] strArr = f39630c;
        for (String str2 : strArr) {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
            intentFilter3.addAction(str2);
            arrayList.add(intentFilter3);
        }
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addCategory("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK");
        intentFilter4.addAction("com.google.android.gms.cast.ACTION_SYNC_STATUS");
        arrayList.add(intentFilter4);
        f39629b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m30795a(IntentFilter intentFilter, String str) {
        try {
            intentFilter.addDataType(str);
        } catch (IntentFilter.MalformedMimeTypeException e) {
            throw new RuntimeException(e);
        }
    }
}
