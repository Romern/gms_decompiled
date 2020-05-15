package p000;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: bhur */
final /* synthetic */ class bhur implements Runnable {

    /* renamed from: a */
    private final bhux f119650a;

    /* renamed from: b */
    private final bxsz[] f119651b;

    public bhur(bhux bhux, bxsz[] bxszArr) {
        this.f119650a = bhux;
        this.f119651b = bxszArr;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        DataOutputStream dataOutputStream;
        bhux bhux = this.f119650a;
        bxsz[] bxszArr = this.f119651b;
        bhux.f119667c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cggm.m145256b());
        FileOutputStream fileOutputStream5 = null;
        r3 = null;
        FileOutputStream fileOutputStream6 = null;
        try {
            fileOutputStream = new FileOutputStream(bhux.f119671g);
            try {
                dataOutputStream = new DataOutputStream(fileOutputStream);
            } catch (IOException e) {
                fileOutputStream4 = null;
                fileOutputStream5 = fileOutputStream;
                fileOutputStream3 = fileOutputStream4;
                try {
                    bhuj.m101555a().mo64360b("Failed to write model weights to disk");
                    bhux.m101578a(fileOutputStream3);
                    bhux.m101578a(fileOutputStream5);
                    bhux.f119666b = 0;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream5;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream6 = fileOutputStream2;
                    bhux.m101578a(fileOutputStream6);
                    bhux.m101578a(fileOutputStream);
                    bhux.f119666b = 0;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bhux.m101578a(fileOutputStream6);
                bhux.m101578a(fileOutputStream);
                bhux.f119666b = 0;
                throw th;
            }
            try {
                dataOutputStream.write(3);
                dataOutputStream.writeLong(bhux.f119667c);
                dataOutputStream.writeInt(1);
                bxsz bxsz = bxszArr[0];
                int i = ((bxvk) bxsz).f164961ai;
                if (i == -1) {
                    i = bxxm.f165037a.mo74228a(bxsz).mo74223b(bxsz);
                    ((bxvk) bxsz).f164961ai = i;
                }
                byte[] bArr = new byte[i];
                bxsz.mo73644a(bxuk.m123637a(bArr));
                dataOutputStream.writeInt(i);
                dataOutputStream.write(bArr);
                bhux.m101578a(dataOutputStream);
                bhux.m101578a(fileOutputStream);
            } catch (IOException e2) {
                fileOutputStream4 = dataOutputStream;
                fileOutputStream5 = fileOutputStream;
                fileOutputStream3 = fileOutputStream4;
                bhuj.m101555a().mo64360b("Failed to write model weights to disk");
                bhux.m101578a(fileOutputStream3);
                bhux.m101578a(fileOutputStream5);
                bhux.f119666b = 0;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = dataOutputStream;
                fileOutputStream6 = fileOutputStream2;
                bhux.m101578a(fileOutputStream6);
                bhux.m101578a(fileOutputStream);
                bhux.f119666b = 0;
                throw th;
            }
        } catch (IOException e3) {
            fileOutputStream3 = null;
            bhuj.m101555a().mo64360b("Failed to write model weights to disk");
            bhux.m101578a(fileOutputStream3);
            bhux.m101578a(fileOutputStream5);
            bhux.f119666b = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            bhux.m101578a(fileOutputStream6);
            bhux.m101578a(fileOutputStream);
            bhux.f119666b = 0;
            throw th;
        }
        bhux.f119666b = 0;
    }
}
