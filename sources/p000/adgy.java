package p000;

import com.google.android.gms.leveldb.LevelDb;
import java.io.Closeable;
import java.util.NoSuchElementException;

/* renamed from: adgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgy implements Closeable {

    /* renamed from: a */
    private final LevelDb.Iterator f61608a;

    /* renamed from: b */
    private boolean f61609b = false;

    /* renamed from: c */
    private boolean f61610c = false;

    /* renamed from: d */
    private byte[] f61611d;

    /* renamed from: e */
    private boolean f61612e = false;

    /* renamed from: f */
    private byte[] f61613f;

    public adgy(LevelDb.Iterator iterator) {
        this.f61608a = iterator;
    }

    /* renamed from: a */
    public final synchronized byte[] mo33502a() {
        if (this.f61610c) {
        } else {
            throw new NoSuchElementException("isValid must be called first");
        }
        return this.f61611d;
    }

    /* renamed from: b */
    public final synchronized byte[] mo33503b() {
        if (this.f61612e) {
        } else {
            throw new NoSuchElementException("isValid must be called first");
        }
        return this.f61613f;
    }

    /* renamed from: c */
    public final synchronized void mo33504c() {
        this.f61610c = false;
        this.f61612e = false;
        if (!this.f61609b) {
            this.f61608a.seekToFirst();
        }
    }

    public final synchronized void close() {
        if (!this.f61609b) {
            this.f61608a.close();
            this.f61609b = true;
        }
    }

    /* renamed from: d */
    public final synchronized void mo33506d() {
        this.f61610c = false;
        this.f61612e = false;
        if (!this.f61609b) {
            this.f61608a.next();
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo33507e() {
        boolean z;
        if (!this.f61609b) {
            z = this.f61608a.isValid();
            if (z) {
                this.f61610c = true;
                this.f61611d = this.f61608a.key();
                this.f61612e = true;
                this.f61613f = this.f61608a.value();
            }
        } else {
            z = false;
        }
        return z;
    }
}
