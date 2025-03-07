#ifndef TEST_H
#define TEST_H

#define TEST_INPUT "./resources/test_folder/input/"
#define TEST_OUTPUT "./resources/test_folder/output/"
#define SHARED_FOLDER "./resources/test_folder/"
#define FILE_PATH_SIZE 200
#define TEST_CHILDREN 5
#define TEST_FREQUENCY 5
#define DELETE_FOLDER_TIME 5
#define TEST_BUFFER_SIZE 5

#include "config.h"

// Test functions for new file checker
void newFileChecker_test(Config config);
// Test functions for copying files
void copyFiles_test(Config config, CircularBuffer *sharedMemory, sem_t *sem_startWorkers, sem_t *sem_startReport, sem_t *sem_sharedmemory_mutex);
// Test functions for reporting files
void reportFile_test(Config config, CircularBuffer *sharedMemory, sem_t *sem_startReport, sem_t *sem_sharedmemory_mutex, sem_t *sem_bufferSize);
void sendWork(HashSet *candidateList, CircularBuffer *sharedMemory, sem_t *sem_sharedmemory_mutex, sem_t *sem_startWorkers);
#endif // TEST_H