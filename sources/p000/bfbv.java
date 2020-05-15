package p000;

import android.util.LruCache;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;
import java.util.HashSet;

/* renamed from: bfbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbv implements bfaf {

    /* renamed from: a */
    public static final String f113342a = bnzi.m110900b().mo68720a("MissingTiles").toString();

    /* renamed from: b */
    public final bfaf f113343b;

    /* renamed from: c */
    public final String f113344c;

    /* renamed from: d */
    public final HashSet f113345d = new HashSet();

    /* renamed from: e */
    public final LruCache f113346e;

    /* renamed from: f */
    public final String f113347f;

    /* renamed from: g */
    public final bfbu f113348g;

    /* renamed from: h */
    public final bezz f113349h;

    /* renamed from: i */
    private final long f113350i;

    /* renamed from: j */
    private final beyg f113351j;

    public bfbv(bfaf bfaf, String str, int i, String str2, bfbu bfbu, beyg beyg, bezz bezz) {
        this.f113343b = bfaf;
        this.f113344c = str;
        this.f113346e = new bfbt(this, i);
        this.f113350i = System.currentTimeMillis();
        this.f113347f = str2;
        this.f113348g = bfbu;
        this.f113351j = beyg;
        this.f113349h = bezz;
    }

    /* renamed from: a */
    public static bnzb m96317a(long j, String str, String str2) {
        bnzc b = bnzi.m110900b();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append(j);
        sb.append(str);
        sb.append(str2);
        return b.mo68720a(sb.toString());
    }

    /* renamed from: b */
    public final Path mo61375b(bnzb bnzb, long j) {
        return Paths.get(this.f113344c, Long.toString(j), bnzb.toString());
    }

    /* renamed from: a */
    public static FileTime m96318a(Path path) {
        try {
            return ((BasicFileAttributeView) Files.getFileAttributeView(path, BasicFileAttributeView.class, new LinkOption[0])).readAttributes().lastAccessTime();
        } catch (IOException e) {
            return FileTime.fromMillis(0);
        }
    }

    /* renamed from: a */
    public final void mo61373a() {
        bxvd da = bpcd.f135716b.mo74144da();
        LruCache lruCache = this.f113346e;
        long j = this.f113350i;
        long currentTimeMillis = System.currentTimeMillis();
        bxvd da2 = bpcc.f135704k.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc = (bpcc) da2.f164949b;
        "BlueskyTileDiskCache".getClass();
        int i = bpcc.f135706a | 1;
        bpcc.f135706a = i;
        bpcc.f135707b = "BlueskyTileDiskCache";
        "LRU".getClass();
        bpcc.f135706a = i | 2;
        bpcc.f135708c = "LRU";
        int maxSize = lruCache.maxSize();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc2 = (bpcc) da2.f164949b;
        bpcc2.f135706a |= 128;
        bpcc2.f135714i = maxSize;
        int size = lruCache.size();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc3 = (bpcc) da2.f164949b;
        bpcc3.f135706a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpcc3.f135715j = size;
        int hitCount = lruCache.hitCount();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc4 = (bpcc) da2.f164949b;
        bpcc4.f135706a |= 32;
        bpcc4.f135712g = hitCount;
        int hitCount2 = lruCache.hitCount() + lruCache.missCount();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc5 = (bpcc) da2.f164949b;
        bpcc5.f135706a |= 16;
        bpcc5.f135711f = hitCount2;
        int putCount = lruCache.putCount();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcc bpcc6 = (bpcc) da2.f164949b;
        int i2 = bpcc6.f135706a | 64;
        bpcc6.f135706a = i2;
        bpcc6.f135713h = putCount;
        int i3 = i2 | 4;
        bpcc6.f135706a = i3;
        bpcc6.f135709d = j;
        bpcc6.f135706a = i3 | 8;
        bpcc6.f135710e = currentTimeMillis;
        bpcc bpcc7 = (bpcc) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcd bpcd = (bpcd) da.f164949b;
        bpcc7.getClass();
        if (!bpcd.f135718a.mo73666a()) {
            bpcd.f135718a = GeneratedMessageLite.m124021a(bpcd.f135718a);
        }
        bpcd.f135718a.add(bpcc7);
        qws qws = this.f113351j.f113009a;
        int i4 = beyv.f113032z;
        qws.mo24333a((bpcd) da.mo74062i()).mo24327b();
    }

    /* renamed from: a */
    public final void mo61374a(bnzb bnzb, long j) {
        try {
            Files.delete(mo61375b(bnzb, j));
        } catch (IOException e) {
        }
    }
}
