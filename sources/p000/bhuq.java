package p000;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;

/* renamed from: bhuq */
final /* synthetic */ class bhuq implements Runnable {

    /* renamed from: a */
    private final bhux f119649a;

    public bhuq(bhux bhux) {
        this.f119649a = bhux;
    }

    public final void run() {
        bhux bhux = this.f119649a;
        bhux.f119667c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cggm.m145256b());
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(bhux.f119671g, "rw");
            try {
                randomAccessFile2.seek(1);
                randomAccessFile2.writeLong(bhux.f119667c);
                bhux.m101578a(randomAccessFile2);
            } catch (IOException e) {
                randomAccessFile = randomAccessFile2;
                try {
                    bhuj.m101555a().mo64360b("Failed to update ttl");
                    bhux.m101578a(randomAccessFile);
                    bhux.f119666b = 0;
                } catch (Throwable th) {
                    th = th;
                    bhux.m101578a(randomAccessFile);
                    bhux.f119666b = 0;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                bhux.m101578a(randomAccessFile);
                bhux.f119666b = 0;
                throw th;
            }
        } catch (IOException e2) {
            bhuj.m101555a().mo64360b("Failed to update ttl");
            bhux.m101578a(randomAccessFile);
            bhux.f119666b = 0;
        } catch (Throwable th3) {
            th = th3;
            bhux.m101578a(randomAccessFile);
            bhux.f119666b = 0;
            throw th;
        }
        bhux.f119666b = 0;
    }
}
