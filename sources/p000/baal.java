package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.zip.CRC32;

/* renamed from: baal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baal implements Runnable {

    /* renamed from: a */
    final /* synthetic */ baam f100371a;

    public baal(baam baam) {
        this.f100371a = baam;
    }

    public final void run() {
        int length;
        bqgg bqgg = this.f100371a.f100375d.f101581d;
        if (bqgg == null) {
            ((acdc) this.f100371a.f100377f.mo16713a()).mo32707a("MDH FutureCoalescer missing result failure", new IllegalStateException());
            return;
        }
        try {
            bygw bygw = (bygw) bqga.m112780a((Future) bqgg);
            try {
                baaw baaw = this.f100371a.f100374c;
                synchronized (baaw.f100401e) {
                    String[] a = baaw.mo55552a();
                    if (a == null) {
                        if (!baaw.f100398b.mkdirs()) {
                            String valueOf = String.valueOf(baaw.f100398b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                            sb.append("directory ");
                            sb.append(valueOf);
                            sb.append(" did not exist and I couldn't create it.");
                            throw new FileNotFoundException(sb.toString());
                        }
                    }
                    long j = 0;
                    if (a != null && (length = a.length) > 0) {
                        String str = a[length - 1];
                        Matcher matcher = baaw.f100400d.matcher(str);
                        if (matcher.matches()) {
                            j = Long.parseLong(matcher.group(1), 16) + 1;
                        } else {
                            ((achw) baaw.f100397a.mo16713a()).mo25416d("filename %s failed pattern %s", str, baaw.f100400d.toString());
                            throw new RuntimeException("filename should have passed through StoredFilesFilter!?");
                        }
                    }
                    String format = String.format("%s_%016X", baaw.f100399c, Long.valueOf(j));
                    baqt baqt = baaw.f100396f;
                    ByteBuffer allocate = ByteBuffer.allocate(baqu.m87416a(bygw));
                    int position = allocate.position() + baqu.m87416a(bygw);
                    if (allocate.capacity() < position) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(position);
                        allocate2.order(allocate.order());
                        allocate.flip();
                        allocate2.put(allocate);
                        allocate = allocate2;
                    }
                    int position2 = allocate.position();
                    allocate.putInt(0);
                    int position3 = allocate.position();
                    bxuk a2 = bxuk.m123636a(allocate);
                    bygw.mo73644a(a2);
                    a2.mo73851c();
                    int position4 = allocate.position() - position3;
                    allocate.putInt(position2, position4);
                    byte[] array = allocate.array();
                    int arrayOffset = allocate.arrayOffset() + position3;
                    CRC32 crc32 = new CRC32();
                    crc32.update(array, arrayOffset, position4);
                    allocate.putLong(crc32.getValue());
                    allocate.flip();
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(baaw.f100398b, format));
                    try {
                        fileOutputStream.getChannel().write(allocate);
                        fileOutputStream.close();
                        baaw.mo55551a(10);
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                return;
            } catch (IOException e) {
                ((achw) this.f100371a.f100373b.mo16713a()).mo25418e("Channel config write failed.", new Object[0]);
                ((acdc) this.f100371a.f100377f.mo16713a()).mo32707a("MDH channel config write failure", e);
                return;
            }
        } catch (ExecutionException e2) {
            ((acdc) this.f100371a.f100377f.mo16713a()).mo32707a("MDH channel config retrieval failure", e2);
            return;
        }
        throw th;
    }
}
