package org.acme;

import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import io.quarkus.test.Mock;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {

    @Mock
    private AudioManager audioManager;

    @InjectMocks
    private VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        volumeUtil.maximizeVolume(100);

        Mockito.verify(audioManager, times(1)).setVolume(100);
    }
}
