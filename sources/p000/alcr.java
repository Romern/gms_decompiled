package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: alcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcr implements Parcelable.Creator {

    /* renamed from: a */
    private final Parcelable.Creator f73480a;

    public alcr(Parcelable.Creator creator) {
        this.f73480a = creator;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (SafeParcelable[]) this.f73480a.newArray(i);
    }

    /* renamed from: a */
    public static void m60863a(SafeParcelable safeParcelable, Parcel parcel, alcq alcq) {
        Parcel obtain = Parcel.obtain();
        try {
            alcq.mo34935a(safeParcelable, obtain);
            byte[] marshall = obtain.marshall();
            File createTempFile = File.createTempFile("teleporter", ".tmp", null);
            RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
            randomAccessFile.write(marshall);
            randomAccessFile.seek(0);
            createTempFile.delete();
            parcel.writeFileDescriptor(randomAccessFile.getFD());
            randomAccessFile.close();
            obtain.recycle();
        } catch (IOException e) {
            throw new alcs("Couldn't write SafeParcelable to unlinked file.", e);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor readFileDescriptor = parcel.readFileDescriptor();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(readFileDescriptor));
            int available = dataInputStream.available();
            byte[] bArr = new byte[available];
            dataInputStream.read(bArr);
            dataInputStream.close();
            readFileDescriptor.close();
            Parcelable.Creator creator = this.f73480a;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, available);
                obtain.setDataPosition(0);
                Object createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
                return (SafeParcelable) createFromParcel;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (IOException e) {
            throw new alcs("Couldn't read from unlinked file.", e);
        }
    }
}
