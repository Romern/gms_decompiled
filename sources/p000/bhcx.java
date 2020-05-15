package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;

/* renamed from: bhcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcx {
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d A[LOOP:0: B:32:0x0066->B:36:0x006d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f A[EDGE_INSN: B:37:0x006f->B:38:? ?: BREAK  , SYNTHETIC, Splitter:B:37:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[EDGE_INSN: B:44:0x0084->B:45:? ?: BREAK  , SYNTHETIC, Splitter:B:44:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124 A[SYNTHETIC, Splitter:B:68:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0146 A[SYNTHETIC, Splitter:B:71:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0166  */
    /* renamed from: a */
    public static ByteBuffer m100660a(Context context, String str, long j, long j2) {
        FileInputStream fileInputStream;
        AssetFileDescriptor assetFileDescriptor;
        ByteBuffer byteBuffer;
        InputStream inputStream;
        byte[] bArr;
        InputStream open;
        int i;
        int read;
        ByteBuffer allocate;
        int read2;
        int position;
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        InputStream inputStream2 = null;
        r7 = null;
        r7 = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        try {
            assetFileDescriptor = context.getAssets().openFd(str2);
            try {
                fileInputStream = assetFileDescriptor.createInputStream();
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    try {
                        byteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, channel.position(), assetFileDescriptor.getLength());
                        bhcy.m100661a(channel);
                        if (!bhcy.m100661a(fileInputStream)) {
                            bhcy.m100661a(assetFileDescriptor);
                        }
                    } catch (IOException e) {
                        inputStream = channel;
                        bArr = new byte[4096];
                        try {
                            open = context.getAssets().open(str2);
                            i = 0;
                            while (true) {
                                try {
                                    read = open.read(bArr);
                                    if (read != -1) {
                                    }
                                    i += read;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream3 = inputStream;
                                    bhcy.m100661a(inputStream3);
                                    if (!bhcy.m100661a(fileInputStream)) {
                                        bhcy.m100661a(assetFileDescriptor);
                                    }
                                    throw th;
                                }
                            }
                            bhcy.m100661a(open);
                            allocate = ByteBuffer.allocate(i);
                            try {
                                inputStream4 = context.getAssets().open(str2);
                                while (true) {
                                    try {
                                        read2 = inputStream4.read(bArr);
                                        if (read2 != -1) {
                                        }
                                        allocate.put(bArr, 0, read2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                bhcy.m100661a(inputStream4);
                                position = allocate.position();
                                if (position != i) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bhcy.m100661a(inputStream4);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bhcy.m100661a(inputStream2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream3 = channel;
                        bhcy.m100661a(inputStream3);
                        if (!bhcy.m100661a(fileInputStream)) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    inputStream = null;
                    bArr = new byte[4096];
                    open = context.getAssets().open(str2);
                    i = 0;
                    while (true) {
                        read = open.read(bArr);
                        if (read != -1) {
                        }
                        i += read;
                    }
                    bhcy.m100661a(open);
                    allocate = ByteBuffer.allocate(i);
                    inputStream4 = context.getAssets().open(str2);
                    while (true) {
                        read2 = inputStream4.read(bArr);
                        if (read2 != -1) {
                        }
                        allocate.put(bArr, 0, read2);
                    }
                    bhcy.m100661a(inputStream4);
                    position = allocate.position();
                    if (position != i) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bhcy.m100661a(inputStream3);
                    if (!bhcy.m100661a(fileInputStream)) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                fileInputStream = null;
                inputStream = null;
                bArr = new byte[4096];
                open = context.getAssets().open(str2);
                i = 0;
                while (true) {
                    read = open.read(bArr);
                    if (read != -1) {
                    }
                    i += read;
                }
                bhcy.m100661a(open);
                allocate = ByteBuffer.allocate(i);
                inputStream4 = context.getAssets().open(str2);
                while (true) {
                    read2 = inputStream4.read(bArr);
                    if (read2 != -1) {
                    }
                    allocate.put(bArr, 0, read2);
                }
                bhcy.m100661a(inputStream4);
                position = allocate.position();
                if (position != i) {
                }
            } catch (Throwable th7) {
                th = th7;
                fileInputStream = null;
                bhcy.m100661a(inputStream3);
                if (!bhcy.m100661a(fileInputStream)) {
                }
                throw th;
            }
        } catch (IOException e4) {
            assetFileDescriptor = null;
            fileInputStream = null;
            inputStream = null;
            bArr = new byte[4096];
            open = context.getAssets().open(str2);
            i = 0;
            while (true) {
                read = open.read(bArr);
                if (read != -1) {
                    break;
                }
                i += read;
            }
            bhcy.m100661a(open);
            allocate = ByteBuffer.allocate(i);
            inputStream4 = context.getAssets().open(str2);
            while (true) {
                read2 = inputStream4.read(bArr);
                if (read2 != -1) {
                    break;
                }
                allocate.put(bArr, 0, read2);
            }
            bhcy.m100661a(inputStream4);
            position = allocate.position();
            if (position != i) {
                bhcy.m100661a(inputStream);
                if (!bhcy.m100661a(fileInputStream)) {
                    bhcy.m100661a(assetFileDescriptor);
                }
                byteBuffer = allocate;
                if (byteBuffer != null) {
                }
                return byteBuffer;
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Length doesn't match: position=");
            sb.append(position);
            sb.append(", length=");
            sb.append(i);
            throw new IOException(sb.toString());
        } catch (Throwable th8) {
            th = th8;
            assetFileDescriptor = null;
            fileInputStream = null;
            bhcy.m100661a(inputStream3);
            if (!bhcy.m100661a(fileInputStream)) {
            }
            throw th;
        }
        if (byteBuffer != null) {
            if (byteBuffer.getLong(0) == j3) {
                if (j4 != -1) {
                    CRC32 crc32 = new CRC32();
                    if (byteBuffer.hasArray()) {
                        crc32.update(byteBuffer.array());
                    } else {
                        byteBuffer.rewind();
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        crc32.update(bArr2);
                    }
                    if (crc32.getValue() != j4) {
                        long value = crc32.getValue();
                        StringBuilder sb2 = new StringBuilder(58);
                        sb2.append("The checksum: ");
                        sb2.append(value);
                        sb2.append(" != ");
                        sb2.append(j4);
                        throw new IOException(sb2.toString());
                    }
                }
                byteBuffer.rewind();
            } else {
                long j5 = byteBuffer.getLong(0);
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("The version: ");
                sb3.append(j5);
                sb3.append(" != ");
                sb3.append(j3);
                throw new RuntimeException(sb3.toString());
            }
        }
        return byteBuffer;
    }
}
