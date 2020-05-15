package p000;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: boaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boaf {
    static {
        m110965a("http", "https", "mailto", "ftp");
        m110965a("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");
        Collections.emptySet();
    }

    /* renamed from: a */
    public static boad m110964a(boae boae) {
        return new boad(boae.f132448a);
    }

    /* renamed from: a */
    private static final void m110965a(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        Collections.unmodifiableSet(hashSet);
    }
}
